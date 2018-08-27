package polymorphism;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * 
 * This class uses PoliceOfficerFace and FirefighterFace 
 * to draw two columns of faces.
 * 
 * However, there is duplication in the two classes
 * AND there is duplication in their use in FaceComponent.
 * 
 * For full credit, use INHERITANCE to remove the duplication
 * between FirefighterFace and PoliceOfficeFace 
 * and remove the duplicate functions in ColoredShapeComponent.
 * 
 * For half credit, you can use interfaces to remove the duplicate
 * functions in FaceComponent.
 * 
 * When your work is done, you the program should draw exactly
 * the same thing it does now.
 * 
 * @author yoder1
 *
 */
public class FaceComponent extends JComponent {

	private static final int BORDER_WIDTH = 60;

	@Override
	protected void paintComponent(Graphics arg0) {
		Graphics2D g = (Graphics2D) arg0;
		
		PoliceOfficerFace p = new PoliceOfficerFace(100, 125, 125, 20);
		FirefighterFace f = new FirefighterFace(300, 125, 100, 20);
		
		drawPoliceOfficers( g, p );
		drawFirefighters(g, f );

		
	}

	public void drawPoliceOfficers(Graphics2D g, PoliceOfficerFace p  ) {
		for (int i = 1; i < 5; i++) {
			p.draw(g);
			p.move( 0, 200);
			p.setHatSize(i*15);
		}
	}

	public void drawFirefighters(Graphics2D g, FirefighterFace p ) {
		for (int i = 1; i < 5; i++) {
			p.draw(g);
			p.move( 0, 200);
			p.setHatSize(i*15);
		}
	}


	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Polymorphism Question");
		FaceComponent c = new FaceComponent();
		c.setPreferredSize(new Dimension(400, 800));
		frame.add(c);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

}
