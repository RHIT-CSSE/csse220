
public class TestThisClass {

	/**
	 * Given 2 ranges of integers (inclusive), returns the number of integers
	 * in their intersection
	 * 
	 * For example
	 * intersectionSize 1,3 and 2,4 returns 2
	 *
	 * @param start1 start of the first range
	 * @param end1 end of the first range
	 * @param start2 start of the first range
	 * @param end2 end of the first range
	 * @return true if within circle
	 */
	public static int intersectionSize(int start1, int end1, int start2, int end2) {
		if(start1 > start2) { 
			return intersectionSize(start2, end2, start1, end1);
		}
		if(end1 < start2) return 0;
		int nearestEnd = Math.min(end1, end2);
		return nearestEnd - start2 + 1;
		
	}
}
