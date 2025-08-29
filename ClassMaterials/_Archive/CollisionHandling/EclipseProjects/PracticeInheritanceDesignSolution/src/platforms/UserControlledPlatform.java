package platforms;

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
	
	private static final int BOX_SIZE = 20;
	private static final int BOX_X = 10;
	private static final int BOX_Y = 200;
	
	
	public UserControlledPlatform(GameComponent gameComponent, int x, int y, int xVelocity, int yVelocity ) {
		super(gameComponent, x, y, xVelocity, yVelocity, SIZE, SIZE);
	}

	public UserControlledPlatform(int width, int height, GameComponent gameComponent) {
		super(gameComponent, BOX_X, BOX_Y, STARTING_DX, STARTING_DY, SIZE, SIZE);
	}

	@Override
	public void drawOn(Graphics2D g) {
		g.fill( this.getBoundingBox() );
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
	public void onRemove() {
		//do nothing
	}


}
