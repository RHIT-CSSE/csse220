package refactoring;

import java.awt.Color;
import java.awt.Point;

// FIXME: this App uses POOR DESIGN.
// Can you fix it to use GOOD DESIGN?
public class App {

	private Diamond[] diamondTiles;
	private Dirt[] dirtTiles;
	private Rock[] rockTiles;

	public static void main(String[] args) {
		Diamond[] diamondTiles = new Diamond[1];
		diamondTiles[0] = new Diamond(0, 0);
		// For testing purposes: mutate the above diamond tile.
		boolean[] shouldMutateDiamond = new boolean[1]; 
		shouldMutateDiamond[0] = true;
		
		Dirt[] dirtTiles = new Dirt[2];
		dirtTiles[0] = new Dirt(new Point(1, 0), Color.BLACK);
		dirtTiles[1] = new Dirt(new Point(0, 1), Color.BLACK);
		// Mutate the first dirt tile, but not the second.
		boolean[] shouldMutateDirt = new boolean[2];
		shouldMutateDirt[0] = true; 
		shouldMutateDirt[1] = false;
		
		Rock[] rockTiles = new Rock[1];
		int[] rockXY = new int[2];
		rockXY[0] = 1; // x
		rockXY[1] = 1; // y
		rockTiles[0] = new Rock(rockXY);
		// Mutate the rock.
		boolean[] shouldMutateRock = new boolean[1];
		shouldMutateRock[0] = true;
		
		App app = new App(diamondTiles,
				dirtTiles,
				rockTiles);
				
		app.handleMutate(shouldMutateDiamond, shouldMutateDirt, shouldMutateRock);
		app.handlePrintPositions();

	}

	public App(Diamond[] diamondTiles, Dirt[] dirtTiles, Rock[] rockTiles) {
		this.diamondTiles = diamondTiles;
		this.dirtTiles = dirtTiles;
		this.rockTiles = rockTiles;
	}

	public void handleMutate(boolean[] shouldMutateDiamond, boolean[] shouldMutateDirt, boolean[] shouldMutateRock) {
		for (int i = 0; i < diamondTiles.length; i++) {
			if (shouldMutateDiamond[i]) {
				diamondTiles[i].doubleYield();
			}
		}

		for (int i = 0; i < dirtTiles.length; i++) {
			if (shouldMutateDirt[i]) {
				dirtTiles[i].randomColor();
			}
		}

		for (int i = 0; i < rockTiles.length; i++) {
			if (shouldMutateRock[i]) {
				rockTiles[i].reverseGravity();
			}
		}
	}

	public void handlePrintPositions() {
		for (Diamond dTile : diamondTiles) {
			System.out.println(dTile.tileX + " " + dTile.tileY);
		}
		for (Dirt dTile : dirtTiles) {
			System.out.println(dTile.position.x + " " + dTile.position.y);
		}
		for (Rock rockTile : rockTiles) {
			System.out.println(rockTile.position[0] + " " + rockTile.position[1]);
		}
	}

}
