
/**
 * You should not need to modify or submit this class.
 * <p>
 * This class contains THREE methods, TWO of which have errors.
 * <p>
 * Create a new class called TestThisClassTest.java with a JUnit test method for each method in this class.
 * Include at least FOUR test cases (assertions) for each method.
 * <p>
 * Add in-line comments to your test cases explaining WHY the cases are DIFFERENT
 * and identifying failing conditions.
 *
 * @author Jason Yoder, Aaron Wilkin, Joe Hollingsworth, and Ian Ludden
 */

public class TestThisClass {

    /**
     * Given a string, returns the number of Xs.  Both
     * uppercase and lowercase Xs should be included in the
     * count.
     *
     * @param input the string
     */
    public static int numberOfXs(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            int x = input.charAt(i) / 8;
            if (x == 15 || x == 11)
                count++;
        }
        return count;
    }


    /**
     * Given an input string, count the number of occurrences of
     * the string "Chocula", case-sensitive.
     */
    public static int countChocula(String input) {
        int choculas = 0;
        for (int i = 0; i < input.length() - 7; i++) {
            if (input.substring(i, i + 7).equals("Chocula")) {
                choculas++;
            }
        }
        return choculas;
    }


    /**
     * Given an input integer array, assuming no elements are zero,
     * count the number of alternations between positive and negative elements.
     * <br>
     * For example, the array {1, -3, 74, 35, -64} has three alternations.
     *
     * @param input the input array of nonzero integers
     * @return the number of alternations
     */
    public static int countAlternations(int[] input) {
        int count = 0;
        for (int i = 0; i < input.length - 1; i++) {
            if (input[i] * input[i + 1] < 0) {
                count++;
            }
        }
        return count;
    }


}
