package platforms;

import java.awt.Graphics2D;

import game.GameComponent;
/**
 * A Platform that moves around the screen and absorbs Drops.
 * 
 * This platform never dies and when it reaches the edge of the screen
 * it stops there. If the user pressed a button the platform switches its current direction
 *
 */
public class UserControlledPlatform extends AbstractPlatform {

	public static final int SIZE = 25;
	private static final int STARTING_DX = 3;
	private static final int STARTING_DY = 0;
	
	private static final int BOX_SIZE = 20;
	private static final int BOX_X = 10;
	private static final int BOX_Y = 200;
	
	//TODO: could add a color that changes each time the box gets hit by drops
	
	public UserControlledPlatform(int x, int y, int xVelocity, int yVelocity, GameComponent gameComponent) {
		super(x, y, xVelocity, yVelocity, gameComponent,SIZE , SIZE);
	}

	public UserControlledPlatform(int width, int height, GameComponent gameComponent) {
		super(BOX_X, BOX_Y, STARTING_DX, STARTING_DY, gameComponent, SIZE, SIZE);
	}


	//to make sure that the box stays on screen, we reverse direction and move back one tick
	//but then we reverse again so that the same thing will happen next state until
	//the user clicks a button to return back to the other side
	@Override
	public void update() {
		super.update();
		if ( isOffScreen()  ) {
			this.reverseDirection();
			super.update();
			this.reverseDirection();
		}
		
	}

	
	@Override
	public void collideWithPlatform(AbstractPlatform otherPlatform) {
		//do nothing
		//this.reverseDirection();
	}
	
	
	@Override
	public void drawOn(Graphics2D g) {
		g.fill( this.getBoundingBox() );
	}

	@Override
	public void onRemove() {   
		//do nothing
	}
	
	

	//Methods shared with BouncingPlatform but not with GameObject
	@Override
	public void removeDrop() {
		//do nothing
	}
	@Override
	public void addDrop() {
		//do nothing
	}
	@Override
	public void makeInvinciple() {
		//do nothing
	}


}
