import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class LevelIO {

	public static void main(String[] args) {
		new LevelIO();
	}

	public LevelIO() {
		writeFile();
		readFile();
	}

	private void readFile() {
		Scanner scanner;
		try {
			scanner = new Scanner(new File("level.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("level.txt not found");
			//e.printStackTrace();
			return;
		}
		String title = scanner.nextLine();
		System.out.println("Title: " + title);
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			System.out.println(line.charAt(0));
			System.out.println(line);
		}
		scanner.close();
		
	}

	private void writeFile() {
		PrintWriter pw = null;
		try {
			pw = new PrintWriter("level.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		}
		pw.println("Sample level");
		pw.println("/-------------\\");
		pw.println("|.............|");
		pw.close();
	}
}
