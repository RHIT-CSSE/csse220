import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class RectComponent extends JComponent {

	@Override
	protected void paintComponent(Graphics g) {
		
		super.paintComponent(g);

		Graphics2D g2 = (Graphics2D) g;
		
		RedRect example1 = new RedRect(210,210,250,250); //x = 210, y = 210 upper left
		                                                 //x = 250, y = 250 lower right
		example1.draw(g2);
		RedRect example2 = new RedRect(215,260,260,305);
		example2.draw(g2);
		RedRect example3 = new RedRect(280,290,335,310);
		example3.draw(g2);
		
		RedRect random1 = new RedRect(); //randomly picks a position and size
		random1.draw(g2);
		RedRect random2 = new RedRect();
		random2.draw(g2);
		
		RectContainer container1 = new RectContainer();
		container1.addRect(example1);
		container1.addRect(example2);
		container1.addRect(example3);
		container1.draw(g2);
		
		RectContainer container2 = new RectContainer();
		container2.addRect(random1);
		container2.addRect(random2);
		container2.draw(g2);
		
	}
		
}
