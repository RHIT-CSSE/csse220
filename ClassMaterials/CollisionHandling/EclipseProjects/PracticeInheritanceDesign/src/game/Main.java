package game;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.Timer;


/**
 * This framework stores the state of the game. The framework 
 * then repeatedly does these 3 things in one "tick" of the clock:
 * 
 * 1. Input events from the human change the game state. 
 * 2. Things move/spawn/die according to the game state.
 * 3. The component draws the current game state.
 * 
 * 
 * This design functions, but it makes use of type predicated code:
 * this means that the code checks what type objects and then decides what to do
 * based upon that. This is a terrible and unacceptable design strategy that
 * will cause you to be penalized heavily!
 * 
 * However, the logic in the GameComponent.handleCollisions() has to be dealt with
 * somewhere! To solve this problem we will find a way to remove instanceof 
 * everywhere by using inheritance via creating two Abstract classes
 * 
 * 
 * In this exercise, we develop each of these ideas.
 * TODO #1   Create AbstractDrop 
 *           Update DamagingDrop and HealingDrop to inherit from AbstractDrop
 *           Rerun app to see that all still works correctly
 * TODO #2.1 Re-work GameComponent.java to use 2 lists and one variable instead of one GameObject list
 *           List of AbstractDrop
 *           List of BouncingPlatform
 *           One variable of UserControlledPlatform
 *           Rework all methods except handleCollisions to eliminate use of instanceOf
 *           Rerun app
 * TODO #2.2 Re-work handleCollisions method to eliminate use of instanceOf
 *           This includes creating the collideWith methods in AnstractDrop
 *           collideWith(BouncingPlatform)
 *           collideWith(UserControlledPlatform)
 *           Rerun app
 * TODO #4  Create InvincibilityDrop which makes a BouncingPlatform ignore drops for a duration of time
 *
 * @author Jason Yoder, Buffalo Hewner, Matt Boutell, Mark Hays
 * and their colleagues.
 *
 */
public class Main {
	public static final int DELAY = 10;
	
	// ------------------------------------------------------------------------------------------------------------------

	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		JFrame frame = new JFrame("Arcade Game");
		frame.setSize(500, 500);
		frame.setLocation(550, 250);
		
		GameComponent component = new GameComponent();
		frame.add(component, BorderLayout.CENTER);
	
		JButton button = new JButton("Click me");
		frame.add(button, BorderLayout.SOUTH);
		GameAdvanceListener advanceListener = new GameAdvanceListener(component);
		
		Timer timer = new Timer(DELAY, advanceListener);
		timer.start();

		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				component.toggleBoxDirection();
			}
		});
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	} // Main
}
