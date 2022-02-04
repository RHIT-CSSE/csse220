package platforms;

import java.awt.Color;
import java.awt.Graphics2D;

import game.GameComponent;
import game.GameObject;

/**
 * A Platform that moves around the screen and absorbs Drops.
 * 
 * This platform never dies and when it reaches the edge of the screen
 * it stops there. If the user pressed a button the platform switches its current direction
 *
 */
public class UserControlledPlatform extends GameObject {
	public static final int SIZE = 25;
	private static final int STARTING_DX = 3;
	private static final int STARTING_DY = 0;	
	private static final int BOX_X = 10;
	private static final int BOX_Y = 200;
	
	// ------------------------------------------------------------------------------------------------------------------

	public UserControlledPlatform(GameComponent gameComponent, int x, int y, int xVelocity, int yVelocity) {
		super(gameComponent, x, y, xVelocity, yVelocity, SIZE, SIZE);
	} // UserControlledPlatform

	public UserControlledPlatform(int width, int height, GameComponent gameComponent) {
		super(gameComponent, BOX_X, BOX_Y, STARTING_DX, STARTING_DY, SIZE, SIZE);
	} // UserControlledPlatform

	@Override
	public void drawOn(Graphics2D g2d) {
		Color incomingColor = g2d.getColor();
		g2d.setColor(Color.BLACK);
		g2d.fill(this.getBoundingBox());
		g2d.setColor(incomingColor);
	} // drawOn

	//to make sure that the box stays on screen, we reverse direction and move back one tick
	//but then we reverse again so that the same thing will happen next state until
	//the user clicks a button to return back to the other side
	@Override
	public void update() {
		super.update();
		if (this.isOffScreen()) {
			this.reverseDirection();
			super.update();
			this.reverseDirection();
		} // end if		
	} // update

	@Override
	public void onRemove() {
		// Do nothing special
	} // onRemove

} // UserControlledPlatform
