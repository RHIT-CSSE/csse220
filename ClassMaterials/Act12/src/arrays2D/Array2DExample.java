package arrays2D;

/**
 * A simple example of using a 2D array in Java. 
 * 
 * @author CSSE Faculty
 */
public class Array2DExample {
    
    public static void main(String[] args) {

        // Create a 2D array with 3 rows and 4 columns
        int[][] grid = new int[3][4];

        // Fill the array with values
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                grid[row][col] = row * col;
            }
        }

        // Print the array
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                System.out.print(grid[row][col] + "\t");
            }
            System.out.println();
        }
    }

}