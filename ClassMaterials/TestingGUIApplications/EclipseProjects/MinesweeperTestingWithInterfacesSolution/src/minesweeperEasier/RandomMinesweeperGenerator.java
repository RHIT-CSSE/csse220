package minesweeperEasier;

import java.util.Random;

public class RandomMinesweeperGenerator implements MinesweeperGenerator {

	private int gameSize;

	public RandomMinesweeperGenerator(int gameSize) {
		this.gameSize = gameSize;
	}
	
	@Override
	public boolean[][] getMinesweeperGame() {
		boolean[][] mines = new boolean[this.gameSize][this.gameSize];
		
		Random r = new Random();

		for(int i = 0; i < this.gameSize; i++) {
			for(int j = 0; j < this.gameSize; j++) {
				if(r.nextDouble() < .3) {
					mines[i][j] = true;
				}
			}
		}
		return mines;
	}
}
