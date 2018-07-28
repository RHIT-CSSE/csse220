import java.util.HashMap;

public class MapAnd2DArrayProblems {
	
	/**
	 * Given array of positive integers, returns the sum of the largest column.
	 * 
	 * For example:
	 * {{1,2,3},	
	 *  {4,1,1}} returns 5
	 * 
	 * @param data
	 * @return
	 */
	public static int largestColumn(int[][] data) {
		int best = 0;
		for(int c = 0; c < data[0].length; c++) {
			int total = 0;
			for(int r = 0; r < data.length; r++) {
				total = total + data[r][c];
			}
			best = Math.max(total, best);
		}
		return best;
	}
	
	/**
	 * Given a hash map which may contain a duplicate value, returns the duplicate value.
	 * If there is no duplicate value, returns null.
	 * 
	 * For example:
	 * {"a"="1", "b"="2", "c"="2", "d"="3"} returns "2"
	 * {"a"="1", "b"="2","d"="3"} returns null
	 * 
	 * @param values
	 * @return
	 */
	public static String duplicateValue(HashMap<String,String> keysToValues) {
		HashMap<String,Boolean> values = new HashMap<String,Boolean>();
		
		for(String key : keysToValues.keySet()) {
			String value = keysToValues.get(key);
			if(values.containsKey(value)) return value;
			values.put(value, true);
		}
		return null;
		
	}
}
