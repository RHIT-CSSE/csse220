package rhit;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.FileVisitOption;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.time.Instant;
import java.util.Date;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;
import org.yaml.snakeyaml.Yaml;

public final class FileToolCli {
  private static final String GRADESCOPE_METADATA_FILE = "submission_metadata.yml";
  private static final String OUTPUT_DIR_FORMAT = "submission_%s";
  private static final String NAME_FIELD = ":name";
  private static final String EMAIL_FIELD = ":email";
  private static final String DEFAULT_NAME = "Unknown";
  private static final String ELLIPSIS = "...";
  private static final String NEW_LINE = "\n";
  private static final String SEPARATOR = "-------------------------------------------";
  private static final int MAX_DIR_DEPTH = 20;

  private boolean isAnonymous;

  FileToolCli() {
    isAnonymous = true;
  }

  FileToolCli(String[] args) {
    if (args.length != 3 && args.length != 4) {
      throw new IllegalArgumentException(PropertiesLoader.get("argumentsHint"));
    }

    File masterDir = new File(args[0]);
    File studentSubmissionDir = new File(args[1]);
    File outputDir = new File(args[2]);
    isAnonymous = args.length != 4 || Boolean.parseBoolean(args[3]);

    doGenerate(masterDir, studentSubmissionDir, outputDir, System.out);
  }

  private static Path pathAppend(Path source, String addition) {
    return source.resolve(Paths.get(addition));
  }

  private void copyDirTree(Path source, FileVisitor<Path> tc) throws IOException {
    EnumSet<FileVisitOption> opts = EnumSet.of(FileVisitOption.FOLLOW_LINKS);
    try {
      Files.walkFileTree(source, opts, MAX_DIR_DEPTH, tc);
    } catch (Exception e) {
      throw new IOException(PropertiesLoader.get("directoryTreeCopyError"), e);
    }
  }

  /**
   * Adapted file tool for Gradescope exports. Reads the submission_metadata.yml file and renames
   * the folders to the student's name and id
   */
  HashSet<String> copyFolders(File dir, File outputDir, PrintStream output,
      OutputDirectoryHandler copier) {
    output.println(PropertiesLoader.get("dataFileFound") + ELLIPSIS);

    Map<String, Object> metadata = parseMetadata(dir);
    HashSet<String> failed = new HashSet<>();
    AtomicInteger index = new AtomicInteger(0);
    int size = metadata.size();

    getSubmissionsStreamByDate(metadata).forEach((entry) -> {
      Map<String, Object> userData = getUserData(entry, output);
      if (userData == null) {
        return;
      }

      String name = getSubmissionName(userData, entry.getKey(), output);
      String sid = getStudentId(userData, output);
      String id = getSubmissionId(entry.getKey(), output);
      String outputDirRelative =
          generateOutputDirName(index.incrementAndGet(), size, id, sid, name);

      if (!performCopy(dir, outputDirRelative, id, name, outputDir, copier, output, failed)) {
        return;
      }
      output.printf(PropertiesLoader.get("fileCopySuccess") + NEW_LINE, id, outputDirRelative);
    });

    return failed;
  }

  private Map<String, Object> parseMetadata(File dir) {
    Yaml yaml = new Yaml();
    File file = new File(dir, GRADESCOPE_METADATA_FILE);
    Map<String, Object> o;

    try (FileInputStream stream = new FileInputStream(file)) {
      o = yaml.load(stream);
      if (o == null) {
        throw new IOException();
      }
    } catch (IOException e) {
      throw new RuntimeException(PropertiesLoader.get("submissionDataNull"));
    }

    return o;
  }

  private Stream<Entry<String, Object>> getSubmissionsStreamByDate(Map<String, Object> metadata) {
    return metadata.entrySet().stream()
        .sorted((a, b) -> parseDate(castToMap(a.getValue()).get(":created_at"))
            .compareTo(parseDate(castToMap(b.getValue()).get(":created_at"))));
  }

  private Date parseDate(Object o) {
    if (o instanceof Date) {
      return (Date) o;
    }
    if (o instanceof String) {
      return Date.from(Instant.parse((String) o));
    }
    throw new RuntimeException();
  }

  private Map<String, Object> getUserData(Entry<String, Object> entry, PrintStream output) {
    Map<String, Object> submission = castToMap(entry.getValue());
    if (submission == null) {
      output.printf(PropertiesLoader.get("submissionDataNull") + NEW_LINE, entry.getKey());
      return null;
    }
    Map<String, Object> userData = castToMap(castToList(submission.get(":submitters")).get(0));
    if (userData == null) {
      output.printf(PropertiesLoader.get("submissionMissingUserData") + NEW_LINE, entry.getKey());
      return null;
    }
    return userData;
  }

  @SuppressWarnings("unchecked")
  private Map<String, Object> castToMap(Object o) {
    if (o instanceof Map) {
      return (Map<String, Object>) o;
    } else {
      return null;
    }
  }

  @SuppressWarnings("unchecked")
  private List<Object> castToList(Object o) {
    if (o instanceof List) {
      return (List<Object>) o;
    } else {
      throw new RuntimeException();
    }
  }

