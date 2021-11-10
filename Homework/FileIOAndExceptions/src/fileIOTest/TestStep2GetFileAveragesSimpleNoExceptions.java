package fileIOTest;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import fileIO.ReadAndGradeMain;
import fileIO.RunAllTests;
import fileIO.StudentRecord;


public class TestStep2GetFileAveragesSimpleNoExceptions {
	
	private static int testsPassed;
	private static int numberOfTests;
	
	private ReadAndGradeMain fileProg;
	private HashMap<String, StudentRecord> filenameToStudentRecordActual;

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
		this.fileProg.step2GetFileAverages("onlyGoodGrades/");
		this.filenameToStudentRecordActual = this.fileProg.getFilenameToStudentRecord();
	}

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestStep2GetFileAveragesSimpleNoExceptions.class.getSimpleName();
		RunAllTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	
	@Test
	public void testGetFileAverages01() {
		numberOfTests++;
		String fnameLookingFor = "adrian.pimento@rose-hulman.edu.txt";
		double expected = (61+63+93+81+94+53+97+83+98+61+76+83+79+94+97+83)/16.0;
		double actual = this.filenameToStudentRecordActual.get(fnameLookingFor).getAverage();
		assertEquals(expected, actual, 0.1);
		testsPassed++;
	} // testGetFileAverages01
	
	@Test
	public void testGetFileAverages02() {
		numberOfTests++;
		String fnameLookingFor = "april.ludgate@@rose-hulman.edu.txt";
		double expected = (94+95+96+92+90)/5.0;
		double actual = this.filenameToStudentRecordActual.get(fnameLookingFor).getAverage();
		assertEquals(expected, actual, 0.1);
		testsPassed++;
	} // testGetFileAverages02
	
	@Test
	public void testGetFileAverages03() {
		numberOfTests++;
		String fnameLookingFor = "deangelo.vickers@rose-hulman.edu.txt";
		double expected = (58+62+82+66+64+68+53+95+91+52+71+69+89+94)/14.0;
		double actual = this.filenameToStudentRecordActual.get(fnameLookingFor).getAverage();
		assertEquals(expected, actual, 0.1);
		testsPassed++;
	} // testGetFileAverages03
	
	@Test
	public void testGetFileAverages04() {
		numberOfTests++;
		String fnameLookingFor = "doug.judy@rose-hulman.edu.txt";
		double expected = (61+62+83+94+90+90+89+72+67+98+82)/11.0;
		double actual = this.filenameToStudentRecordActual.get(fnameLookingFor).getAverage();
		assertEquals(expected, actual, 0.1);
		testsPassed++;
	} // testGetFileAverages04
	
	@Test
	public void testGetFileAverages05() {
		numberOfTests++;
		String fnameLookingFor = "ron.swanson@rose-hulman.edu.txt";
		double expected = (82+57+97+94+88+60+74+73+78+86+54+62+75+74+88+68+69+97+99+98+93+92+75)/23.0;
		double actual = this.filenameToStudentRecordActual.get(fnameLookingFor).getAverage();
		assertEquals(expected, actual, 0.1);
		testsPassed++;
	} // testGetFileAverages05
}
