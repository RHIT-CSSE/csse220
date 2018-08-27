package events;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;

public class HourTimerComponent extends JComponent {

	private HourTimer bigClock;
	
	public HourTimerComponent() {
		bigClock = new HourTimer();
		bigClock.setHour(2); //sets the time to 2:00 as an example
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		
		super.paintComponent(g);

		Graphics2D g2 = (Graphics2D) g;
		
		//make things look slightly prettier
		g2.setRenderingHint(
			    RenderingHints.KEY_ANTIALIASING,
			    RenderingHints.VALUE_ANTIALIAS_ON);
		
		bigClock.drawOn(g2);
	}
	
	public void setHour(double hour) {
		bigClock.setHour(hour);
		repaint();
	}
}
