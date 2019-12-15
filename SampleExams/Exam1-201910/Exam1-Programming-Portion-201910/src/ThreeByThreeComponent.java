import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class ThreeByThreeComponent extends JComponent {

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;

		g2.drawString("Part 1", 30, 400);
		g2.drawString("Part 2", 160, 400);
		g2.drawString("Part 3", 290, 400);
		g2.drawString("Part 4", 420, 650);
		
		// Part 1
		ThreeByThree upperLeft = new ThreeByThree();
		upperLeft.drawOn(g2);
		
		
		// Part 2
		
//		ThreeByThree upperGray = new ThreeByThree(130, 30, Color.GRAY);
//		upperGray.drawOn(g2);
//		
//		ThreeByThree lowerYellow = new ThreeByThree(130, 130, Color.YELLOW);
//		lowerYellow.drawOn(g2);
	
		// Part 3
//		ThreeByThree coloredLowerRow = new ThreeByThree(260, 30, Color.WHITE);
//		coloredLowerRow.setCellColor(2, 0, Color.RED);
//		coloredLowerRow.setCellColor(2, 1, Color.GREEN);
//		coloredLowerRow.setCellColor(2, 2, Color.BLUE);
//		coloredLowerRow.drawOn(g2);
//		
//		ThreeByThree coloredLeftCol = new ThreeByThree(260, 130, Color.LIGHT_GRAY);
//		coloredLeftCol.setCellColor(0, 0, Color.RED);
//		coloredLeftCol.setCellColor(1, 0, Color.GREEN);
//		coloredLeftCol.setCellColor(2, 0, Color.BLUE);
//		coloredLeftCol.drawOn(g2);
//		
		// Part 4
//		ThreeByThree source3x3 = new ThreeByThree(390, 30, Color.CYAN);
//		source3x3.setCellColor(1, 1, Color.RED);
//		source3x3.drawOn(g2);
//		
//		ThreeByThree target1 = source3x3.copyTo(390, 130);
//		target1.drawOn(g2);
//		
//		ThreeByThree target2 = source3x3.copyTo(390, 230);
//		target2.setCellColor(2, 0, Color.BLACK);
//		target2.drawOn(g2);
//		
//		ThreeByThree target3 = source3x3.copyTo(390, 330);
//		target3.setCellColor(2, 2, Color.BLACK);
//		target3.drawOn(g2);
//		
//		ThreeByThree target4 = source3x3.copyTo(390, 430);
//		target4.setCellColor(0, 2, Color.BLACK);
//		target4.drawOn(g2);
//		
//		ThreeByThree target5 = target2.copyTo(390, 530);
//		target5.setCellColor(2, 2, Color.BLACK);
//		target5.drawOn(g2);
	}

}
