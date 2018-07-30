import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.EnumSet;
import java.util.Scanner;

public class Csse220FileTool {
	
	private static int copyDirTree(Path source, Path target) throws IOException {
		EnumSet<FileVisitOption> opts = EnumSet.of(FileVisitOption.FOLLOW_LINKS);
		final int MAX_DIR_DEPTH=20;			
        TreeCopier tc = new TreeCopier(source, target);
        Files.walkFileTree(source, opts, MAX_DIR_DEPTH, tc);
        return tc.getNumFilesCopied();
	}
	
	private static Path pathAppend(Path source, String addition) {
		return source.resolve(Paths.get(addition));
	}
	
	public static void main(String[] args) throws IOException {
		if(args.length > 0) {
		
			File masterDir = new File(args[0]);
			File studentSubmissionDir = new File(args[1]);
			File outputDir = new File(args[2]);
		
			doGenerate(masterDir, studentSubmissionDir, outputDir, System.out);
		} else {
			FileToolGUI gui = new FileToolGUI();
			gui.openGUI();
		}
				
	}

	public static void doGenerate(File masterDir, File studentSubmissionDir, File outputDir, PrintStream output)
			throws IOException, FileNotFoundException {
		if(!masterDir.exists()) {
			throw new IOException("Master dir" + masterDir.getName() + "does not exist");
		}
		if(!studentSubmissionDir.exists()) {
			throw new IOException("Student submission dir" + studentSubmissionDir.getName() + "does not exist");
		}
		if(!outputDir.exists()) {
			throw new IOException("Output dir" + outputDir.getName() + "does not exist");
		}
		
		String fullProjectFile = getProjectFileContents(masterDir, output);
		
		for(File submissionDir : studentSubmissionDir.listFiles()) {
			String dirName = submissionDir.getName();
			String studentName = dirName.substring(0, dirName.indexOf('_'));
			studentName = studentName.replace(' ', '_');
			
			// copy everything from the master dir to student dir
			Path studentOutputDir = pathAppend(outputDir.toPath(), studentName);
			int numMasterCopied = copyDirTree(masterDir.toPath(), studentOutputDir);
			
			// copy the student's submissions into the src dir of master
			Path studentOutputDirSrc = pathAppend(studentOutputDir, "src");
	        int numStudentCopied = copyDirTree(submissionDir.toPath(), studentOutputDirSrc);
	        
	        // change the name in the project file
	        updateProjectFileWithNewName(fullProjectFile, studentName, studentOutputDir);
	        output.printf("Copied %d master %d student to %s\n", numMasterCopied, numStudentCopied, studentOutputDir.toString());        
		}
		output.printf("Generate completed successfully.\n");
	}

	private static void updateProjectFileWithNewName(String fullProjectFile, String studentName, Path studentOutputDir)
			throws FileNotFoundException {
		Path studentOutputProjectFile = pathAppend(studentOutputDir, ".project");
		int indexOfName = fullProjectFile.indexOf("</name>");
		// there are actually several name fields, but the first one is what we want
		PrintWriter out = new PrintWriter(studentOutputProjectFile.toFile());
		out.print(fullProjectFile.substring(0, indexOfName));
		out.print("_");
		out.print(studentName);
		out.print(fullProjectFile.substring(indexOfName));
		out.close();
	}

	private static String getProjectFileContents(File masterDir, PrintStream output) throws IOException, FileNotFoundException {
		File masterProjectFile = pathAppend(masterDir.toPath(), ".project").toFile();
		if(!masterProjectFile.exists()) {
			throw new IOException("Can't find master project file: " + masterProjectFile.getAbsolutePath());
		}
		String fullProjectFile = new Scanner(masterProjectFile).useDelimiter("\\Z").next();
		output.println("Read project file: " + masterProjectFile.getAbsolutePath());
		return fullProjectFile;
	}

}
