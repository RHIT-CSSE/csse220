import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.Timer;


/**
 * In this project, we build a simple framework for a game.
 * This framework stores the state of the game. The framework 
 * then repeatedly does these 3 things in one "tick" of the clock:
 * 
 * 1. Input events from the human change the game state. 
 * 2. Things move/spawn/die according to the game state.
 * 3. The component draws the current game state.
 * 
 * In this exercise, we develop each of these ideas.
 * TODO: Replace the loop with button input to advance one tick.
 * TODO: Replace the button with a timer.
 * TODO: Make the button change the direction of motion.
 * TODO: Add falling raindrops.
 * TODO: Make the box "catch" drops that hit it.
 * 
 * @author Matt Boutell, Mark Hays, Jason Yoder, Buffalo Hewner,
 * and their colleagues.
 *
 */
public class Main {

	public static final int DELAY=50;
	
	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		JFrame frame = new JFrame("Arcade Game");
		frame.setSize(500, 500);
		
		GameComponent component = new GameComponent();
		frame.add(component, BorderLayout.CENTER);
	
		JButton button = new JButton("Click me");
		frame.add(button, BorderLayout.SOUTH);
		GameAdvanceListener advanceListener = new GameAdvanceListener(component);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		while (true) {
			advanceListener.advanceOneTick();
			// 1. How do we slow this down?
			
		}
		
	}
}
