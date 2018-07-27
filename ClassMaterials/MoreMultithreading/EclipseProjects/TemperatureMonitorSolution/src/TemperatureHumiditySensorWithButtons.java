import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import java.util.Random;

import javax.swing.JOptionPane;

public class TemperatureHumiditySensorWithButtons 
	extends TemperatureHumiditySensor implements Runnable {
	
	private Random random = new Random();
	private double curTemperature;
	private double curHumidity = 0.0;
	
	/**
	 * 
	 * Creates a new sensor for testing threading. This sensor allows
	 * the user to change to specific values.
	 *
	 * @param queue - The error queue
	 * @param labName - The name of the lab
	 * @param minTemp - The minimum temperature for this lab
	 * @param maxTemp - The maximum temperature for this lab
	 * @param minHumid - The minimum humidity for this lab
	 * @param maxHumid - The maximum humidity for this lab
	 */
	public TemperatureHumiditySensorWithButtons(List<MonitorError> queue,
			String labName, double minTemp, double maxTemp, double minHumid, double maxHumid){
		super(queue, labName, minTemp, maxTemp, minHumid, maxHumid);

		this.setSize(new Dimension(MONITOR_WIDTH,MONITOR_HEIGHT));
		this.curTemperature =	this.random.nextDouble()*50+60;
		this.curHumidity = this.random.nextDouble()*100;
		
		
		this.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				updateValues();

			}

			@Override
			public void mouseEntered(MouseEvent arg0) {}
			@Override
			public void mouseExited(MouseEvent arg0) {}
			@Override
			public void mousePressed(MouseEvent arg0) {}
			@Override
			public void mouseReleased(MouseEvent arg0) {}

			
			
		});
		
	}
	
	
	@Override
	public double getCurrentTemperature() {
		return this.curTemperature;
	}

	@Override
	public double getCurrentHumidity() {
		return this.curHumidity;
	}

	public final void updateValues() {
		try {
			String temp = JOptionPane.showInputDialog(
					String.format("Enter new temperature for lab %s.", this.getLabName()));
			String humid = JOptionPane.showInputDialog(
					String.format("Enter new humidity for lab %s.", this.getLabName()));
			this.curTemperature = Double.parseDouble(temp);
			this.curHumidity = Double.parseDouble(humid);
		}
		catch (Exception ex) {
			//do nothing
		}
		this.updateErrors();
	}
	
	@Override
	public void run() {
		try {
			while (true) {
				this.repaint();
				Thread.sleep(500);
			}
		} catch (InterruptedException exception) {
			// nothing to do
		}
		
	}
	
	
}
