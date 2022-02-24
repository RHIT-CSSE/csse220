import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;

import javax.swing.JComponent;

public class RectComponent extends JComponent {

	@Override
	protected void paintComponent(Graphics g) {
		
		super.paintComponent(g);

		Graphics2D g2 = (Graphics2D) g;
		
		/* 
		  // FINAL QUESTION STAGE 1
		  // uncomment the code below for stage 1
		  // DO NOT modify it for full credit
		  // You will need to create a new RedRect class
		
		RedRect example1 = new RedRect(210,210,250,250); //x = 210, y = 210 upper left
		                                                 //x = 250, y = 250 lower right
		example1.draw(g2);
		RedRect example2 = new RedRect(215,260,260,305);
		example2.draw(g2);
		RedRect example3 = new RedRect(280,290,335,310);
		example3.draw(g2);
		
		*/

		/* 
		  // FINAL QUESTION STAGE 2
		  // uncomment the code below for stage 2
		  // DO NOT modify it for full credit
		  // You will need to modify your RedRect class

		  // HINT: Get random integers like this
		  // Random r = new Random();
		  // int numBetweenZeroAnd400 = r.nextInt(400);
		
		RedRect random1 = new RedRect(); //randomly picks a position and size
		random1.draw(g2);
		RedRect random2 = new RedRect();
		random2.draw(g2);
		*/

		
		/* 
		  // FINAL QUESTION STAGE 3
		  // uncomment the code below for stage 3
		  // DO NOT modify it for full credit
		  //
		  // You will need to modify your RedRect class &
		  // create a new RectContainer class

		RectContainer container1 = new RectContainer();
		container1.addRect(example1);
		container1.addRect(example2);
		container1.addRect(example3);
		container1.draw(g2); //should exactly contain 3 added Rects
		
		RectContainer container2 = new RectContainer();
		container2.addRect(random1);
		container2.addRect(random2);
		container2.draw(g2);
		*/
		
	}
		
}
