package simulationObjects;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Dimension2D;

/**
 * The Particle class consists of a black circle which moves and
 * bounces off the boundaries of the spaces it is inside as well
 * as other particles.
 * 
 * @author YOUR_NAME
 * 
 * TODO: Part 2 You can change and should change anything you wish to in this file
 *
 */
public class Particle {
	private int centerX, centerY, radius, velX, velY, moveSpeed;
	private Color color;

	//Unique to Particle
	public static final int PARTICLE_RADIUS = 10;
	public static final int PARTICLE_SPEED = 5;
	public static final Color PARTICLE_COLOR = Color.BLACK;
	
	public Particle(int x, int y) {
		this.centerX = x;
		this.centerY = y;
		this.velX = (int)(moveSpeed - Math.random() * moveSpeed * 2);
		this.velY = (int)(moveSpeed - Math.random() * moveSpeed * 2);
		
		///////START  -   THIS CODE IS UNIQUE TO PARTICLE
		this.radius = PARTICLE_RADIUS;
		this.moveSpeed = PARTICLE_SPEED;
		this.color = PARTICLE_COLOR;
		///////END  -   THIS CODE IS UNIQUE TO PARTICLE

		
		normalizeVelocity();
	}

	public void drawOn(Graphics2D g) {
		//avoid having to untranslate by mutating a copy of the graphics content
		g = (Graphics2D)g.create();
		g.setColor( this.color );
		g.translate(centerX-radius, centerY-radius);
		g.fillOval(0, 0, radius*2, radius*2);	
	}

	public void update(Dimension2D dim) {
		centerX += velX;
		centerY += velY;
		if (centerX > dim.getWidth() || centerX < 0) {
			centerX = (int)Math.min( Math.max(centerX, 0), dim.getWidth());
			velX = -velX;
		}
		if (centerY > dim.getHeight() || centerY < 0) {
			velY = -velY;
			centerY = (int)Math.min( Math.max(centerY, 0), dim.getHeight());
		}
	}
	
	public boolean overlapsWith(Particle other) {
		int xDiff =  centerX - other.centerX;
		int yDiff =  centerY - other.centerY;
		double distance = Math.sqrt(  xDiff*xDiff + yDiff * yDiff );
		return this.radius + other.radius >= distance;
	}
	
	//move in opposite direction of collision with other particle.
	public void bounce(Particle other) {
		velX = this.centerX - other.centerX;
		velY = this.centerY - other.centerY;
		normalizeVelocity();
	}
	
	// Make sure that velocity remains fixed and non-zero
	public void normalizeVelocity() {
		//move down, right if velocity is set to zero
		if (this.velX == 0 && this.velY == 0) {
			this.velX = 1;
			this.velY = 1;
		}
		//normalize vector
		double vectorLength = Math.sqrt(velX*velX + velY*velY);
		this.velX = (int)(this.velX / vectorLength * moveSpeed * 2);
		this.velY = (int)(this.velY / vectorLength * moveSpeed * 2);
	}
	

}
