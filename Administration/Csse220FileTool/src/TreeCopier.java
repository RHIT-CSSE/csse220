import java.nio.file.*;
import static java.nio.file.StandardCopyOption.*;

import java.io.IOException;
import java.nio.file.attribute.*;
import static java.nio.file.FileVisitResult.*;

// Taken from java example.  So verbose!
class TreeCopier implements FileVisitor<Path> {
        private final Path source;
        private final Path target;
        private int numFilesCopied;
        
        TreeCopier(Path source, Path target) {
            this.source = source;
            this.target = target;
            this.numFilesCopied = 0;
        }
 
        @Override
        public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
            // before visiting entries in a directory we copy the directory
            // (okay if directory already exists). 
            Path newdir = target.resolve(source.relativize(dir));
            try {
                Files.copy(dir, newdir);
            } catch (FileAlreadyExistsException x) {
                // ignore
            }
            return CONTINUE;
        }
 
        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
            Files.copy(file, target.resolve(source.relativize(file)), StandardCopyOption.REPLACE_EXISTING);
            numFilesCopied++;
            return CONTINUE;
        }
 
        @Override
        public FileVisitResult postVisitDirectory(Path dir, IOException exc) {
            return CONTINUE;
        }
 
        @Override
        public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
            String error = String.format("Unable to copy: %s: %s%n", file, exc);
            throw new IOException(error);
        }

		public int getNumFilesCopied() {
			return numFilesCopied;
		}

    }