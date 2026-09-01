package platforms;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import game.GameComponent;
import game.GameObject;

/**
 * A Platform move around the screen and collects RainDrops.
 * 
 * A Platform can fill with Raindrops; when it does, it EXPLODES 
 * into a shower of RainDrops. 
 *
 */
public class BouncingPlatform extends GameObject {
	public static final int WIDTH = 80;
	public static final int HEIGHT = 20;

	public static final int RED_START = 222, GREEN_START=184, BLUE_START=135, WATER_INCREMENT=5;
	private static final int DROPS_ON_EXPLODE = 50;
	private int rainDropsCollected = 0;
	
	// ------------------------------------------------------------------------------------------------------------------

	public BouncingPlatform(GameComponent gameComponent, int x, int y, int xVelocity, int yVelocity) {
		super(gameComponent, x, y, xVelocity, yVelocity, WIDTH, HEIGHT);
	} // BouncingPlatform


	public void drawOn(Graphics2D g2d) {
		g2d.setColor(new Color(RED_START-rainDropsCollected, GREEN_START-rainDropsCollected, BLUE_START+rainDropsCollected));
		g2d.fill(new Rectangle2D.Double(getBoundingBox().x, getBoundingBox().y, this.getWidth(), this.getHeight()));
	} // drawOn

	public boolean willExplode() {
		return this.rainDropsCollected >= 255 - BLUE_START;
	} // willExplode

	@Override
	public boolean shouldRemove() {
		return this.willExplode();
	} // shouldRemove

	@Override
	public void onRemove() {
		for (int i = 0; i < DROPS_ON_EXPLODE; i++) {
			this.gameComponent.createRainDrop(this.getBoundingBox());
		} // end for
	} // onRemove

	public void bounce() {
		this.reverseDirection();
		this.update();
	} // bounce

	@Override
	public void update() {
		super.update();
		if (this.isOffScreen()) {
			this.reverseDirection();
		} // end if
	} // update
	
	
	public void setRainDropsCollected(int drops) {
		this.rainDropsCollected = drops;
	} // setRainDropsCollected
	
	public int getRainDropsCollected() {
		return this.rainDropsCollected;
	} // getRainDropsCollected
	
} // BouncingPlatform
