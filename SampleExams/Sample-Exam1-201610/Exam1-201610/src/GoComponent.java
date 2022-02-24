import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class GoComponent extends JComponent {

	@Override
	protected void paintComponent(Graphics g) {
		
		super.paintComponent(g);

		Graphics2D g2 = (Graphics2D) g;
		GoBoard board = new GoBoard();
		
		g2.setColor(Color.green);
		//your go board should fit within this rectangle
		g2.drawRect(65, 65, 270, 270);
		g2.setColor(Color.black);
		
		//you'll make these function calls work in part2
		board.placeStone(Color.black, 0, 0);
		board.placeStone(Color.white, -1, -1);
		board.placeStone(Color.black, 4, 4);
		board.placeStone(Color.white, 0, 2);
		board.placeStone(Color.black, -4, 4);
		board.placeStone(Color.white, -3, -3);
		
		board.drawOn(g2);

	}
		
}
