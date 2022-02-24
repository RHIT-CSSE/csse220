

import javax.swing.JComponent;
import javax.swing.JFrame;

public class CentipedeViewer {
	public static void main(String[] args) {
		JFrame frame2 = new JFrame();
		int frameWidth2 = 900;
		int frameHeight2 = 800;

		frame2.setSize(frameWidth2, frameHeight2);
		frame2.setTitle("Graphics Question");
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.setLocation(300, 0);
		
		JComponent component = new CentipedeComponent();
		frame2.add(component);

		frame2.setVisible(true);
		
		
		
		
		
	}
}
