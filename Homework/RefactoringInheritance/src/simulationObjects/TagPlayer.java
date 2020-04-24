package simulationObjects;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Dimension2D;

/**
 * The TagPlayer class represents a person playing the classic game of
 * "tag." https://en.wikipedia.org/wiki/Tag_(game)
 * 
 * A Person can either be "it" or not. When a person is "it" then they
 * appear with the color RED. A person moves around within an area and
 * bounces off of the boundaries and also off of other TagPlayers.
 * 
 * When a TagPlayer bounces into another then if one person is "it"
 * and the other is not, then they switch roles. The person who was 
 * not "it" becomes "it" and vice versa. 
 * 
 * One more rule is that a player who most recently "it" cannot become
 * it again for 10 timesteps. This is to prevent "tagbacks" where a player
 * immediately tags back the person who just tagged them.
 * 
 * @author YOUR_NAME
 * 
 * TODO: Part 2 You can change and should change anything you wish to in this file
 *
 */
public class TagPlayer {
	
	private int centerX, centerY, radius, velX, velY, moveSpeed;
	private Color color;
	

	//unique to TagPlayer
	public static final int TAG_PLAYER_RADIUS = 20;
	public static final int TAG_PLAYER_SPEED = 4;
	public static final Color REGULAR_COLOR = new Color(100, 100, 100);
	public static final Color IT_COLOR = Color.RED;
	public static final int COUNTDOWN_RESET = 10;
	private boolean isCurrentlyIt;
	private int tagBackCountDown = 0;

	public TagPlayer(int x, int y, boolean isIt) {
		this.centerX = x;
		this.centerY = y;
		this.velX = (int)(moveSpeed - Math.random() * moveSpeed * 2);
		this.velY = (int)(moveSpeed - Math.random() * moveSpeed * 2);
		

		///////START  -   THIS CODE IS UNIQUE TO TagPlayer
		this.radius = TAG_PLAYER_RADIUS;
		this.moveSpeed = TAG_PLAYER_SPEED;
		this.isCurrentlyIt = isIt;
		if (this.isCurrentlyIt) {
			this.color = IT_COLOR;
		} else {
			this.color = REGULAR_COLOR;
		}
		///////END  -   THIS CODE IS UNIQUE TO TagPlayer
		
		
		normalizeVelocity();
		
	}

	public void drawOn(Graphics2D g) {

		//avoid having to untranslate by mutating a copy of the graphics content
		g = (Graphics2D)g.create();
		g.setColor(this.color);
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
		
		
		///////START  -   THIS CODE IS UNIQUE TO TagPlayer
		//This code is UNIQUE to TagPlayer
		if (isCurrentlyIt) {
			this.color =  IT_COLOR;
		} else {
			this.color =  REGULAR_COLOR;
		}
		//countdown until legal to be tagged
		this.tagBackCountDown--;
		///////END  -   THIS CODE IS UNIQUE TO TagPlayer


	}
	
	/**
	 * Determine if two TagPlayers collided with each other.
	 */
	public boolean overlapsWith(TagPlayer other) {
		int xDiff =  centerX - other.centerX;
		int yDiff =  centerY - other.centerY;
		double distance = Math.sqrt(  xDiff*xDiff + yDiff * yDiff );
		return this.radius + other.radius >= distance;
	}
	
	/**
	 *  Move in opposite direction of collision with other TagPlayer.
	 *  Also do checks to see if someone got tagged
	 */
	public void bounce(TagPlayer other) {
		this.velX = this.centerX - other.centerX;
		this.velY = this.centerY - other.centerY;
		normalizeVelocity();
		
		
		///////START  -   THIS CODE IS UNIQUE TO TagPlayer
		//See if this got tagged by someone else
		checkIfTagged(other);
		///////END  -   THIS CODE IS UNIQUE TO TagPlayer
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

	/**
	 *  THIS CODE IS UNIQUE TO TagPlayer
	 *  
	 *  It checks to see if the other player is "it"
	 *  to determine if the current player (this) should become "it"
	 *  and then make the change accordingly, including making the
	 *  other player NOT "it" and also briefly immune (COUNTDOWN_RESET)
	 *  from being tagged back.
	 *  
	 * @param other
	 */
	public void checkIfTagged(TagPlayer other) {
			
		if (!this.isCurrentlyIt &&                // I must NOT be it, AND
					other.isCurrentlyIt  &&       // the other player MUST be it, AND
					this.tagBackCountDown <= 0) { // I must not have recently been "it"
				
			//I become "it"
			this.isCurrentlyIt = true;
			//The other player is NOT "it"
			other.isCurrentlyIt = false;   
			//The other player cannot be tagged back (become "it" again) for 10 timesteps
			other.tagBackCountDown = COUNTDOWN_RESET; 
		}
	}

}
