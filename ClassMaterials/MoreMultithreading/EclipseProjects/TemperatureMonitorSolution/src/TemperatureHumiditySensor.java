import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.List;

import javax.swing.JPanel;

public abstract class TemperatureHumiditySensor extends JPanel implements Runnable{
	
	public static final int MONITOR_WIDTH = 100;
	public static final int MONITOR_HEIGHT = 230;
	
	private List<MonitorError> queue;
	private double minTemp;
	private double maxTemp;
	private double minHumid;
	private double maxHumid;
	private String labName;
	
	
	protected TemperatureHumiditySensor(List<MonitorError> queue, String labName,
			double minTemp, double maxTemp, double minHumid, double maxHumid) {
		this.queue = queue;
		this.labName = labName;
		this.minTemp = minTemp;
		this.maxTemp = maxTemp;
		this.minHumid = minHumid;
		this.maxHumid = maxHumid;
	}
	
	public double getMinTemp() {
		return this.minTemp;
	}

	public double getMaxTemp() {
		return this.maxTemp;
	}

	public double getMinHumid() {
		return this.minHumid;
	}

	public double getMaxHumid() {
		return this.maxHumid;
	}

	public void updateErrors() {
		double temp = this.getCurrentTemperature();
		double humid = this.getCurrentHumidity();
		boolean tempError = temp < this.minTemp || temp > this.maxTemp;
		boolean humidError = humid < this.minHumid || humid > this.maxHumid;
		if (tempError) {
			this.queue.add(new MonitorError(this.labName, MonitorError.TEMPERATURE_ERROR,
					temp > this.maxTemp));
		}
		if (humidError) {
			this.queue.add(new MonitorError(this.labName, MonitorError.HUMIDITY_ERROR,
					humid > this.maxHumid));
		}
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D)g;
		g2.setColor(Color.BLACK);
		g2.fillRect(0, 0, MONITOR_WIDTH, MONITOR_HEIGHT);
		g2.setColor(Color.WHITE);
		g2.setFont(new Font("Arial", Font.PLAIN, 12));
		g2.drawString(this.getLabName(), 5, 15);

		drawBoxWithValue(g2, 10, 20,
				"Temperature", this.getCurrentTemperature(), this.getMinTemp(), this.getMaxTemp());

		drawBoxWithValue(g2, 10, 120, 
				"Humidity", this.getCurrentHumidity(), this.getMinHumid(), this.getMaxHumid());
	}
	
	protected void drawBoxWithValue(Graphics2D g2, int x, int y,
			String name, double value, double min, double max) {
		g2.translate(x, y);
		g2.setColor(Color.WHITE);
		g2.fillRect(0, 0, 80, 60);
		g2.setColor(Color.BLACK);
		String temp = String.format("%.2f", value);
		g2.setFont(new Font("Arial",Font.PLAIN,12));
		g2.drawString(name, 5, 15);
		g2.setFont(new Font("Arial",Font.BOLD,24));
		g2.drawString(temp, 5, 50);
		
		g2.setColor(Color.WHITE);
		g2.setFont(new Font("Arial",Font.BOLD,12));
		g2.drawString(String.format("MIN: %.2f",  min), 0, 75);
		g2.drawString(String.format("MAX: %.2f", max), 0, 90);
		g2.translate(-x, -y);
	}
	
	public String getLabName() {
		return this.labName;
	}
	
	public abstract double getCurrentTemperature();
	
	public abstract double getCurrentHumidity();
	
	

	
}
