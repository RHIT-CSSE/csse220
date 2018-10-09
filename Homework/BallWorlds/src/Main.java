

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JFrame;

import util.Random;

/**
 * The starting point for the BallWorlds application.
 * 
 * This exercise is based on one by David Mutchler, Salman Azhar and others at
 * Rose-Hulman Institute of Technology in January 2005. That exercise was itself
 * based on one from Lynn Andrea Stein's Rethinking CS101 project.
 * 
 * @author Curt Clifton. Created Jan 22, 2011.
 */
public class Main {
	private static final int NUMBER_OF_SIMULATIONS = 2;
	private static final int MIN_WIDTH = 200;
	private static final int MAX_WIDTH = 600;
	private static final int MIN_HEIGHT = 100;
	private static final int MAX_HEIGHT = 300;
	private static final Color[] BACKGROUND_COLORS = { Color.RED,
			Color.BLUE, Color.GREEN };

	/**
	 * Starts the application.
	 * 
	 * @param args
	 *            ignored
	 */
	public static void main(String[] args) {
		ArrayList<SimulationPanel> worlds = constructSimulations();
		JFrame frame = new BallWorldsFrame(worlds);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	/**
	 * This helper method constructs a list of simulation objects that will each
	 * simulate a world of bouncing balls.
	 * 
	 * @return a list of worlds
	 */
	private static ArrayList<SimulationPanel> constructSimulations() {
		ArrayList<SimulationPanel> result = new ArrayList<SimulationPanel>();
		for (int i = 0; i < NUMBER_OF_SIMULATIONS; i++) {
			int width = Random.randRange(MIN_WIDTH, MAX_WIDTH);
			int height = Random.randRange(MIN_HEIGHT, MAX_HEIGHT);
			Color c = BACKGROUND_COLORS[i % BACKGROUND_COLORS.length];
			SimulationPanel sp = new SimulationPanel(width, height, c);
			result.add(sp);
		}
		return result;
	}

}
