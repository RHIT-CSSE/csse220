package sllAlgorithmsTest;
import static org.junit.Assert.fail;
import org.junit.Test;
import org.junit.runner.RunWith;
import sll.ILinkedList;
import sll.SinglyLinkedList;
import sllAlgorithms.Algorithms;

@RunWith(RunAllTestsTestRunner.class)
public class TestRecursiveGetExceptionHandling {

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	@Test
	public void testGetExceptionHandlingN01() {
		Boolean threwIndexOutOfBoundsException = false;
		Boolean threwUnsupportedOperationException = false;
		ILinkedList list1 = new SinglyLinkedList();

		try {
			Algorithms.recursiveGet(0, list1.getFirst());
		} catch (IndexOutOfBoundsException e) {
			// recursiveGet successfully threw IndexOutOfBoundsException
			threwIndexOutOfBoundsException = true;
		} catch (UnsupportedOperationException e) {
			// No work done yet on recursiveGet, it still has initial throw
			threwUnsupportedOperationException = true;
			throw e;
		} finally {
			if (!threwUnsupportedOperationException) {
				// Work has been done on recursiveGet, programmer has
				// deleted initial throw and started coding a solution
				if(!threwIndexOutOfBoundsException) {
					// However, programmer is not successfully detecting 
					// index out of bounds error
					fail("Failed to throw IndexOutOfBoundsException ");
				}
			}			
		} // end try-catch			
	} // testGetExceptionHandlingN01
	
	@Test
	public void testGetExceptionHandlingN02() {
		Boolean threwIndexOutOfBoundsException = false;
		Boolean threwUnsupportedOperationException = false;
		ILinkedList list1 = new SinglyLinkedList();
		
		list1.add(13);
		list1.add(21);
		list1.add(34);
		list1.add(55);
		list1.add(89);

		try {
			Algorithms.recursiveGet(-1, list1.getFirst());
		} catch (IndexOutOfBoundsException e) {
			// recursiveGet successfully threw IndexOutOfBoundsException
			threwIndexOutOfBoundsException = true;
		} catch (UnsupportedOperationException e) {
			// No work done yet on recursiveGet, it still has initial throw
			threwUnsupportedOperationException = true;
			throw e;
		} finally {
			if (!threwUnsupportedOperationException) {
				// Work has been done on recursiveGet, programmer has
				// deleted initial throw and started coding a solution
				if(!threwIndexOutOfBoundsException) {
					// However, programmer is not successfully detecting 
					// index out of bounds error
					fail("Failed to throw IndexOutOfBoundsException ");
				}
			}			
		} // end try-catch			
	} // testGetExceptionHandlingN02
	
	@Test
	public void testGetExceptionHandlingN03() {
		Boolean threwIndexOutOfBoundsException = false;
		Boolean threwUnsupportedOperationException = false;
		ILinkedList list1 = new SinglyLinkedList();
		
		list1.add(13);
		list1.add(21);
		list1.add(34);
		list1.add(55);
		list1.add(89);
		try {
			Algorithms.recursiveGet(5, list1.getFirst());
		} catch (IndexOutOfBoundsException e) {
			// recursiveGet successfully threw IndexOutOfBoundsException
			threwIndexOutOfBoundsException = true;
		} catch (UnsupportedOperationException e) {
			// No work done yet on recursiveGet, it still has initial throw
			threwUnsupportedOperationException = true;
			throw e;
		} finally {
			if (!threwUnsupportedOperationException) {
				// Work has been done on recursiveGet, programmer has
				// deleted initial throw and started coding a solution
				if(!threwIndexOutOfBoundsException) {
					// However, programmer is not successfully detecting 
					// index out of bounds error
					fail("Failed to throw IndexOutOfBoundsException ");
				}
			}			
		} // end try-catch			
	} // testGetExceptionHandlingN03
	
	@Test
	public void testGetExceptionHandlingN04() {
		Boolean threwIndexOutOfBoundsException = false;
		Boolean threwUnsupportedOperationException = false;
		ILinkedList list1 = new SinglyLinkedList();
		
		list1.add(13);
		list1.add(21);
		list1.add(34);
		list1.add(55);
		list1.add(89);
		try {
			Algorithms.recursiveGet(1, list1.getLast());
		} catch (IndexOutOfBoundsException e) {
			// recursiveGet successfully threw IndexOutOfBoundsException
			threwIndexOutOfBoundsException = true;
		} catch (UnsupportedOperationException e) {
			// No work done yet on recursiveGet, it still has initial throw
			threwUnsupportedOperationException = true;
			throw e;
		} finally {
			if (!threwUnsupportedOperationException) {
				// Work has been done on recursiveGet, programmer has
				// deleted initial throw and started coding a solution
				if(!threwIndexOutOfBoundsException) {
					// However, programmer is not successfully detecting 
					// index out of bounds error
					fail("Failed to throw IndexOutOfBoundsException ");
				}
			}			
		} // end try-catch			

	} // testGetExceptionHandlingN04

} // end class TestRecursiveGetExceptionHandling
