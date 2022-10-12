package keystrokeHandlerExample;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class KHViewer {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Keystroke Handler Example");
		frame.setSize(500, 150);
		frame.setLocation(100, 350);
		
		KH keystrokeHandler = new KH();
		
		// Important piece of advice: add Key Listener to the frame
		frame.addKeyListener(keystrokeHandler);
		frame.add(new JComponent() {

			private static final long serialVersionUID = 1L;
			
			protected void paintComponent(Graphics g) {
				Graphics2D g2d = (Graphics2D) g;
				g2d.drawString("To Do:", 20, 20);
				g2d.drawString("   1) Type some keys, examine output sent to Console", 20, 40);
				g2d.drawString("   2) Examine code and comments in KHViewer.java and KH.java", 20, 60);
				g2d.drawString("   3) Use code from KHViewer.java and KH.java to solve your problem", 20, 80);
			}
		
		});
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.toFront();
		frame.requestFocus();
	}

}
