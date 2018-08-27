package gravity;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JComponent;

/**
 * Component where drawing is done.  Also handles the threads.
 * 
 * You'll mostly make modifications to this class,
 * as well as develop some classes of your own.
 * 
 * @author hewner
 *
 */
@SuppressWarnings("serial")
public class GravityRectComponent extends JComponent {

	public static final int FLOOR_HEIGHT=450;
		
	@Override
	protected void paintComponent(Graphics g) {

		Graphics2D g2 = (Graphics2D) g;
		
		// HINT: you might want to make rects a 
		// field and move initialization to a
		// constructor
		ArrayList<GravityRect> rects;
		rects = new ArrayList<GravityRect>();
		rects.add(new GravityRect(200,200));
		rects.add(new GravityRect(400,350));

		for(GravityRect r : rects) {
			r.drawOn(g2);
		}
		
		//the ground
		g2.setColor(new Color(0,100,0));
		g2.fillRect(0, FLOOR_HEIGHT, getWidth(), getHeight() - FLOOR_HEIGHT);
		
	}


}
