package fileIOTest;

import java.io.File;
import java.io.FileNotFoundException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import exceptions.MissingGradeException;
import exceptions.NegativeGradeException;
import fileIO.GradeFileReader;
import fileIO.ReadAndGradeMain;
import fileIO.RunAllTests;


public class TestReadGradeFileWithMissing {
	
	private static int testsPassed;
	private static int numberOfTests;
	private static String directory;

	@BeforeClass
	public static void oneTimeSetUp() {
		ReadAndGradeMain.resetAllFiles();
		directory = "onlyOneIssueGrades/";
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp
	
	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestReadGradeFileWithMissing.class.getSimpleName();
		RunAllTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	
	@Test
	public void testReadGradeFile01() {
		numberOfTests++;
		File dir = new File(directory);
		String fnameLookingFor = "dan.gore@rose-hulman.edu.txt";
		for(File f : dir.listFiles()) {
			if(f.getName().equals(fnameLookingFor)) {
				try {
					GradeFileReader.readGradeFile(f.getAbsolutePath());
				} catch (FileNotFoundException e) {
					//do nothing
				} catch (MissingGradeException e) {
					testsPassed++;
				} catch (NegativeGradeException e) {
					//do nothing
				}
			}
		}
	} // testReadGradeFile01
	
	@Test
	public void testReadGradeFile02() {
		numberOfTests++;
		File dir = new File(directory);
		String fnameLookingFor = "happy.gilmore@gmail.com.txt";
		for(File f : dir.listFiles()) {
			if(f.getName().equals(fnameLookingFor)) {
				try {
					GradeFileReader.readGradeFile(f.getAbsolutePath());
				} catch (FileNotFoundException e) {
					//do nothing
				} catch (MissingGradeException e) {
					testsPassed++;
				} catch (NegativeGradeException e) {
					//do nothing
				}
			}
		}
	} // testReadGradeFile02
	
	@Test
	public void testReadGradeFile03() {
		numberOfTests++;
		File dir = new File(directory);
		String fnameLookingFor = "kelly.kapoor@rose-hulman.edu.txt";
		for(File f : dir.listFiles()) {
			if(f.getName().equals(fnameLookingFor)) {
				try {
					GradeFileReader.readGradeFile(f.getAbsolutePath());
				} catch (FileNotFoundException e) {
					//do nothing
				} catch (MissingGradeException e) {
					testsPassed++;
				} catch (NegativeGradeException e) {
					//do nothing
				}
			}
		}
	} // testReadGradeFile03
}
