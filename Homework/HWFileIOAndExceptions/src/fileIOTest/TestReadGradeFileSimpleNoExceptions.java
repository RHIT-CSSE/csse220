package fileIOTest;

import static org.junit.Assert.*;

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


public class TestReadGradeFileSimpleNoExceptions {
	
	private static int testsPassed;
	private static int numberOfTests;
	private static String directory;

	@BeforeClass
	public static void oneTimeSetUp() {
		ReadAndGradeMain.resetAllFiles();
		directory = "onlyGoodGrades/";
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp
	
	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestReadGradeFileSimpleNoExceptions.class.getSimpleName();
		RunAllTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	
	@Test
	public void testReadGradeFile01() throws FileNotFoundException, MissingGradeException, NegativeGradeException {
		numberOfTests++;
		File dir = new File(directory);
		String fnameLookingFor = "adrian.pimento@rose-hulman.edu.txt";
		for(File f : dir.listFiles()) {
			if(f.getName().equals(fnameLookingFor)) {
				double expected = (61+63+93+81+94+53+97+83+98+61+76+83+79+94+97+83)/16.0;
				double actual = GradeFileReader.readGradeFile(f.getAbsolutePath());
				assertEquals(expected, actual, 0.1);
			}
		}
		
		testsPassed++;
	} // testReadGradeFile01
	
	@Test
	public void testReadGradeFile02() throws FileNotFoundException, MissingGradeException, NegativeGradeException {
		numberOfTests++;
		File dir = new File(directory);
		String fnameLookingFor = "april.ludgate@@rose-hulman.edu.txt";
		for(File f : dir.listFiles()) {
			if(f.getName().equals(fnameLookingFor)) {
				double expected = (94+95+96+92+90)/5.0;
				double actual = GradeFileReader.readGradeFile(f.getAbsolutePath());
				assertEquals(expected, actual, 0.1);
			}
		}
		testsPassed++;
	} // testReadGradeFile02
	
	@Test
	public void testReadGradeFile03() throws FileNotFoundException, MissingGradeException, NegativeGradeException {
		numberOfTests++;
		File dir = new File(directory);
		String fnameLookingFor = "deangelo.vickers@rose-hulman.edu.txt";
		for(File f : dir.listFiles()) {
			if(f.getName().equals(fnameLookingFor)) {
				double expected = (58+62+82+66+64+68+53+95+91+52+71+69+89+94)/14.0;
				double actual = GradeFileReader.readGradeFile(f.getAbsolutePath());
				assertEquals(expected, actual, 0.1);
			}
		}
		testsPassed++;
	} // testReadGradeFile03
	
	@Test
	public void testReadGradeFile04() throws FileNotFoundException, MissingGradeException, NegativeGradeException {
		numberOfTests++;
		File dir = new File(directory);
		String fnameLookingFor = "doug.judy@rose-hulman.edu.txt";
		for(File f : dir.listFiles()) {
			if(f.getName().equals(fnameLookingFor)) {
				double expected = (61+62+83+94+90+90+89+72+67+98+82)/11.0;
				double actual = GradeFileReader.readGradeFile(f.getAbsolutePath());
				assertEquals(expected, actual, 0.1);
			}
		}
		testsPassed++;
	} // testReadGradeFile04
	
	@Test
	public void testReadGradeFile05() throws FileNotFoundException, MissingGradeException, NegativeGradeException {
		numberOfTests++;
		File dir = new File(directory);
		String fnameLookingFor = "ron.swanson@rose-hulman.edu.txt";
		for(File f : dir.listFiles()) {
			if(f.getName().equals(fnameLookingFor)) {
				double expected = (82+57+97+94+88+60+74+73+78+86+54+62+75+74+88+68+69+97+99+98+93+92+75)/23.0;
				double actual = GradeFileReader.readGradeFile(f.getAbsolutePath());
				assertEquals(expected, actual, 0.1);
			}
		}
		testsPassed++;
	} // testReadGradeFile05

}
