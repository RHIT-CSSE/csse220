package Homework2DArrays;

import java.util.Random;
/**
 * 
 *	 For FUN: Extra Challenge Problem 
 *   (You can complete the incentive form on Moodle if you complete this)
 *	
 *	 If you want a challenge, this is a VERY cool application of 2DArrays. 
 *   If you enjoyed this problem feel free to ask your instructor more about it.
 * 
 * 	Class:FunGameOfLife
 * 	@author Jason Yoder (yoder1)
 * 	Purpose: provide additional practice with 2D arrays
 */
public class FunGameOfLife {

	
	/**
	 * Given a int[][] with the states of cells (all 1s or 0s) return a NEW int[][]
	 * with the state of all the cells in the next iteration of
	 * 
	 * Conway's Game of Life: https://en.wikipedia.org/wiki/Conway%27s_Game_of_Life
	 * 
	 * The rules are remarkably simple:
	 * 
	 * 1. A cell is considered alive if it has a 1 and dead if it contains a 0 2.
	 * Live cells stay alive if they have 2 or 3 neighbors that are alive 3. Dead
	 * cells become alive if they have exactly 3 live neighbors.
	 * 
	 * Each cell has 8 neighbors (all cardinal directions and diagonals) The grid
	 * should WRAP around the edges (effectively a torus) so that every cell has 8
	 * neighbors and edges touch one another.
	 * 
	 * 	 
	 *   0000              0000
	 *   0100    becomes   0000
	 *   0000              0000
	 *   
	 *   0000              0000
	 *   0110    becomes   0110
	 *   0110              0110
	 *   0000              0000
	 *   
	 *   
	 *   000000              000000
	 *   001000    becomes   000000
	 *   000100              010100
	 *   011100              001100
	 *   000000              001000
	 * 
	 * @param cells
	 * @return new int[][] with next iteration of cell states
	 * 
	 *         Hint: You will want two different int[][]s otherwise if you change one
	 *         cell then it impacts the calculation for the next cells that are its
	 *         neighbors, they should all be changed based on the prior state.
	 *         
	 *   If you do complete this, be sure to look below and uncomment the line
	 *   // randomizeWithSeed(cells, SEED);
	 *   to REALLY have some fun. :)
	 *         
	 */
	public static int[][] nextCells(int[][] cells) {
		// TODO: complete this method
		return null;
	} // nextCells

	
	public static final int SEED = 1;           // used to reproduce the same starting state
	public static final int DELAY = 25;         // determines the rate of visualization
	public static final int STEPS_TO_RUN = 100; // how many steps to simulate

	// A good default starting stake to see a "Glider" move across the grid
	public static int[][] gameOfLifeCells = { 	{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
												{ 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
												{ 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
												{ 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
												{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
												{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
												{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
												{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
												{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
												{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
												{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
												{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } };

	/**
	 * Run this file to visualize Conway's Game of Life
	 * 
	 * You do not have to modify this method. It creates a text visualization of the
	 * pattern of cells over time. You can set the DELAY value to adjust the rate at
	 * which it updates.
	 */
	public static void main(String[] args) {
		int[][] cells = gameOfLifeCells;

		// Having FUN yet? Use this to randomize the starting state and see what happens.
		// The SEED makes it so that the same random starting state will show up again
		// Otherwise if something cool happens you might not ever see it again...
		// randomizeWithSeed(cells, SEED);

		for (int i = 0; i < STEPS_TO_RUN; i++) {
			System.out.println("==================== step: " + i);
			// print to the console
			printGameOfLife(cells);
			// update state
			cells = nextCells(cells);

			// pause to slow down
			try {
				Thread.sleep(DELAY);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			;
		}
	}

	/**
	 * You do not have to modify this method.
	 * This is used to visualize the progress of Conway's Game of Life
	 * when main is run
	 * 
	 * @param cells
	 */
	public static void printGameOfLife(int[][] cells) {
		for (int r = 0; r < cells.length; r++) {
			String line = "";
			for (int c = 0; c < cells[0].length; c++) {
				line += cells[r][c] == 1 ? 'O' : ".";
			}
			System.out.println(line);
		}
	}

	/**
	 * You do not have to modify this method.
	 * 
	 * This method will generate a random configuration of the
	 * starting state of the grid, but will always reproduce
	 * the same state for a given random seed.
	 * https://en.wikipedia.org/wiki/Random_seed
	 * 
	 * @param cells, seed
	 */
	public static void randomizeWithSeed(int[][] cells, int seed) {
		Random rand = new Random(seed);
		for (int r = 0; r < cells.length; r++) {
			for (int c = 0; c < cells[r].length; c++) {
				//rand.nextInt(2) returns a 0 or 1
				cells[r][c] = rand.nextInt(2);
			}
		}
	}

}
