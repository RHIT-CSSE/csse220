

import java.awt.Color;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

/**
 * This class is a JPanel that simulates a single world of bouncing balls and
 * includes the controls for it.
 * 
 * @author Curt Clifton. Created Jan 22, 2011.
 */
public class SimulationPanel extends JPanel {

	private static final int GAP_WIDTH = 10;

	/**
	 * Constructs a new simulation where the world for the balls has the given
	 * dimensions and the given background color.
	 * 
	 * Note that the actual dimensions of the resulting panel will be larger,
	 * since the panel also includes the controls for the simulation.
	 * 
	 * @param width
	 * @param height
	 * @param color
	 */
	public SimulationPanel(int width, int height, Color color) {
		// Change layout so the buttons and the world are side-by-side.
		setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));
		BallWorld world = new BallWorld(width, height, color);
		BallWorldComponent worldComponent = new BallWorldComponent(world);
		ControlsPanel controlsPanel = new ControlsPanel(world);
		// add "rigid stuff" to force minimum spacing
		add(Box.createHorizontalStrut(GAP_WIDTH));
		add(controlsPanel);
		// add "rigid stuff" to force minimum spacing
		add(Box.createHorizontalStrut(GAP_WIDTH));
		add(worldComponent);
		// adds "stretchy stuff" to force the world to the left
		add(Box.createGlue());
		// add "rigid stuff" to force minimum spacing
		add(Box.createHorizontalStrut(GAP_WIDTH));
	}
}
