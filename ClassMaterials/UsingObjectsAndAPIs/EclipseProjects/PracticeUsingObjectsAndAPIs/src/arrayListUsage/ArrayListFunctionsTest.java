package arrayListUsage;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class ArrayListFunctionsTest {

	@Test
	public void testArraylistOfAs() {
		String[] t1 = {"Ab","x","c"};
		assertEquals("[Ab]", ArrayListFunctions.arraylistOfAs(t1).toString());
		String[] t2 = {"Foo","Bar"};
		assertEquals("[]", ArrayListFunctions.arraylistOfAs(t2).toString());
		String[] t3 = {"Aaaa","","Apple"};
		assertEquals("[Aaaa, Apple]", ArrayListFunctions.arraylistOfAs(t3).toString());
	}

	@Test
	public void testInsertIntoSorted() {
		ArrayList<Integer> test = new ArrayList<Integer>();
		ArrayListFunctions.insertIntoSorted(test, 1);
		assertEquals("[1]", test.toString());
		ArrayListFunctions.insertIntoSorted(test, -1);
		assertEquals("[-1, 1]", test.toString());
		ArrayListFunctions.insertIntoSorted(test, 6);
		assertEquals("[-1, 1, 6]", test.toString());
		ArrayListFunctions.insertIntoSorted(test, 4);
		assertEquals("[-1, 1, 4, 6]", test.toString());
	}

	@Test
	public void testRemoveLongStrings() {
		ArrayList<String> test = new ArrayList<String>();
		test.add("a");
		test.add("aaaaaa");
		test.add("b");
		test.add("bbbbbbbbb");
		ArrayListFunctions.removeLongStrings(test);
		assertEquals("[a, b]", test.toString());

		test = new ArrayList<String>();
		test.add("a");
		test.add("aaaaaa");
		test.add("bbbbbbbbb");
		test.add("b");
		ArrayListFunctions.removeLongStrings(test);
		assertEquals("[a, b]", test.toString());
	}

}
