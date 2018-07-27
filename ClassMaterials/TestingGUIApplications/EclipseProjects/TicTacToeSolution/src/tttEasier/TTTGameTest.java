package tttEasier;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TTTGameTest {

	@Test
	public void testWin1() {
		TTTGame game = new TTTGame();
		game.setPos(0, 0);
		game.setPos(1, 2);
		game.setPos(1, 1);
		game.setPos(0, 1);
		game.setPos(2, 2);
		assertEquals("X", game.getWinner());
	}

}
