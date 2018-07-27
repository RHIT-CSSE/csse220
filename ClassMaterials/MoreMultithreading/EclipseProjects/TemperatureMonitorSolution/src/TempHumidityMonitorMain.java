import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * 
 * Main class for running the Temperature and Humidity Monitor program.
 * 
 * This program is intended to simulate a user who is watching temperature
 * and humidity sensors for a number of labs. 
 * 
 * This application is intended to illustrate use case 1 from the More 
 * Multithreading slides for CSSE220. This use case involves gathering 
 * data from multiple threads into a central location. In this case,
 * all temperature and humidity sensor errors should be gathered and 
 * displayed in the Console.
 *
 * @author Amanda Stouder. Created Oct 30, 2015.
 */
public class TempHumidityMonitorMain {

	/**
	 * The list of labs to create. Shorten for fewer labs.
	 */
	public static final String[] LabNames = new String[] { "Stability Lab", "Chemistry Lab 1", "Clean Room",
			"Production Lab 1", "Chemistry Lab 2", "Research Lab 1", "Biohazard Lab", "Chemistry Lab 3",
			"Production Lab 2", "Research Lab 2" };
	
	/**
	 * The width of the frame.
	 */
	public static final int FRAME_WIDTH = 700;
	/** 
	 * The height of the frame.
	 */
	public static final int FRAME_HEIGHT = 600;
	/**
	 * Whether or not to use the test sensors that you can control values.
	 */
	public static final boolean USE_TEST_SENSOR = false;

	/**
	 * 
	 * Runs the application.
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		frame.add(panel);

		MonitorPanel monitorPanel = new MonitorPanel(FRAME_WIDTH, FRAME_HEIGHT);
		panel.add(monitorPanel);

		List<MonitorError> queue = Collections.synchronizedList(new ArrayList<MonitorError>());

		ErrorReporter monitorRunner = new ErrorReporter(queue);
		Thread monitorThread = new Thread(monitorRunner);
		monitorThread.start();

		ArrayList<TemperatureHumiditySensor> monitors = createMonitors(queue);
		monitorPanel.addMonitors(monitors);
		startMonitors(monitors);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		if (USE_TEST_SENSOR) {
			JOptionPane.showMessageDialog(frame,
					"You are using test sensors, to change the values in them, click on the sensor.");
		}

	}

	/** 
	 * 
	 * Creates the list of monitors and then returns a the list of
	 * monitors. 
	 *
	 * @param queue - The list that tracks errors that have occurred.
	 * @return
	 */
	public static ArrayList<TemperatureHumiditySensor> createMonitors(List<MonitorError> queue) {
		Random rand = new Random();
		ArrayList<TemperatureHumiditySensor> monitors = new ArrayList<TemperatureHumiditySensor>();
		for (int i = 0; i < LabNames.length; i++) {
			String labName = LabNames[i];
			TemperatureHumiditySensor monitor = null;
			if (USE_TEST_SENSOR) {
				monitor = new TemperatureHumiditySensorWithButtons(queue, labName, rand.nextDouble() * 50,
						rand.nextDouble() * 50 + 60, rand.nextDouble() * 30, rand.nextDouble() * 50 + 50);
			} else {
				monitor = new RandomTemperatureHumiditySensor(queue, labName, rand.nextDouble() * 50,
						rand.nextDouble() * 50 + 60, rand.nextDouble() * 30, rand.nextDouble() * 50 + 50);
			}

			monitors.add(monitor);
		}
		return monitors;
	}

	/**
	 * Creates threads and starts the monitors.
	 *
	 * @param monitors - The list of monitors
	 */
	public static void startMonitors(ArrayList<TemperatureHumiditySensor> monitors) {
		for (TemperatureHumiditySensor monitor : monitors) {
			Thread thread = new Thread(monitor);
			thread.start();
		}
	}

}
