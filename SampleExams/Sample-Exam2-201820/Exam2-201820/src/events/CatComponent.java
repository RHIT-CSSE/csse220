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

	public CatComponent() {
		roomba = new Roomba(new Point(50, 50));
	}

	@Override
	protected void paintComponent(Graphics g) {

		super.paintComponent(g);

		Graphics2D g2 = (Graphics2D) g;

		// makes things look slightly prettier
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		roomba.drawRoombaAndCat(g2);

	}
}
