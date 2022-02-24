package fileIOTest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import fileIO.ReadAndGradeMain;
import fileIO.RunAllTests;
import fileIO.StudentRecord;


public class TestStep2GetFileAveragesOneIssueOnly {
	
	private static int testsPassed;
	private static int numberOfTests;
	
	private ReadAndGradeMain fileProg;
	private HashMap<String, StudentRecord> filenameToStudentRecordActual;
	private ArrayList<String> actualNegative;
	private ArrayList<String> actualMissing;

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
		this.fileProg.step2GetFileAverages("onlyOneIssueGrades/");
		this.filenameToStudentRecordActual = this.fileProg.getFilenameToStudentRecord();
		this.actualNegative  = this.fileProg.getFilesWithNegative();
		this.actualMissing = this.fileProg.getFilesWithMissing();
	}

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestStep2GetFileAveragesOneIssueOnly.class.getSimpleName();
		RunAllTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	
	@Test
	public void testGetFileAverages01() {
		numberOfTests++;
		String fnameLookingFor = "dan.gore@rose-hulman.edu.txt";
		double expected = (97+90+99+94+98+94+96+91+90+92+96+92+93)/13.0;
		double actual = this.filenameToStudentRecordActual.get(fnameLookingFor).getAverage();
		assertEquals(expected, actual, 0.1);
		testsPassed++;
	} // testGetFileAverages01
	
	@Test
	public void testGetFileAverages02() {
		numberOfTests++;
		String fnameLookingFor = "happy.gilmore@gmail.com.txt";
		double expected = (90+99+94+91+98+97+97+96+99+92+95+99+99+90+90+96+91+92+90+97)/20.0;
		double actual = this.filenameToStudentRecordActual.get(fnameLookingFor).getAverage();
		assertEquals(expected, actual, 0.1);
		testsPassed++;
	} // testGetFileAverages02
	
	@Test
	public void testGetFileAverages03() {
		numberOfTests++;
		String fnameLookingFor = "kelly.kapoor@rose-hulman.edu.txt";
		double expected = (100+50+79+64+58+60+90)/7.0;
		double actual = this.filenameToStudentRecordActual.get(fnameLookingFor).getAverage();
		assertEquals(expected, actual, 0.1);
		testsPassed++;
	} // testGetFileAverages03
	
	@Test
	public void testGetFileAverages04() {
		numberOfTests++;
		String fnameLookingFor = "leslie.knope@rose-hulman.edu.txt";
		double expected = (87+68+87)/3.0;
		double actual = this.filenameToStudentRecordActual.get(fnameLookingFor).getAverage();
		assertEquals(expected, actual, 0.1);
		testsPassed++;
	} // testGetFileAverages04
	
	@Test
	public void testGetFileAverages05() {
		numberOfTests++;
		String fnameLookingFor = "pete.miller@rose-hulman.edu.txt";
		double expected = (60+52+83+63+81+75+51+79+89+97+87+60+80+64+84+82+71)/17.0;
		double actual = this.filenameToStudentRecordActual.get(fnameLookingFor).getAverage();
		assertEquals(expected, actual, 0.1);
		testsPassed++;
	} // testGetFileAverages05
	
	@Test
	public void testGetFileAverages06() {
		numberOfTests++;
		String fnameLookingFor = "stanley.hudson@rose-hulman.edu.txt";
		double expected = (98+92+92+98+91+99+95+99+91+90+94+92+91+91+94)/15.0;
		double actual = this.filenameToStudentRecordActual.get(fnameLookingFor).getAverage();
		assertEquals(expected, actual, 0.1);
		testsPassed++;
	} // testGetFileAverages06
	
	@Test
	public void testGetFileAverages07() {
		numberOfTests++;
		String fnameLookingFor = "tammy.swanson@rose-hulman.edu.txt";
		double expected = (91+98+90+98+98+92+93+93+97+92+98+93+93+97+93+92+91+96+95+92+91)/21.0;
		double actual = this.filenameToStudentRecordActual.get(fnameLookingFor).getAverage();
		assertEquals(expected, actual, 0.1);
		testsPassed++;
	} // testGetFileAverages07
	
	@Test
	public void testGetFileAverages08() {
		numberOfTests++;
		
		String[] expectedMissing = {"dan.gore@rose-hulman.edu.txt",
							 "happy.gilmore@gmail.com.txt",
							 "kelly.kapoor@rose-hulman.edu.txt"};
		
		for(String miss : expectedMissing) {
			assertTrue(actualMissing.contains(miss));
		}
		testsPassed++;
	} // testGetFileAverages08
	
	@Test
	public void testGetFileAverages09() {
		numberOfTests++;
		String[] expectedNegative = {"leslie.knope@rose-hulman.edu.txt",
									"pete.miller@rose-hulman.edu.txt",
									"stanley.hudson@rose-hulman.edu.txt",
									"tammy.swanson@rose-hulman.edu.txt"};
		for(String neg : expectedNegative) {
			assertTrue(actualNegative.contains(neg));
		}
		testsPassed++;
	} // testGetFileAverages09
}
