package rectangleExample;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

import javax.swing.JComponent;

public class DrawComponent extends JComponent {
	private ArrayList<Rectangle2D> shapes = new ArrayList<Rectangle2D>();
	
	public void addRect(int x, int y, int x2, int y2) {
		int width = Math.abs(x - x2);
		int height = Math.abs(y - y2);
		int upperLeftX = Math.min(x, x2);
		int upperLeftY = Math.min(y, y2);
		shapes.add(new Rectangle2D.Double(upperLeftX, upperLeftY, width, height));
	}
	
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D)g;
		g2.setColor(Color.red);
		for (Rectangle2D r : shapes) {
			g2.fill(r);
		}
	}
	
}
