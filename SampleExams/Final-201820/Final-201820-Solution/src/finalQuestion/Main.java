package finalQuestion;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;


/**
 * In this project, we start with a box on the screen which does not
 * show up properly unless the screen is resized.
 * 
 * You will need to add or modify classes to:
 * 
 * Stage 1
 * #1 Get the box to appear without resizing the window.
 * #2 Replace the button which advances one tick to use a Timer instead.
 * 
 * Stage 2
 * #3 Make a button to add more boxes to the simulation
 * 
 * Stage 3
 * #4 Make a button to toggle whether the boxes on the screen are moving or not
 * 
 * Stage 4
 * #5 Make a button to freeze all boxes (color and movement) while preserving their state to be unpaused on a subsequent press
 *
 * @author Jason Yoder, Matt Boutell, Mark Hays
 * and their colleagues.
 *
 */
public class Main {

	public static final int DELAY=50;
	
	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		JFrame frame = new JFrame("Colorful Bouncing Boxes");
		frame.setSize(800, 600);
		DynamicBoxComponent component = new DynamicBoxComponent();
		frame.add(component, BorderLayout.CENTER);
		
		//button panel to add buttons to
		JPanel buttonPanel = new JPanel();
		frame.add(buttonPanel, BorderLayout.SOUTH);
		SimulationTickListener advanceListener = new SimulationTickListener(component);
		
		
		//TODO Stage 1 :
		//Use a timer to update the game instead of this button
		//Move forward one tick
		
		Timer timer = new Timer(DELAY, advanceListener);
		timer.start();
		
		 
		
		JButton addBoxButton = new JButton("Add Box");
		addBoxButton.addActionListener( new ButtonListener(component, ButtonListener.ADD_BALL, timer)   );
		buttonPanel.add(addBoxButton);
		
		JButton pauseBoxes = new JButton("Pause Boxes");
		pauseBoxes.addActionListener( new ButtonListener(component, ButtonListener.PAUSE_MOVEMENT, timer)   );
		buttonPanel.add(pauseBoxes);
		
		JButton pauseAll = new JButton("Pause ALL");
		pauseAll.addActionListener( new ButtonListener(component, ButtonListener.PAUSE_ALL, timer)   );
		buttonPanel.add(pauseAll);
		

		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
