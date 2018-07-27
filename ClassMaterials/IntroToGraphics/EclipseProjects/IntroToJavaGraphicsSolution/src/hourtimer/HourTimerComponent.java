package hourtimer;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;

public class HourTimerComponent extends JComponent {

	@Override
	protected void paintComponent(Graphics g) {
		
		super.paintComponent(g);

		Graphics2D g2 = (Graphics2D) g;
		
		//make things look slightly prettier
		g2.setRenderingHint(
			    RenderingHints.KEY_ANTIALIASING,
			    RenderingHints.VALUE_ANTIALIAS_ON);
		
		//just some guide lines to make the geometry more obvious
		drawDottedLines(g2);

		//Stage 1
		HourTimer bigClock = new HourTimer();
		bigClock.drawOn(g2);
		
		
		
		//Stage 2
		
		int clockRadius = 50;
		int clockCenterY = 50;
		for(int clockCenterX = 350; clockCenterX < 600; clockCenterX += 100) {
			HourTimer upperRightClock = new HourTimer(clockCenterX, clockCenterY, clockRadius);
			upperRightClock.drawOn(g2);
		}
		//draw a 20x20 clock in the upper left hand corner
		
		HourTimer upperLeftClock = new HourTimer(10, 10, 10);
		upperLeftClock.drawOn(g2);
		
		
		
		//Stage 3
		
		int clockTime = 0;
		clockCenterY = 550;
		for(int clockCenterX = 50; clockCenterX < 600; clockCenterX += 100) {
			HourTimer lowerClock = new HourTimer(clockCenterX, clockCenterY, clockRadius);
			lowerClock.setTime(clockTime);
			lowerClock.drawOn(g2);
			clockTime += 10;
		}
		

	}
	
	public void drawDottedLines(Graphics2D g2){
		float dash1[] = {10.0f};
	    BasicStroke dashed = new BasicStroke(1.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 10.0f, dash1, 0.0f);
	    BasicStroke regular = new BasicStroke();
	    g2.setStroke(dashed);
		g2.drawLine(0, 300, 600, 300);
		g2.drawLine(300, 0, 300, 600);
		g2.setStroke(regular);

	}
	
}
