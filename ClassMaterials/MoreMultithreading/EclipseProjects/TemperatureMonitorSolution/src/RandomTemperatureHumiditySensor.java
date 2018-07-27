

import java.awt.Dimension;
import java.util.List;
import java.util.Random;

/**
 * 
 * A temperature and humidity sensor that randomly updates itself. 
 *
 * @author stouder.
 *         Created Oct 30, 2015.
 */
public class RandomTemperatureHumiditySensor extends TemperatureHumiditySensor implements Runnable {
	private double curTemperature = 0.0;
	private double curHumidity = 0.0;
	private Random random = new Random();
	private static int RANGE = 5;
	private static double RANGE_ADJUSTMENT = 2.5;
	private static int SECONDS = 5000;
	
	/**
	 * 
	 * Creates a new {@link RandomTemperatureHumiditySensor}.
	 *
	 * @param queue - The error queue
	 * @param labName - The name of the lab
	 * @param minTemp - The minimum temperature for this lab
	 * @param maxTemp - The maximum temperature for this lab
	 * @param minHumid - The minimum humidity for this lab
	 * @param maxHumid - The maximum humidity for this lab
	 */
	public RandomTemperatureHumiditySensor(List<MonitorError> queue,
			String labName, double minTemp, double maxTemp, double minHumid, double maxHumid){
		super(queue, labName, minTemp, maxTemp, minHumid, maxHumid);
		this.setSize(new Dimension(MONITOR_WIDTH,MONITOR_HEIGHT));
		this.curTemperature = this.random.nextDouble()*50+60;
		this.curHumidity = this.random.nextDouble()*100;
	}

	@Override
	public double getCurrentTemperature() {
		return this.curTemperature;
	}

	@Override
	public double getCurrentHumidity() {
		return this.curHumidity;
	}

	/**
	 * 
	 * Gets new random values for the temperature and humidity
	 * settings of the sensor.
	 *
	 */
	public void updateValues() {
		this.curTemperature += this.random.nextDouble()*RANGE-RANGE_ADJUSTMENT; 
		this.curHumidity += this.random.nextDouble()*RANGE-RANGE_ADJUSTMENT;
		if (this.curHumidity > 100) {
			this.curHumidity = 100;
		}
		else if (this.curHumidity <0) {
			this.curHumidity = 0;
		}
		this.repaint();
		this.updateErrors();
	}
	
	
	@Override
	public void run() {
		try {
			while (true) {
				updateValues();
				this.repaint();
				Thread.sleep(this.random.nextInt(SECONDS));
			}
		} catch (InterruptedException exception) {
			// nothing to do
		}
		
	}

}
