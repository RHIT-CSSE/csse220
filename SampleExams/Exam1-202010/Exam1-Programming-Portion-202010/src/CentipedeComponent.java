import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class CentipedeComponent extends JComponent {

	// You should not need to modify this class, except for
	// uncommenting the parts
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;

		g2.drawString("Part 1", 30, 400);
		g2.drawString("Part 2", 200, 400);
		g2.drawString("Part 3", 450, 400);
		g2.drawString("Part 4", 420, 650);
		
		// Part 1
		Centipede upperLeft = new Centipede();
		upperLeft.drawOn(g2);
		
		// Part 2 - UNCOMMENT WHEN READY
		/* 
		Centipede part2a = new Centipede(200,30, 2, 5);
		part2a.drawOn(g2);
		
		Centipede part2b = new Centipede(200, 230, 3, 6);
		part2b.drawOn(g2);
		*/
		
		// Part 3 - UNCOMMENT WHEN READY
		
		/*
		Centipede part3a = new Centipede(450,30, 3, 3);
		for(int i = 1; i < 6; i++) {
			part3a.setColor(Color.yellow, i);
		}
		part3a.drawOn(g2);
		
		Centipede part3b = new Centipede(450,200, 4, 3);
		
		part3b.setColor(Color.red, 1);
		part3b.setColor(Color.orange, 2);
		part3b.setColor(Color.yellow, 3);
		part3b.setColor(Color.green, 4);
		part3b.setColor(Color.blue, 5);
		part3b.setColor(Color.magenta, 6);
		
		part3b.drawOn(g2);
		*/
		// Part 4 - UNCOMMENT WHEN READY
		/*
		int xPos = 30;
		for(double i = 90; i >= 0; i -= 15) {
			Centipede part4 = new Centipede(xPos,500, 2, 3);
			part4.setRotation(i);
			xPos += 125;
			part4.drawOn(g2);
		}
		*/
	}

}
