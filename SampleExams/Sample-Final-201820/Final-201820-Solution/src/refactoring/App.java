package refactoring;

import java.awt.Color;
import java.awt.Point;

// DONE: this App uses POOR DESIGN.
// Can you fix it to use GOOD DESIGN?
public class App {

	// NOTE: this is what a lazy student would do to refactor this code.
	Tile[] tiles;
	
	public static void main(String[] args){
		App app = new App(new Tile[]{
			new Diamond(new Point(0,0)), new Dirt(new Point(1,0), Color.BLACK),
			new Dirt(new Point(0,1), Color.BLACK), new Rock(new Point(1,1))
		});
		app.handleMutate(new boolean[]{true, true, false, true});
		app.handlePrintPositions();
	}

	
	public App(Tile[] tiles) {
		this.tiles = tiles;
	}	

	public void handleMutate(boolean[] shouldMutate) {
		for (int i = 0; i < tiles.length; i++) {
			if(shouldMutate[i]){
				tiles[i].mutate();
			}
		}
	}

	public void handlePrintPositions() {
		for (Tile tile : tiles) {
			System.out.println(tile.position.x + " " + tile.position.y);
		}
	}

}
