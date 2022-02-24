import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class ExceptionTest {

	@Test
	public void testConvertToInts() {
		String[] input1 = {"1", "2", "3"};
		String[] input2 = {"abc", "1", "2", "qqq", "3", "4", "xy"};
		ArrayList<Integer> correct = new ArrayList<Integer>();
		correct.add(1);
		correct.add(2);
		correct.add(3);
		assertEquals(correct, Exception.convertToInts(input1));
		correct.add(4);
		assertEquals(correct, Exception.convertToInts(input2));
	}

}
