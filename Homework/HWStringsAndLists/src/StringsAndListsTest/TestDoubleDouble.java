package StringsAndListsTest;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;
import org.junit.runner.RunWith;

import StringsAndLists.StringsAndLists;

@RunWith(RunAllTestsTestRunner.class)

public class TestDoubleDouble {

	private ArrayList<String> toAL(String[] array) {
		ArrayList<String> output = new ArrayList<String>();
		for (String s : array) {
			output.add(s);
		} // end for
		return output;
	} // toAL

	@Test
	public void testDoubleDoubleN01() {
		String[] a = { "foo", "double" };
		String[] aSolution = { "foo", "double", "double" };
		assertEquals(toAL(aSolution), StringsAndLists.doubleDouble(toAL(a)));
	}

	@Test
	public void testDoubleDoubleN02() {
		String[] b = { "double", "foo", "double", "bar" };
		String[] bSolution = { "double", "double", "foo", "double", "double", "bar" };
		assertEquals(toAL(bSolution), StringsAndLists.doubleDouble(toAL(b)));
	}

	@Test
	public void testDoubleDoubleN03() {
		String[] c = {};
		assertEquals(toAL(c), StringsAndLists.doubleDouble(toAL(c)));
	}

	@Test
	public void testDoubleDoubleN04() {
		String[] d = { "foo", "bar" };
		assertEquals(toAL(d), StringsAndLists.doubleDouble(toAL(d)));
	}

}
