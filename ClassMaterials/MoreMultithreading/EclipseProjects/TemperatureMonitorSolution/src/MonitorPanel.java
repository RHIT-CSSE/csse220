import java.util.ArrayList;

import javax.swing.JPanel;

/**
 * 
 * Panel that holds the monitors and controls where each monitor 
 * is displayed.
 *
 * @author stouder.
 *         Created Oct 30, 2015.
 */
public class MonitorPanel extends JPanel {

	/**
	 * Spacing between monitors
	 */
	public static final int MONITOR_SPACING = 25;
	
	/**
	 * 
	 * Creates a new monitor panel with the provided
	 * width and height.
	 *
	 * @param width
	 * @param height
	 */
	public MonitorPanel(int width, int height) {
		this.setLayout(null);
		this.setSize(width, height);
	}

	/**
	 * 
	 * Adds the monitors to the panel
	 *
	 * @param monitors
	 */
	public void addMonitors(ArrayList<TemperatureHumiditySensor> monitors) {

		int x = MONITOR_SPACING;
		int y = MONITOR_SPACING;
		for (TemperatureHumiditySensor monitor : monitors){
			monitor.setLocation(x, y);
			this.add(monitor);
			x += monitor.MONITOR_WIDTH + MONITOR_SPACING;
			if (x + monitor.MONITOR_WIDTH > this.getWidth()) {
				y += monitor.MONITOR_HEIGHT + MONITOR_SPACING;
				x = MONITOR_SPACING;
			}
		}
	
	}

}
