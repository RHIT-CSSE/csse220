package firstRecursion;

/**
 * Introduction to recursion using the movie Inception as a metaphor.
 *
 * @author Ian Ludden
 */
public class Inception {

    /**
     * Simulates going deeper into a dream.
     * Returns a message "A dream within a dream within a dream...",
     * repeating "within a dream" to match the depth of recursion.
     * <br>
     * requires:  depth >= 1
     * <br>
     * @param depth the number of dream levels
     * @return a string representing the nested dreams
     */
    private static String dream(int depth) {
        // TODO: Implement this method using recursion.
        return null;
    }

    public static void main(String[] args) {
        int depth = 3; // Change this value to test different depths
        String result = dream(depth);
        System.out.println(result);
    }

}
