package sim;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import javax.swing.JComponent;
import simulationObjects.Person;

/**
 * This class does NOT have to be modified.
 * 
 * It is a specialized JComponent that allows the visualization of the 
 * statistics of a population of Person(s) who are healthy, infected, and
 * recovered from disease. 
 * 
 * Makes use of the constants from the Person class.
 * 
 * Inspired by this website: https://www.washingtonpost.com/graphics/2020/world/corona-simulator/
 * 
 * @author Jason Yoder
 *
 */
public class PandemicStatsComponent extends JComponent {

	//How thick the lines are in the graph
	public static final int LINE_WIDTH   = 2;
	//How high to makes the graph
	public static final int STATS_HEIGHT = 200;
	//How wide to make side panel for reporting numbers
	public static final int SIDE_OFFSET  = 100;
	
	//track the number of individuals with each status
	private ArrayList<Integer> healthyLog = new ArrayList<Integer>();
	private ArrayList<Integer> infectedLog = new ArrayList<Integer>();
	private ArrayList<Integer> recoveredLog = new ArrayList<Integer>();
	
	public PandemicStatsComponent() {
		this.setPreferredSize(new Dimension(SimulationViewer.FRAME_WIDTH, STATS_HEIGHT) );
	}
	
	//add to the logs
	public void addEntry(int heathy, int sick, int recovered ) {
		this.healthyLog.add(heathy);
		this.infectedLog.add(sick);
		this.recoveredLog.add(recovered);
	}
	
	//reset the logs
	public void reset() {
		this.healthyLog.clear();
		this.infectedLog.clear();
		this.recoveredLog.clear();
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		
		//Draw box for reporting numbers
		g2.drawRect(0, 0, SIDE_OFFSET-1, this.getHeight() );
		//Fill region for data to be shown
		g2.fillRect(SIDE_OFFSET, 0, this.getWidth()-SIDE_OFFSET, this.getHeight() );
		
		//Don't try to draw unless there is data to be drawn
		if ( recoveredLog.size() > 0) {
			//Use color constants so that they line up with the color of the Person categories.
			g2.setColor(Person.RECOVERED_COLOR);
			g2.drawString("Recovered:" + recoveredLog.get(recoveredLog.size()-1 ), SIDE_OFFSET/10, STATS_HEIGHT/4 );
			
			g2.setColor(Person.HEALTHY_COLOR);
			g2.drawString("Healthy:" + healthyLog.get(healthyLog.size()-1 ), SIDE_OFFSET/10, STATS_HEIGHT*2/4);
			
			g2.setColor(Person.INFECTED_COLOR);
			g2.drawString("Infected:" + infectedLog.get(infectedLog.size()-1 ), SIDE_OFFSET/10, STATS_HEIGHT*3/4 );
		}
		
		//Loops through data to make a chart based on the numbers
		for (int i=0; i< healthyLog.size() && i*LINE_WIDTH < this.getWidth() ; i++ ) {
			
			//sum to get total to calculate percentage
			double total = healthyLog.get(i) + infectedLog.get(i) + recoveredLog.get(i);
			
			//make it percentageBased
			int healthyPercent = (int)(STATS_HEIGHT * healthyLog.get(i) / total);
			int infectedPercent = (int)(STATS_HEIGHT * infectedLog.get(i) / total);
			int recoveredPercent = (int)(STATS_HEIGHT * recoveredLog.get(i) / total);
			
			//offset slightly to get lines to show up
			int yPos = 1;
			
			//we use the defined colors from Person class
			//Draw from the top down
			g2.setColor(Person.RECOVERED_COLOR);
			g2.fillRect(SIDE_OFFSET + i*LINE_WIDTH, yPos, LINE_WIDTH, yPos + recoveredPercent );
			yPos += recoveredPercent;
			
			g2.setColor(Person.HEALTHY_COLOR);
			g2.fillRect(SIDE_OFFSET + i*LINE_WIDTH, yPos, LINE_WIDTH, yPos + healthyPercent );
			yPos += healthyPercent;
			
			g2.setColor(Person.INFECTED_COLOR);
			g2.fillRect(SIDE_OFFSET + i*LINE_WIDTH, yPos, LINE_WIDTH, yPos + infectedPercent );
		}	
	}
}