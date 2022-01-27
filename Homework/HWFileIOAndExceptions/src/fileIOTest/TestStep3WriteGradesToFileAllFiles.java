package fileIOTest;

import static org.junit.Assert.*;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import fileIO.ReadAndGradeMain;
import fileIO.RunAllTests;


public class TestStep3WriteGradesToFileAllFiles {
	
	private static int testsPassed;
	private static int numberOfTests;
	
	private ReadAndGradeMain fileProg;
	private ArrayList<String> actualFileStrings;
	private ArrayList<String> expectedFileStrings;

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
		this.fileProg.step2GetFileAverages("allGrades/");
		this.fileProg.step3WriteGradesToFile();
		this.actualFileStrings = new ArrayList<String>();
		this.expectedFileStrings = new ArrayList<String>();
		
		Scanner scanner = new Scanner(new File("AllAveragedGrades.csv"));
		while(scanner.hasNext()) 
			this.actualFileStrings.add(scanner.nextLine().toLowerCase().trim().replaceAll(" ", ""));
		scanner.close();
		
		Scanner scanner2 = new Scanner(new File("originalFilesDoNotUseOrChange/WhatAllAveragedGradesShouldBeWhenFinished.csv"));
		while(scanner2.hasNext()) 
			this.expectedFileStrings.add(scanner2.nextLine().toLowerCase().trim().replaceAll(" ", ""));
		scanner2.close();
		
		Collections.sort(this.actualFileStrings);
		Collections.sort(this.expectedFileStrings);
	}

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestStep3WriteGradesToFileAllFiles.class.getSimpleName();
		RunAllTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	
	@Test
	public void testWriteGradesToFile() {
		for(int i = 0; i < this.expectedFileStrings.size(); i++) {
			numberOfTests++;
			assertEquals(this.expectedFileStrings.get(i), this.actualFileStrings.get(i));
			testsPassed++;
		}
	} //testWriteGradesToFile
}