  private String getSubmissionName(Map<String, Object> userData, String id, PrintStream output) {
    String rawName = (String) userData.get(NAME_FIELD);
    if (rawName == null) {
      output.printf(PropertiesLoader.get("submissionMissingName") + NEW_LINE, id);
      return DEFAULT_NAME;
    }
    return Normalizer.normalize(rawName, Form.NFD).replaceAll("\\p{M}", "");
  }

  private String getStudentId(Map<String, Object> userData, PrintStream output) {
    if (!isAnonymous) {
      try {
        return ((String) userData.get(EMAIL_FIELD)).split("@")[0];
      } catch (Exception e) {
        output.print(PropertiesLoader.get("anonymousGradingEnabled") + NEW_LINE);
        isAnonymous = true;
      }
    }
    return "";
  }

  private String getSubmissionId(String id, PrintStream output) {
    String[] parts = id.split("_");
    if (parts.length < 2) {
      output.printf(PropertiesLoader.get("submissionKeyFormatError") + NEW_LINE, id);
      throw new RuntimeException();
    }
    try {
      return String.valueOf(Integer.parseInt(parts[1]));
    } catch (NumberFormatException e) {
      output.printf(PropertiesLoader.get("invalidSubmissionId") + NEW_LINE, parts[1], id);
      throw new RuntimeException();
    }
  }

  private String generateOutputDirName(int index, int size, String submissionId, String sid,
      String name) {
    StringBuilder outputDir = new StringBuilder();
    outputDir.append(index).append("_of_").append(size).append('_').append(submissionId);
    if (!isAnonymous) {
      outputDir.append('_').append(sid).append('_').append(name);
    }
    return outputDir.toString().replaceAll("[^a-zA-Z0-9_\\-]", "_").replaceAll("_+", "_");
  }

  private boolean performCopy(File dir, String outputDirRelative, String id, String name,
      File outputDir, OutputDirectoryHandler copier, PrintStream output, HashSet<String> failed) {
    Path inputDir = new File(dir, String.format(OUTPUT_DIR_FORMAT, id)).toPath();
    Path outputDirectory = new File(outputDir, outputDirRelative).toPath();
    try {
      boolean useSrc = copier.op(outputDirectory);
      Path trueOutputDir = outputDirectory;
      if (useSrc) {
        trueOutputDir = pathAppend(outputDirectory, "src");
      }
      copyDirTree(inputDir, new TreeWithDirCopier(inputDir, trueOutputDir));
    } catch (IOException e) {
      output.printf(PropertiesLoader.get("fileCopyError") + NEW_LINE, name);
      failed.add(name + " (" + id + ")");
      return false;
    }
    return true;
  }

  void doRename(File studentSubmissionDir, PrintStream output, File outputDir) {
    checkDirectoryExistence(studentSubmissionDir, "submissionDirectoryNotFound");

    if (Files.exists(pathAppend(studentSubmissionDir.toPath(), GRADESCOPE_METADATA_FILE))) {
      HashSet<String> failed = copyFolders(studentSubmissionDir, outputDir, output, (o) -> false);
      output.println(SEPARATOR);
      output.println(PropertiesLoader.get("renameSuccess"));
      if (!failed.isEmpty()) {
        output.println(PropertiesLoader.get("unableToCopyStudentsMessage") + ":");
        for (String s : failed) {
          output.println(s);
        }
      }
    }
  }

  void doGenerate(File masterDir, File studentSubmissionDir, File outputDir, PrintStream output) {
    checkDirectoryExistence(masterDir, "masterDirectoryNotFound");
    checkDirectoryExistence(studentSubmissionDir, "submissionDirectoryNotFound");
    checkDirectoryExistence(outputDir, "outputDirectoryNotFound");

    HashSet<String> failed = new HashSet<>();
    if (Files.exists(pathAppend(studentSubmissionDir.toPath(), GRADESCOPE_METADATA_FILE))) {
      failed = copyFolders(studentSubmissionDir, outputDir, output, (oDir) -> {
        try {
          copyDirTree(masterDir.toPath(), new TreeCopier(masterDir.toPath(), oDir));
          return true;
        } catch (IOException e) {
          throw new IOException(PropertiesLoader.get("directoryTreeCopyError"), e);
        }
      });
    }

    output.println(SEPARATOR);
    output.println(PropertiesLoader.get("generateSuccess"));
    if (!failed.isEmpty()) {
      output.println(PropertiesLoader.get("unableToCopyStudentsMessage") + ":");
      for (String s : failed) {
        output.println(s);
      }
    }
  }

  private void checkDirectoryExistence(File dir, String errorKey) {
    if (!dir.exists() || !dir.isDirectory()) {
      throw new RuntimeException(String.format(PropertiesLoader.get(errorKey), dir.getName()));
    }
  }

  void setAnonymous(boolean anonymous) {
    isAnonymous = anonymous;
  }

  interface OutputDirectoryHandler {
    boolean op(Path outputDir) throws IOException;
  }
}
