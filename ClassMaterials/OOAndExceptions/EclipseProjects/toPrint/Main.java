package SimpleScannerException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		openFile();
	}
	
	private static void openFile()  {
		File file = new File("level1.txt");
		// TODO: 1. We can handle this checked exception in one of two ways.
		// What happens if you try to "throws" the exception up to main()?
		Scanner scanner = new Scanner(file);
		scanner.close();
	}
}
