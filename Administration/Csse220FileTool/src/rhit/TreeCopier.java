package rhit;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.stream.Stream;

// Taken from java example. So verbose!
class TreeCopier implements FileVisitor<Path> {
  private static final String IML_EXTENSION = ".iml";
  private static final String MODULES_XML_PATH = ".idea/modules.xml";
  private static final String WORKSPACE_XML_PATH = ".idea/workspace.xml";

  private final Path source;
  private final Path target;
  private final String oldModuleName;
  private final String newModuleName;

  TreeCopier(Path source, Path target) {
    this.source = source;
    this.target = target;
    this.oldModuleName = findImlBaseName(source);
    this.newModuleName = String.format("%s_%s", source.getFileName(), target.getFileName());
  }

  private static String findImlBaseName(Path source) {
    try (Stream<Path> entries = Files.list(source)) {
      Path iml = entries
          .filter(p -> p.getFileName().toString().endsWith(IML_EXTENSION))
          .findFirst()
          .orElse(null);
      if (iml == null) {
        return null;
      }
      String fileName = iml.getFileName().toString();
      return fileName.substring(0, fileName.length() - IML_EXTENSION.length());
    } catch (IOException e) {
      return null;
    }
  }

  @Override
  public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
    // before visiting entries in a directory we copy the directory
    // (okay if directory already exists).
    Path newDir = target.resolve(source.relativize(dir));
    try {
      Files.copy(dir, newDir);
    } catch (FileAlreadyExistsException x) {
      // ignore
    }
    return FileVisitResult.CONTINUE;
  }

  @Override
  public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
    Path relative = source.relativize(file);
    String relativePath = relative.toString().replace('\\', '/');
    String fileName = file.getFileName().toString();

    if (relativePath.equals(WORKSPACE_XML_PATH)) {
      return FileVisitResult.CONTINUE;
    }

    if (fileName.endsWith(IML_EXTENSION)) {
      Path newFile = target.resolve(relative).resolveSibling(newModuleName + IML_EXTENSION);
      Files.copy(file, newFile, StandardCopyOption.REPLACE_EXISTING);
    } else if (relativePath.equals(MODULES_XML_PATH) && oldModuleName != null) {
      String content = Files.readString(file, StandardCharsets.UTF_8)
          .replace(oldModuleName, newModuleName);
      Path newFile = target.resolve(relative);
      Files.writeString(newFile, content, StandardCharsets.UTF_8);
    } else {
      Files.copy(file, target.resolve(relative), StandardCopyOption.REPLACE_EXISTING);
    }
    return FileVisitResult.CONTINUE;
  }

  @Override
  public FileVisitResult postVisitDirectory(Path dir, IOException exc) {
    return FileVisitResult.CONTINUE;
  }

  @Override
  public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
    throw new IOException(String.format(PropertiesLoader.get("copyError"), file), exc);
  }
}
