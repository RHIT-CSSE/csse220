package events;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class CurieCat {
	
	BufferedImage image;
	
	public CurieCat(){
		try {
			// Curie Cat is the cat from The Incredible Machine 3
			image = ImageIO.read(new File("curie.png"));
		} catch (IOException e) {
			throw new RuntimeException("Error drawing Curie Cat: "+e);
		}
	}
	
	public void drawCentered(Graphics2D g2){
		g2.translate(-image.getWidth()/2, -image.getHeight()/2);
		g2.drawImage(image, 0, 0, null);
		g2.translate(0, image.getHeight());
	}
	
	public void meow(){
		System.out.println("meow");
	}
}
