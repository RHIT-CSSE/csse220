import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;


/** 
 * See README.md for details on this assignment.
 * 
 * This assignment involves you creating, throwing, and catching
 * Exceptions to deal with various problems that can arise when
 * parsing data files that have incomplete, inconsistent, or are 
 * completely missing.
 * 
 *  
 * @author YOUR_USERNAME
 *
 */
public class ExceptionHomework {
	
	// You do NOT have to to change these variables
	private static final String[] filesToRead0 = {"data1.txt", "data2.txt"};
	private static final String[] filesToRead1 = {"data1.txt", "data5.txt"};
	private static final String[] filesToRead2 = {"data1.txt", "data2.txt", "data3.txt"};
	private static final String[] filesToRead3 = {"data1.txt", "data2.txt", "data4.txt"};
	private HashMap<String,City> cityNameToCityDataMap = new HashMap<String, City>();
	
	// You DO have to change this method it should NOT have a declaration of throws for any kind of Exception
	public static void main(String[] args)  {
		
		//Works fine if there is nothing wrong with the data
//		System.out.println("=============Part 0=============");
//		ExceptionHomework demo0 = new ExceptionHomework();
//		demo0.processDataFiles( filesToRead0 );
//		demo0.reportOnData();
		
		
		//Run after completing Part 1
//		System.out.println("=============Part 1=============");
//		ExceptionHomework demo1 = new ExceptionHomework();
//		demo1.processDataFiles( filesToRead1 );
//		demo1.reportOnData();

		
		//Run after completing Part 2
//		System.out.println("=============Part 2=============");
//		ExceptionHomework demo2 = new ExceptionHomework();
//		demo2.processDataFiles( filesToRead2 );
//		demo2.reportOnData();
		
		//Run after completing Part 3
//		System.out.println("=============Part 3=============");
//		ExceptionHomework demo3 = new ExceptionHomework();
//		demo3.processDataFiles( filesToRead3 );
//		demo3.reportOnData();
	}
	
	// You do NOT have to change this method
	public void reportOnData() {
		for (String cityName: this.cityNameToCityDataMap.keySet() ) {
			System.out.println( cityNameToCityDataMap.get(cityName).getReport() );
		}
	}
	
	//You WILL have to change this method
	public void processDataFiles(String[] filesToRead)  {	
	
		for (String filename: filesToRead) {
			//track the lineNumber to report when the data has problems
			int lineNumber = 0;

			//Hint: this line can throw a FileNotFoundException
			FileReader file;
			try {
				file = new FileReader(filename);
				Scanner scanner = new Scanner( file );
				while ( scanner.hasNext() ) {
					lineNumber++;
					String line = scanner.nextLine();
					//For the sake of this assignment, you can assume each line will have at least 1 comma...
					int firstCommaPosition = line.indexOf(",");
					String cityName = line.substring(0,firstCommaPosition);
					if ( !this.cityNameToCityDataMap.containsKey(cityName) ) {
						this.cityNameToCityDataMap.put(cityName, new City(cityName) );
					}
					
					//Hint: this method might have some things go wrong in it!
					cityNameToCityDataMap.get(cityName).addData(line.substring(firstCommaPosition+1)  );
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}		
	}

}
