import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameAdvanceListener implements ActionListener {

	private GameComponent gameComponent;

	public GameAdvanceListener(GameComponent gameComponent) {
		this.gameComponent = gameComponent;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		advanceOneTick();
	}

	public void advanceOneTick() {
		System.out.println("Current time " + System.currentTimeMillis());
		// The component uses user actions from listeners
		// to change the state of the game.

		// update screen
		this.gameComponent.updateState();
		this.gameComponent.drawScreen();
	}
}
