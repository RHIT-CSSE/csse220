package simulationObjects;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Dimension2D;

/**
 * This class represents a Person who can either be healthy (green), infected (orange), or recovered (pink).
 * Once a Person becomes infected, they will remain infected for a certain length of time before they
 * become recovered. Once recovered, the Person cannot be infected again.
 * 
 * Inspired by this article: https://www.washingtonpost.com/graphics/2020/world/corona-simulator/
 * 
 * To visualize a population of Persons over time you should provide a method that says if a Person 
 * isHealthy, isSick, or isRecovered.
 * 
 * 
 * This class should use inheritance to make it simple to write. You should not need to copy and paste
 * 
 * TODO: Part 4 You can change this file but will need to provide each of the methods started in order to get full 
 * functionality.
 * 
 * @author YOUR_NAME
 *
 */
public class Person {
	
	public static final int PERSON_RADIUS = 10;
	public static final int PERSON_SPEED = 5;
	
	//How many timesteps to recover once infected
	public static final int TIME_TO_RECOVER = 100;
	
	public static final Color HEALTHY_COLOR = new Color(134, 184, 184);
	public static final Color INFECTED_COLOR = new Color(204, 102, 0);
	public static final Color RECOVERED_COLOR = new Color(196, 116, 195);
	
	
	//TODO: add instance variables
	
	//TODO: add constructors


	public void drawOn(Graphics2D g) {
		//USE COLOR CONSTANTS to draw people with different statuses
	}

	public void update(Dimension2D dim) {
		//TODO Update your position
	}
	
	public void bounce(Person other) {
		//TODO Infect healthy people when they bounce off of infected people
	}

	public boolean isHealthy() {
		// TODO return true if this person is healthy.  False if infected or recovered
		return false;
	}

	public boolean isInfected() {
		// TODO return true if this person is sick.  False if infected or recovered
		return false;
	}
	
	public boolean isRecovered() {
		// TODO return true if this person is recovered.  False if infected or healthy
		return false;
	}

	public boolean overlapsWith(Person other) {
		// TODO return true if the person is within range of another
		return false;
	}


}
