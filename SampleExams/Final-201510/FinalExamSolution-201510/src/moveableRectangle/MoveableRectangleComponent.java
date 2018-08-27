package moveableRectangle;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

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
public class MoveableRectangleComponent extends JComponent implements Runnable {

	private MoveableRectangle basicRect;
	
	// Hint: you'll use this for part one
	private MouseMoveableRectangle mouseRect;
	
	// Hint: you'll use this for part 2
	private ButtonMoveableRectangle buttonRect;
	
	// Hint: you MUST use this for part 3
	private MoveableRectangle[] rectangles;
	
	
	/**
	 * Makes the component and creates rectangles.
	 * 
	 * @param frame passed in so you can add buttons
	 */
	public MoveableRectangleComponent(JFrame frame) {
		
		basicRect = new MoveableRectangle(Color.GREEN);
		basicRect.setxVelocity(1);
		
		mouseRect = new MouseMoveableRectangle(Color.YELLOW);
		this.addMouseListener(mouseRect);

		buttonRect = new ButtonMoveableRectangle(Color.BLUE);
		JPanel panel = new JPanel();
		JButton up = new JButton("UP");
		panel.add(up);
		up.addActionListener(buttonRect);
		JButton down = new JButton("DOWN");
		panel.add(down);
		down.addActionListener(buttonRect);
		JButton left = new JButton("LEFT");
		panel.add(left);
		left.addActionListener(buttonRect);
		JButton right = new JButton("RIGHT");
		panel.add(right);
		right.addActionListener(buttonRect);
		frame.add(panel, BorderLayout.SOUTH);
		
		rectangles = new MoveableRectangle[10];
		Random r = new Random();
		for(int i = 0; i < 10; i++) {
			if(r.nextBoolean()) {
				MouseMoveableRectangle mouse = new MouseMoveableRectangle(Color.PINK);
				this.addMouseListener(mouse);
				rectangles[i] = mouse;
			} else {
				ButtonMoveableRectangle button = new ButtonMoveableRectangle(Color.PINK);
				up.addActionListener(button);
				down.addActionListener(button);
				left.addActionListener(button);
				right.addActionListener(button);
				rectangles[i] = button;
			}
		}
		
		Thread t = new Thread(this);
		t.start();
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		basicRect.drawOn(g2);
		mouseRect.drawOn(g2);
		buttonRect.drawOn(g2);
		for(MoveableRectangle r : rectangles) {
			r.drawOn(g2);
		}
		
	}

	@Override
	public void run() {
		while(true) {
			basicRect.updatePosition(this.getWidth(), this.getHeight());
			mouseRect.updatePosition(this.getWidth(), this.getHeight());
			buttonRect.updatePosition(this.getWidth(), this.getHeight());
			for(MoveableRectangle r : rectangles) {
				r.updatePosition(this.getWidth(), this.getHeight());
			}
			this.repaint();
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}



}
