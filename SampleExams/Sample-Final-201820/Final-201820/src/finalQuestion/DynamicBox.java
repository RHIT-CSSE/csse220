package finalQuestion;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.Random;

/**
 * 
 * This class represents a box with a dynamic color and position
 * which can be drawn to the screen and updated over time
 * 
 * Some variables or methods for this class may need to be added or modified.
 * 
 * @author Jason Yoder, Matt Boutell, Mark Hays
 * and their colleagues.
 */
public class DynamicBox {
	
	//used to calculate if if a box gets to the edge of window
	private DynamicBoxComponent gc;
	
	// position, velocity and size
	private int x, y, velocityX, velocityY, width, height;
	
	//intensity of color to display
	private int intensity;
	
	//how fast to change color
	private int rateOfColorChange;
	
	//tracks whether the intensity is going up or down
	private boolean isIncreasing;
	
	//determines if the r,g,b components change or not
	private int redMultiplier, greenMultiplier, blueMultiplier;
	
	//use to create random box when passed a DynamicBoxComponent
	public DynamicBox(  DynamicBoxComponent dynamicBoxComponent ) {
		//Random object used to generate random numbers
		Random r = new Random();
		
		//set random position inside component
		this.x = r.nextInt( dynamicBoxComponent.getWidth()+1 );
		this.y = r.nextInt( dynamicBoxComponent.getHeight()+1 );
		
		//set random velocity for x and y direction
		this.velocityX = -5 + 2*r.nextInt( 11 );
		this.velocityY = -5 + 2*r.nextInt( 11 );
		//force non-zero veolcity
		if (velocityX == 0 && velocityY == 0) {
			this.velocityX = 1 + r.nextInt( 5 );
			this.velocityY = 1 + r.nextInt( 5 );
		}
		
		//set random size for box
		this.width = 10 + r.nextInt( 90 );
		this.height = 10 + r.nextInt( 90 );
		this.intensity = r.nextInt( 255 );
		
		//set random rate of change for color 
		this.rateOfColorChange = 5 + r.nextInt( 6 );
		
		//multipliers are set to be 0 or 1
		//this means that r,g,b will either change or not
		this.redMultiplier =  r.nextInt( 2 );
		this.greenMultiplier =  r.nextInt( 2 );
		this.blueMultiplier =  r.nextInt( 2 );
		//force gray color range if all r,g,b are set to zero
		if ( redMultiplier + greenMultiplier + blueMultiplier == 0 ) {
			redMultiplier = greenMultiplier = blueMultiplier =1;
		}
		
		//keep the dynamic box reference to access its dimensions later
		this.gc = dynamicBoxComponent;
	}
	
	//This method draws the box using the intensity and color multipliers to properly calculate a color
	public void drawOn(Graphics2D g) {
		g.setColor( new Color(redMultiplier*intensity, greenMultiplier*intensity, blueMultiplier*intensity) );
		g.fill( new Rectangle(x, y, width, height) );
	}
	
	//This method moves the box until it goes beyond an edge and then it changes direction
	public void updatePosition() {
		this.x += this.velocityX;
		this.y += this.velocityY;
		if ( this.x > this.gc.getWidth() - this.width || this.x < 0 ) {
			this.velocityX *= -1;
			this.x += this.velocityX;
		}
		if ( this.y > this.gc.getHeight() - this.height || this.y < 0 ) {
			this.velocityY *= -1;
			this.y += this.velocityY;
		}
	}
	
	// This method changes the intensity of a box's color
	// It oscillates between minimum and maximum values
	public void updateColor() {
		if (isIncreasing) {
			this.intensity+=rateOfColorChange;
		} else {
			this.intensity-=rateOfColorChange;
		}
		if ( this.intensity > 255) {
			this.intensity = 255;
			this.isIncreasing = false;
		} else if ( this.intensity < 0 ) {
			this.intensity = 0;
			this.isIncreasing = true;
		}
	}
	
	//This method updates the position of the box and the color of the box.
	public void updateState() {
		updatePosition();
		updateColor();
	}

}
