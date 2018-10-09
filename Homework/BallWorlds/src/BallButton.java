

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 * A button that adds instances of a particular kind of ball to a particular
 * world.
 * 
 * This implementation uses "reflection" to construct the ball instances. This
 * allows us to omit the definitions of the ball classes for the assigned
 * exercise, giving students the changes to define subclasses from scratch.
 * 
 * @author Curt Clifton. Created Jan 22, 2011.
 */
public class BallButton extends JButton {

	private enum Error {
		CLASS_NOT_FOUND, CLASS_IS_NOT_A_BALL, CLASS_IS_ABSTRACT, NO_CONSTRUCTOR, COULD_NOT_CONSTRUCT_BALL
	}

	private static final int SCALE = 2;

	private String ballType;
	private BallEnvironment world;

	/**
	 * Associates a type of Ball and a BallEnvironment with this button, labels
	 * this button with the type of Ball, and arranges for an ActionListener to
	 * respond to button-presses.
	 * 
	 * @param ballType
	 *            the type of Ball to be created by pressing this button
	 * @param world
	 *            the world for all Balls created by pressing this button
	 */
	public BallButton(String ballType, BallEnvironment world) {
		super("Add " + ballType);

		this.ballType = ballType;
		this.world = world;

		// By setting the maximum size to be SCALE-times wider than the
		// preferred size, we let Java stretch this button so its the same
		// width as the widest button on the control panel. Making all the
		// buttons the same width reduces the amount of visual clutter in the
		// GUI, making it more pleasant to use.
		Dimension d = getPreferredSize();
		setMaximumSize(new Dimension(d.width * SCALE, d.height));

		ActionListener al = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				handleClick();
			}
		};

		addActionListener(al);
	}

	/**
	 * Creates a Ball of the type whose name appears on this BallButton.
	 * 
	 * @param event
	 *            the Event that caused this method to be invoked (usually,
	 *            pressing this BallButton)
	 */
	public void handleClick() {
		
		// NOTE: This code is very advanced. It uses a technique called
		// "reflection" to attempt to construct the appropriate Ball subclass
		// based on this button's ball kind. Using reflection lets us avoid
		// hard-wiring different buttons for each kind of Ball. It also lets us
		// give better error messages if you have a mistake in your
		// implementation of a particular kind of Ball.
		try {
			// Get the Class for the Ball
			Class<? extends Ball> ballClass;
			try {
				ballClass = Class.forName(this.ballType).asSubclass(Ball.class);
			} catch (ClassCastException e) {
				// Oops. It's not a subclass of Ball.
				this.showErrorMessage(Error.CLASS_IS_NOT_A_BALL);
				return;
			} catch (NoClassDefFoundError e) {
				this.showErrorMessage(Error.CLASS_NOT_FOUND);
				return;
			}

			// Make sure it is not abstract
			if (Modifier.isAbstract(ballClass.getModifiers())) {
				this.showErrorMessage(Error.CLASS_IS_ABSTRACT);
				return;
			}

			// Use reflection to get the Ball's constructor.
			Constructor<? extends Ball> constructor;
			Class<?>[] parameters = { BallEnvironment.class };
			constructor = ballClass.getConstructor(parameters);

			// Construct a new instance of the ball and add it to the
			// environment
			Ball b = constructor.newInstance(this.world);
			this.world.addBall(b);
		} catch (ClassNotFoundException exception) {
			this.showErrorMessage(Error.CLASS_NOT_FOUND);
		} catch (NoSuchMethodException exception) {
			this.showErrorMessage(Error.NO_CONSTRUCTOR);
		} catch (Exception exception) {
			exception.printStackTrace();
			this.showErrorMessage(Error.COULD_NOT_CONSTRUCT_BALL);
		}
	}

	/*
	 * Displays an error message appropriate for the given error type.
	 */
	private void showErrorMessage(Error errorType) {
		String message, error;

		switch (errorType) {

		case CLASS_NOT_FOUND:
			// there is no class with this button's name
			message = "There is no " + this.ballType
					+ " class in this project.\n"
					+ "Did you forget to implement it?\n"
					+ "Or did you misspell it? (Case matters!)";

			error = "Error: class does not exist";
			break;

		case CLASS_IS_NOT_A_BALL:
			// the class with this button's name is not a Ball
			message = "The " + this.ballType + " class does not extend Ball.\n"
					+ "Did you forget to declare it to do so?\n";

			error = "Error: class is not a Ball";
			break;

		case CLASS_IS_ABSTRACT:
			// the class with this button's name is abstract
			message = "Your "
					+ this.ballType
					+ " class is abstract.\n"
					+ "It must NOT be abstract -- you really must implement all the methods\n"
					+ "exactly as specified in Drawable, Relocatable and Animate. Please do so.\n";

			error = "Error: class is abstract";
			break;

		case NO_CONSTRUCTOR:
			// the class with this button's name does not have an appropriate
			// constructor
			message = "I cannot create a "
					+ this.ballType
					+ " unless the "
					+ this.ballType
					+ " class\nhas a constructor that has a single parameter of type BallEnvironment.\n"
					+ "Your " + this.ballType
					+ " class lacks such a constructor.  Please add one.";
			error = "Error: class lacks an appropriate constructor";
			break;

		case COULD_NOT_CONSTRUCT_BALL:
			// I could not create the Ball, for unknown reasons.
			message = "I cannot construct a "
					+ this.ballType
					+ ".\n"
					+ "Perhaps something is wrong with the code in your constructor?\n"
					+ "Examine the error message in the output window and get help as needed.";

			error = "Error: could not construct the Ball";
			break;

		default:
			// Should never get here.
			message = "Unknown error message type."
					+ "Please show this message and your " + this.ballType
					+ " class to your instructor.\n";

			error = "Error: unknown error message type";
		}

		JOptionPane.showMessageDialog(null, message, error,
				JOptionPane.ERROR_MESSAGE);
	}

}
