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


public class TestStep2GetFileAveragesMultipleIssues {
	
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
		this.fileProg.step2GetFileAverages("multipleIssuesGrades/");
		this.filenameToStudentRecordActual = this.fileProg.getFilenameToStudentRecord();
		this.actualNegative  = this.fileProg.getFilesWithNegative();
		this.actualMissing = this.fileProg.getFilesWithMissing();
	}

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestStep2GetFileAveragesMultipleIssues.class.getSimpleName();
		RunAllTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	
	@Test
	public void testGetFileAverages01() {
		numberOfTests++;
		String fnameLookingFor = "andy.bernard@rose-hulman.edu.txt";
		double expected = (70+24+59+10+31+53+19+89+80+91+71+67+21+72+58)/15.0;
		double actual = this.filenameToStudentRecordActual.get(fnameLookingFor).getAverage();
		assertEquals(expected, actual, 0.1);
		testsPassed++;
	} // testGetFileAverages01
	
	@Test
	public void testGetFileAverages02() {
		numberOfTests++;
		String fnameLookingFor = "andy.dwyer@rose-hulman.edu.txt";
		double expected = (96+76+68+14+29+22+100+32+32+15+27+6+28+74+6+4+30+52+45+51)/20.0;
		double actual = this.filenameToStudentRecordActual.get(fnameLookingFor).getAverage();
		assertEquals(expected, actual, 0.1);
		testsPassed++;
	} // testGetFileAverages02
	
	@Test
	public void testGetFileAverages03() {
		numberOfTests++;
		String fnameLookingFor = "angela.martin@rose-hulman.edu.txt";
		double expected = (44+71+24+0+34+10+27+22+80+71+85+91+17+71+48)/15.0;
		double actual = this.filenameToStudentRecordActual.get(fnameLookingFor).getAverage();
		assertEquals(expected, actual, 0.1);
		testsPassed++;
	} // testGetFileAverages03
	
	@Test
	public void testGetFileAverages04() {
		numberOfTests++;
		String fnameLookingFor = "bobby.newport@rose-hulman.edu.txt";
		double expected = (7+51+6+20+47+41+95+23+63+36+14+77+77+49+19+70+83+49+56+69+53+61+37+7)/24.0;
		double actual = this.filenameToStudentRecordActual.get(fnameLookingFor).getAverage();
		assertEquals(expected, actual, 0.1);
		testsPassed++;
	} // testGetFileAverages04
	
	@Test
	public void testGetFileAverages05() {
		numberOfTests++;
		String fnameLookingFor = "david.wallace@rose-hulman.edu.txt";
		double expected = (44+21+15+55+73+81+78+25+77+74+84+56+56+84+59)/15.0;
		double actual = this.filenameToStudentRecordActual.get(fnameLookingFor).getAverage();
		assertEquals(expected, actual, 0.1);
		testsPassed++;
	} // testGetFileAverages05
	
	@Test
	public void testGetFileAverages06() {
		numberOfTests++;
		String fnameLookingFor = "jim.halpert@rose-hulman.edu.txt";
		double expected = (63+99+66+80+57+11+13+89)/8.0;
		double actual = this.filenameToStudentRecordActual.get(fnameLookingFor).getAverage();
		assertEquals(expected, actual, 0.1);
		testsPassed++;
	} // testGetFileAverages06
	
	@Test
	public void testGetFileAverages07() {
		numberOfTests++;
		String fnameLookingFor = "josh.porter@rose-hulman.edu.txt";
		double expected = (74+50+51+86+47+69+10+65+86+23+30+13+70+53+41)/15.0;
		double actual = this.filenameToStudentRecordActual.get(fnameLookingFor).getAverage();
		assertEquals(expected, actual, 0.1);
		testsPassed++;
	} // testGetFileAverages07
	
	@Test
	public void testGetFileAverages08() {
		numberOfTests++;
		String fnameLookingFor = "kieth.pembroke@rose-hulman.edu.txt";
		double expected = (56+45+51+65+80+20+30)/7.0;
		double actual = this.filenameToStudentRecordActual.get(fnameLookingFor).getAverage();
		assertEquals(expected, actual, 0.1);
		testsPassed++;
	} // testGetFileAverages08
	
	@Test
	public void testGetFileAverages09() {
		numberOfTests++;
		String fnameLookingFor = "meredith.palmer@rose-hulman.edu.txt";
		double expected = (4+11+29+49+78+36+61+25+65+56+61+40)/12.0;
		double actual = this.filenameToStudentRecordActual.get(fnameLookingFor).getAverage();
		assertEquals(expected, actual, 0.1);
		testsPassed++;
	} // testGetFileAverages09
	
	@Test
	public void testGetFileAverages10() {
		numberOfTests++;
		String fnameLookingFor = "michael.scott@rose-hulman.edu.txt";
		double expected = (4+46+81+43+95+97+21+50+99+51+93+78+42+64+68+56+23+69+14+65+25+89+56)/23.0;
		double actual = this.filenameToStudentRecordActual.get(fnameLookingFor).getAverage();
		assertEquals(expected, actual, 0.1);
		testsPassed++;
	} // testGetFileAverages10
	
	@Test
	public void testGetFileAverages11() {
		numberOfTests++;
		String fnameLookingFor = "pam.beesly@rose-hulman.edu.txt";
		double expected = (83+75+69+78+20+55+63+22)/8.0;
		double actual = this.filenameToStudentRecordActual.get(fnameLookingFor).getAverage();
		assertEquals(expected, actual, 0.1);
		testsPassed++;
	} // testGetFileAverages11
	
	@Test
	public void testGetFileAverages12() {
		numberOfTests++;
		String fnameLookingFor = "roy.anderson@rose-hulman.edu.txt";
		double expected = (31+55+82+100+88+84+31+48+99+75+12+32+88+82+41+77+9+24+16+83+61)/21.0;
		double actual = this.filenameToStudentRecordActual.get(fnameLookingFor).getAverage();
		assertEquals(expected, actual, 0.1);
		testsPassed++;
	} // testGetFileAverages12
	
	@Test
	public void testGetFileAverages13() {
		numberOfTests++;
		
		String[] expectedMissing = {"andy.bernard@rose-hulman.edu.txt",
									"andy.dwyer@rose-hulman.edu.txt",
									"angela.martin@rose-hulman.edu.txt",
									"david.wallace@rose-hulman.edu.txt",
									"josh.porter@rose-hulman.edu.txt",
									"kieth.pembroke@rose-hulman.edu.txt",
									"meredith.palmer@rose-hulman.edu.txt",
									"michael.scott@rose-hulman.edu.txt",
									"pam.beesly@rose-hulman.edu.txt",
									"roy.anderson@rose-hulman.edu.txt"};
		
		for(String miss : expectedMissing) {
			assertTrue(actualMissing.contains(miss));
		}
		testsPassed++;
	} // testGetFileAverages13
	
	@Test
	public void testGetFileAverages14() {
		numberOfTests++;
		String[] expectedNegative = {"andy.bernard@rose-hulman.edu.txt",
									 "angela.martin@rose-hulman.edu.txt",
									 "bobby.newport@rose-hulman.edu.txt",
									 "jim.halpert@rose-hulman.edu.txt",
									 "josh.porter@rose-hulman.edu.txt",
									 "meredith.palmer@rose-hulman.edu.txt",
									 "michael.scott@rose-hulman.edu.txt",
									 "roy.anderson@rose-hulman.edu.txt"};
		
		for(String neg : expectedNegative) {
			assertTrue(actualNegative.contains(neg));
		}
		testsPassed++;
	} // testGetFileAverages14
}
