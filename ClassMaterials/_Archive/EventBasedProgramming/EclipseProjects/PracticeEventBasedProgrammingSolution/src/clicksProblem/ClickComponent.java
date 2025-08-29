package clicksProblem;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

import javax.swing.JComponent;

public class ClickComponent extends JComponent {
	private ArrayList<Shape> shapes = new ArrayList<Shape>();
	private ArrayList<Color> colors = new ArrayList<Color>();
	
	public void addCircle(int x, int y, int diameter, Color c) {
		double radius = diameter / 2.0;
		shapes.add(new Ellipse2D.Double(x-radius, y-radius, diameter, diameter));
		colors.add(c);
	}
	
	public void addSquare(int x, int y, int heightAndWidth, Color c) {
		int halfHeightWidth = heightAndWidth/2;
		shapes.add(new Rectangle2D.Double(x-halfHeightWidth, y- halfHeightWidth, heightAndWidth, heightAndWidth));
		colors.add(c);
	}
	
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D)g;
		for (int i=0;i<shapes.size();i++) {
			g2.setColor(colors.get(i));
			g2.fill(shapes.get(i));
		}
	}

	public void clear() {
		shapes.clear();
		colors.clear();
		
	}
	
}
