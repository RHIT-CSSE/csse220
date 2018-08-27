package finalQuestion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

/* 
 * This class must be created by the students and handles the actions of all buttons
 * 
 */

public class ButtonListener implements ActionListener {

	//enum would be better, but students are likely to use something like this or strings
	public static final int PAUSE_MOVEMENT=1, PAUSE_ALL=2, ADD_BALL=3;
	private int type;
	
	private DynamicBoxComponent gc;
	private Timer timer;
	
	public ButtonListener(DynamicBoxComponent gc, int type, Timer t) {
		this.gc = gc;
		this.type = type;
		this.timer = t;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (this.type == PAUSE_MOVEMENT) {
			this.gc.toggleMovementPaused();
		} else if (this.type == PAUSE_ALL){
			if (this.timer.isRunning()) {
				this.timer.stop();
			} else {
				this.timer.restart();
			}
		} else if (this.type == ADD_BALL){
			this.gc.addBall();
		}else {
			System.err.println("Invalid type for ButtonListener");
		}
		
	}

}
