package fileIOTest;

import static org.junit.Assert.*;

import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import fileIO.ReadAndGradeMain;
import fileIO.RunAllTests;


public class TestStep3WriteGradesToFileOneExceptionOnly {
	
	private static int testsPassed;
	private static int numberOfTests;
	
	private ReadAndGradeMain fileProg;
	private String actualFileString;
	private String expectedFileString;

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
		this.fileProg.step3WriteGradesToFile();
		this.actualFileString = new String (Files.readAllBytes(Paths.get("AllAveragedGrades.csv")));
		this.expectedFileString = new String (Files.readAllBytes(
				Paths.get("originalFilesDoNotUseOrChange/WhatAllAveragedGradesShouldBeWhenFinished.csv")));
	}

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestStep3WriteGradesToFileOneExceptionOnly.class.getSimpleName();
		RunAllTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	
	@Test
	public void testWriteGradesToFile01() {
		numberOfTests++;
		String lastname = "Gore";
		assertTrue(this.actualFileString.contains(lastname));
		String actualLine = this.actualFileString.substring(this.actualFileString.indexOf(lastname));
		actualLine = (actualLine.contains("\n")) ? actualLine.substring(0, actualLine.indexOf("\n")) : actualLine;
		
		String expectedLine = this.expectedFileString.substring(this.expectedFileString.indexOf(lastname));
		expectedLine = (expectedLine.contains("\n")) ? expectedLine.substring(0, expectedLine.indexOf("\n")) : expectedLine;
		
		String[] splitActual = actualLine.split(",");
		String[] splitExpected = expectedLine.split(",");
		for(int i = 0; i < splitActual.length; i++) {
			assertEquals(splitExpected[i], splitActual[i]);
		}
		
		testsPassed++;
	} //testWriteGradesToFile01
	
	@Test
	public void testWriteGradesToFile02() {
		numberOfTests++;
		String lastname = "Gilmore";
		assertTrue(this.actualFileString.contains(lastname));
		String actualLine = this.actualFileString.substring(this.actualFileString.indexOf(lastname));
		actualLine = (actualLine.contains("\n")) ? actualLine.substring(0, actualLine.indexOf("\n")) : actualLine;
		
		String expectedLine = this.expectedFileString.substring(this.expectedFileString.indexOf(lastname));
		expectedLine = (expectedLine.contains("\n")) ? expectedLine.substring(0, expectedLine.indexOf("\n")) : expectedLine;
		
		String[] splitActual = actualLine.split(",");
		String[] splitExpected = expectedLine.split(",");
		for(int i = 0; i < splitActual.length; i++) {
			assertEquals(splitExpected[i], splitActual[i]);
		}
		
		testsPassed++;
	} //testWriteGradesToFile02
	
	@Test
	public void testWriteGradesToFile03() {
		numberOfTests++;
		String lastname = "Kapoor";
		assertTrue(this.actualFileString.contains(lastname));
		String actualLine = this.actualFileString.substring(this.actualFileString.indexOf(lastname));
		actualLine = (actualLine.contains("\n")) ? actualLine.substring(0, actualLine.indexOf("\n")) : actualLine;
		
		String expectedLine = this.expectedFileString.substring(this.expectedFileString.indexOf(lastname));
		expectedLine = (expectedLine.contains("\n")) ? expectedLine.substring(0, expectedLine.indexOf("\n")) : expectedLine;
		
		String[] splitActual = actualLine.split(",");
		String[] splitExpected = expectedLine.split(",");
		for(int i = 0; i < splitActual.length; i++) {
			assertEquals(splitExpected[i], splitActual[i]);
		}
		
		testsPassed++;
	} //testWriteGradesToFile03
	
	@Test
	public void testWriteGradesToFile04() {
		numberOfTests++;
		String lastname = "Knope";
		assertTrue(this.actualFileString.contains(lastname));
		String actualLine = this.actualFileString.substring(this.actualFileString.indexOf(lastname));
		actualLine = (actualLine.contains("\n")) ? actualLine.substring(0, actualLine.indexOf("\n")) : actualLine;
		
		String expectedLine = this.expectedFileString.substring(this.expectedFileString.indexOf(lastname));
		expectedLine = (expectedLine.contains("\n")) ? expectedLine.substring(0, expectedLine.indexOf("\n")) : expectedLine;
		
		String[] splitActual = actualLine.split(",");
		String[] splitExpected = expectedLine.split(",");
		for(int i = 0; i < splitActual.length; i++) {
			assertEquals(splitExpected[i], splitActual[i]);
		}
		
		testsPassed++;
	} //testWriteGradesToFile04
	
	@Test
	public void testWriteGradesToFile05() {
		numberOfTests++;
		String lastname = "Miller";
		assertTrue(this.actualFileString.contains(lastname));
		String actualLine = this.actualFileString.substring(this.actualFileString.indexOf(lastname));
		actualLine = (actualLine.contains("\n")) ? actualLine.substring(0, actualLine.indexOf("\n")) : actualLine;
		
		String expectedLine = this.expectedFileString.substring(this.expectedFileString.indexOf(lastname));
		expectedLine = (expectedLine.contains("\n")) ? expectedLine.substring(0, expectedLine.indexOf("\n")) : expectedLine;
		
		String[] splitActual = actualLine.split(",");
		String[] splitExpected = expectedLine.split(",");
		for(int i = 0; i < splitActual.length; i++) {
			assertEquals(splitExpected[i], splitActual[i]);
		}
		
		testsPassed++;
	} //testWriteGradesToFile05
	
	@Test
	public void testWriteGradesToFile06() {
		numberOfTests++;
		String lastname = "Hudson";
		assertTrue(this.actualFileString.contains(lastname));
		String actualLine = this.actualFileString.substring(this.actualFileString.indexOf(lastname));
		actualLine = (actualLine.contains("\n")) ? actualLine.substring(0, actualLine.indexOf("\n")) : actualLine;
		
		String expectedLine = this.expectedFileString.substring(this.expectedFileString.indexOf(lastname));
		expectedLine = (expectedLine.contains("\n")) ? expectedLine.substring(0, expectedLine.indexOf("\n")) : expectedLine;
		
		String[] splitActual = actualLine.split(",");
		String[] splitExpected = expectedLine.split(",");
		for(int i = 0; i < splitActual.length; i++) {
			assertEquals(splitExpected[i], splitActual[i]);
		}
		
		testsPassed++;
	} //testWriteGradesToFile06
	
	@Test
	public void testWriteGradesToFile07() {
		numberOfTests++;
		String lastname = "Swanson";
		String firstname = "Tammy";
		assertTrue(this.actualFileString.contains(lastname));
		assertTrue(this.actualFileString.contains(firstname));
		boolean foundRight = false;
		String actualLine = this.actualFileString;
		while(!foundRight) {
			actualLine = actualLine.substring(actualLine.indexOf(lastname));
			String tempLine = (actualLine.contains("\n")) ? actualLine.substring(0, actualLine.indexOf("\n")) : actualLine;
			if(tempLine.contains(firstname)) {
				actualLine = tempLine;
				foundRight = true;
			} else {
				actualLine = actualLine.substring(actualLine.indexOf("\n"));
			}
		}
		
		String expectedLine = this.expectedFileString;
		foundRight = false;
		while(!foundRight) {
			expectedLine = expectedLine.substring(expectedLine.indexOf(lastname));
			String tempLine = (expectedLine.contains("\n")) ? expectedLine.substring(0, expectedLine.indexOf("\n")) : expectedLine;
			if(tempLine.contains(firstname)) {
				expectedLine = tempLine;
				foundRight = true;
			} else {
				expectedLine = expectedLine.substring(expectedLine.indexOf("\n"));
			}
		}
		
		String[] splitActual = actualLine.split(",");
		String[] splitExpected = expectedLine.split(",");
		for(int i = 0; i < splitActual.length; i++) {
			assertEquals(splitExpected[i], splitActual[i]);
		}
		
		testsPassed++;
	} //testWriteGradesToFile07
	
	
}
