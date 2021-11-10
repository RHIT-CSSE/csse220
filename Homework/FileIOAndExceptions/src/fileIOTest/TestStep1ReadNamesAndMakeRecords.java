package fileIOTest;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import fileIO.ReadAndGradeMain;
import fileIO.RunAllTests;
import fileIO.StudentRecord;


public class TestStep1ReadNamesAndMakeRecords {
	
	private static int testsPassed;
	private static int numberOfTests;
	
	private ReadAndGradeMain fileProg;
	private String[] expectedWarnings;

	@BeforeClass
	public static void oneTimeSetUp() {
		ReadAndGradeMain.resetAllFiles();
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp
	
	@Before
	public void setUp() throws Exception {
		ReadAndGradeMain.resetAllFiles();
		this.fileProg = new ReadAndGradeMain();
		this.fileProg.step1ReadNamesAndMakeRecords();
		this.expectedWarnings = new String[] {
				"adams, john, john.adamsrose-hulman.edu",
				"gilmore, happy, happy.gilmore@gmail.com",
				"ludgate, april, april.ludgate@@rose-hulman.edu",
				"saperstein, jean-ralphio, jean-ralphio.superstein@rose-hulman.edu",
				"zippy, johnny, johnny.zippy" };
	}

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestStep1ReadNamesAndMakeRecords.class.getSimpleName();
		RunAllTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	
	@Test
	public void testAllNamesEmailWarningsSize() {
		numberOfTests++;
		ArrayList<String> warnings = this.fileProg.getEmailWarnings();
		assertEquals(this.expectedWarnings.length, warnings.size());
		testsPassed++;
	} // testAllNamesEmailWarningsSize
	
	@Test
	public void testAllNamesEmailWarnings() {
		numberOfTests++;
		ArrayList<String> warnings = this.fileProg.getEmailWarnings();
		
		for(String warning : warnings) {
			String[] splitWarn = warning.split(",");
			assertEquals(3, splitWarn.length);
			String last = splitWarn[0].toLowerCase().trim();
			String first = splitWarn[1].toLowerCase().trim();
			String email = splitWarn[2].toLowerCase().trim();
			
			boolean found = false;
			for(String exp : this.expectedWarnings) {
				if(exp.contains(last) && exp.contains(first) && exp.contains(email)) {
					found = true;
					break;
				}
			}
			
			assertTrue(found);
		}
		
		testsPassed++;
	} // testAllNamesEmailWarnings
	
	@Test
	public void testAllNamesRecords() {
		
		HashMap<String, StudentRecord> actualRecords = this.fileProg.getFilenameToStudentRecord();
		
		Scanner scanner;
		String filename = "AllNames.csv";
		try {
			scanner = new Scanner(new File(filename));
			scanner.nextLine();
		} catch (FileNotFoundException e) {
			return;
		}
		numberOfTests++;
		
		while(scanner.hasNextLine()) {
			String line = scanner.nextLine();
			String[] splitLine = line.split(",");
			
			String lastname = splitLine[0].trim();
			String firstname = splitLine[1].trim();
			String email = splitLine[2].trim();
			String fname = email + ".txt";
			
			assertTrue(actualRecords.containsKey(fname));
			
			StudentRecord rec = actualRecords.get(fname);
			
			assertEquals(lastname, rec.getLastName());
			assertEquals(firstname, rec.getFirstName());
			assertEquals(email, rec.getEmail());
		}
		
		scanner.close();
		
		testsPassed++;
	} // testAllNamesRecords

	

}
