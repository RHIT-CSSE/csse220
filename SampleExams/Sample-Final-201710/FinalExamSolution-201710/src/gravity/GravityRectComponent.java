package gravity;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JComponent;
import javax.swing.JFrame;

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
public class GravityRectComponent extends JComponent implements Runnable, MouseListener {

	public static final int FLOOR_HEIGHT=450;
	private ArrayList<GravityRect> rects;
	
	/**
	 * Makes the component and creates rectangles.
	 * 
	 * @param frame passed in so you can add buttons
	 */
	public GravityRectComponent(JFrame frame) {
		rects = new ArrayList<GravityRect>();
		rects.add(new GravityRect(200,200));
		rects.add(new GravityRect(400,350));
		
		Thread t = new Thread(this);
		t.start();
		
		addMouseListener(this);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		for(GravityRect r : rects) {
			r.drawOn(g2);
		}
		
		//the ground
		g2.setColor(new Color(0,100,0));
		g2.fillRect(0, FLOOR_HEIGHT, getWidth(), getHeight() - FLOOR_HEIGHT);
		
	}

	@Override
	public void run() {
		while(true) {
			for(GravityRect r : rects) {
				r.drop();
			}
			this.repaint();
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// probably not the best error handling technique
				e.printStackTrace();
			}
		}
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub.
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub.
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub.
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if(e.isControlDown()) {
			rects.add(new PinkRect(e.getX(), e.getY()));
			return;
		}
		if(e.isShiftDown()) {
			rects.add(new FastRect(e.getX(), e.getY()));
			return;
		}
		rects.add(new GravityRect(e.getX(), e.getY()));
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub.
		
	}



}
