package rhit;

import static java.nio.file.FileVisitResult.CONTINUE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;

// Taken from java example. So verbose!
class TreeWithDirCopier implements FileVisitor<Path> {
  private final Path source;
  private final Path target;

  TreeWithDirCopier(Path source, Path target) {
    this.source = source;
    this.target = target;
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
    return CONTINUE;
  }

  @Override
  public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
    // first, read the file to see package info
    String[] packageInfo = findPackageName(file);
    String packageName = packageInfo[0];
    Boolean found = Boolean.parseBoolean(packageInfo[1]);

    copyFile(file, packageName, found);
    return CONTINUE;
  }

  private String[] findPackageName(Path file) throws IOException {
    String packageName = null;
    boolean found = false;
    try (InputStream in = Files.newInputStream(file);
        BufferedReader reader =
            new BufferedReader(new InputStreamReader(in, StandardCharsets.UTF_8))) {
      String line;
      while ((line = reader.readLine()) != null) {
        if (line.trim().startsWith("package")) {
          line = line.trim();
          int spaceIndex = line.indexOf(" ");
          packageName = line.substring(spaceIndex + 1);
          int semicolonIndex = packageName.indexOf(";");
          if (semicolonIndex != -1) {
            packageName = packageName.substring(0, semicolonIndex);
            found = true;
            break;
          } else {
            reader.close();
            throw new IOException(PropertiesLoader.get("invalidPackageDeclaration") + ": " + file);
          }
        }
      }
    }
    return new String[] {packageName, String.valueOf(found)};
  }

  private void copyFile(Path file, String packageName, Boolean found) throws IOException {
    Path p = null;
    Path preamble;
    if (found) {
      // create directory path object from root up to but not including the file name
      preamble = target.resolve(source.relativize(file)).getParent();

      // add the name of the package to the end of that path
      if (preamble != null) {
        p = preamble.resolve(Paths.get(packageName));

        // if the directory does not exist, make it
        if (!(p.toFile()).exists()) {
          if (!p.toFile().mkdirs()) {
            throw new IOException(PropertiesLoader.get("createDirectoryError") + ": " + p);
          }
        }

        // add the file name to the end of the path.
        p = p.resolve(file.getFileName());
      }

    } else {
      // otherwise, set p to the absolute path to the src directory
      p = target.resolve(source.relativize(file));
    }

    if (p != null) {
      Files.copy(file, p, StandardCopyOption.REPLACE_EXISTING);
    }
  }

  @Override
  public FileVisitResult postVisitDirectory(Path dir, IOException exc) {
    return CONTINUE;
  }

  @Override
  public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
    throw new IOException(String.format(PropertiesLoader.get("copyError"), file), exc);
  }
}
