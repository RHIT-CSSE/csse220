package events;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.geom.Line2D;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComponent;

public class CatComponent extends JComponent {

	private Roomba roomba;
	private List<Line2D> lines;
	private Point last;

	public CatComponent() {
		last = new Point(50, 50);
		roomba = new Roomba(last);
		lines = new ArrayList<Line2D>();
	}

	@Override
	protected void paintComponent(Graphics g) {

		super.paintComponent(g);

		Graphics2D g2 = (Graphics2D) g;

		// makes things look slightly prettier
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		for (Line2D line : lines) {
			g2.draw(line);
		}
		
		roomba.drawRoombaAndCat(g2);

	}

	public void moveRoombaBy(int dx, int dy) {
		roomba.moveBy(dx, dy);
		repaint();
	}

	public void extendPath() {
		Point current = roomba.position;
		lines.add(new Line2D.Double(last, current));
		last = new Point(current.x, current.y);
	}
}
