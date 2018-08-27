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
 * This class uses PoliceOfficerFace and FirefighterFace to draw 
 * two columns of faces
 * 
 * I used a concrete class in my solution, but you could use an abstract class
 * as well for full credit. There is a question of whether a Face class should
 * include a hatSize or not, but anything students do to remove the majority
 * of the code should be given full credit. If they want to abstract away hats
 * they could, but we will not expect it.
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
		
		//Original
		//drawPoliceOfficers( g, p );
		//drawFirefighters(g, f );
		
		//improved solution
		drawFaces( g, p);
		drawFaces( g, f);
		
		
	}
	
	public void drawFaces(Graphics2D g, Face p  ) {
		for (int i = 1; i < 5; i++) {
			p.draw(g);
			p.move( 0, 200);
			p.setHatSize(i*15);
		}
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
