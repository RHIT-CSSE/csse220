package events;

import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Roomba {
	
	public Point position;
	
	private CurieCat cat;
	private BufferedImage roombaImage;
	
	public Roomba(Point initialPosition){
		this.position = initialPosition;
		this.cat = new CurieCat();
		try {
			this.roombaImage = ImageIO.read(new File("roomba.png"));
		} catch (IOException e) {
			throw new RuntimeException("Error drawing Roomba: "+e);
		}
	}	
	
	public void drawRoombaAndCat(Graphics2D g2){
		g2 = (Graphics2D) g2.create();
		g2.translate(position.x, position.y);
		this.cat.drawCentered(g2);
		g2.drawImage(roombaImage, 0, 0, null);
	}
	
	public void moveBy(int dx, int dy){
		this.position = new Point(position.x + dx, position.y + dy);
	}
}
