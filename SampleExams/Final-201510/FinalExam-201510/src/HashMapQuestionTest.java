import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;


public class HashMapQuestionTest {
	String[] unusableList;
	String[] listQuick;
	String[] listFox;
	String[] listDog;
	String[] listUnusable;
	String[] listNone;
	

	@Before
	public void setUp() throws Exception {
		String all = "the quick brown fox jumped over the lazy dog";
		String quick1 = "you gotta be quick";
		String quick2 = "that guy is quick";
		String fox1 = "is that a fox";
		String noFox1 = "have not the word";
		String fox2 = "what a fox";
		String noFox2 = "again no here";
		String fox3 = "fox trail";
		String noFox3 = "hard to do thrice";
		String dog1 = "what a dog";
		String dog2 = "that is a big dog";
		String dog3 = "little dogs bark a lot";
		String unusable1 = "a the an over but";
		String unusable2 = "a the over again";
		String unusable3 = "with a loud over tone but the";
		String unusable4 = "but but but another over the top";
		
		unusableList = new String[]{"a", "an", "the", "or", "but", "with", "for", "to"};
		listQuick = new String[]{all, quick1, quick2};
		listFox = new String[]{all, fox1, noFox1, fox2, noFox2, fox3, noFox3};
		listDog = new String[]{dog1, dog2, dog3};
		listUnusable = new String[]{all, unusable1, unusable2, unusable3, unusable4};
		listNone = unusableList;
	}

	@Test
	public void testFindMostCommon() {
		assertEquals("quick",HashMapQuestion.findMostCommon(unusableList, listQuick));
		assertEquals("fox",HashMapQuestion.findMostCommon(unusableList, listFox));
		assertEquals("dog",HashMapQuestion.findMostCommon(unusableList, listDog));
		assertEquals("over",HashMapQuestion.findMostCommon(unusableList, listUnusable));
		assertEquals("",HashMapQuestion.findMostCommon(unusableList, listNone));
	}

}
