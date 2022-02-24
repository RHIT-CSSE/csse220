package finalQuestion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This listener is used to advance the state of dynamic box simulation
 * 
 * @author Jason Yoder, Matt Boutell, Mark Hays
 * and their colleagues.
 */
public class SimulationTickListener implements ActionListener {

	private DynamicBoxComponent dynamicBoxComponent;
	
	public SimulationTickListener(DynamicBoxComponent gc) {
		this.dynamicBoxComponent = gc;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		this.dynamicBoxComponent.updateState();
		//Hint: how do we get this new state to be drawn?
		this.dynamicBoxComponent.drawScreen();

	}

}
