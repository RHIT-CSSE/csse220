package sim;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JComponent;
import simulationObjects.Particle;
import simulationObjects.Person;
import simulationObjects.TagPlayer;
/**
 * This class DOES have to be modified in Part 3 and 4.
 * 
 * This is a specialized JComponent that allows the visualization of various
 * objects to move around and bounce off of each other.
 * 
 * It is also connected to a PandemicStatsComponent to report the changing
 * rate of health status for a population of people.
 * 
 * @author Jason Yoder
 *
 */
public class SimulationComponent extends JComponent {
	
	//Convenient object used to generate random numbers conveniently
	private Random rand = new Random();
	
	// NOTE: You should NOT combine these into a single list
	// In future classes we will discuss ways to handle many types of 
	// interacting objects, but for this assignment just keep these separate
	private ArrayList<Particle> particles = new ArrayList<Particle>();
	private ArrayList<TagPlayer> tagPlayers = new ArrayList<TagPlayer>();
	private ArrayList<Person> persons = new ArrayList<Person>();
	
	private PandemicStatsComponent statsComponent;

	//Stores a reference to statsComponent to send logging information later
	public SimulationComponent(PandemicStatsComponent statsComponent) {
		this.statsComponent = statsComponent; 
	}
	
	//Add Particles to the simulation based on the dropdown number selected
	public void addParticles(int count) {
		for (int i=0; i< count; i++) {
			this.particles.add( new Particle( rand.nextInt( this.getWidth() ), rand.nextInt( this.getHeight() )  )   );
		}
	}
	
	//Add TagPlayers to the simulation based on the dropdown number selected
	public void addTagPlayers(int count ) {
		for (int i=0; i< count; i++) {
			this.tagPlayers.add( new TagPlayer( rand.nextInt( this.getWidth() ), rand.nextInt( this.getHeight() ), false )   );
		}
		//Add at least one Person who is "it"
		TagPlayer playWhoIsIt = new TagPlayer(rand.nextInt( this.getWidth() ), rand.nextInt( this.getHeight() ), true);
		this.tagPlayers.add(  playWhoIsIt  );
	}
	
	//////////////////////////////////////////////
	//YOU DO NOT HAVE TO MODIFY CODE ABOVE HERE //
	//////////////////////////////////////////////
	
	
	
	
	
	//TODO Part 3 add method for adding ChargedParticles, see addParticles() for an example
	

	
	/** 
	 * TODO: Add Person(s) to the simulation based on the dropdown number selected 
	 * 
	 * Make sure that you add one infected person in order to see how infect spreads.
	 * 
	 * @param count
	 */
	public void addPeople(int count ) {
		// TODO Part 4 Complete this method
		// add the parameter "count" number of people and 1 infected person
		// should add each Person to the ArrayList this.persons defined at the top
		
	}
	
	
	
	
	
	
	
	

	//////////////////////////////////////////////
	//YOU DO NOT HAVE TO MODIFY CODE BELOW HERE //
	//////////////////////////////////////////////
	
	// You should NOT need to modify this method
	public void clearAll() {
		this.particles.clear();
		this.tagPlayers.clear();
		this.persons.clear();
		this.statsComponent.reset();
	}
	
	/**
	 * This method simply draw all simulation objects
	 * 
	 * You do NOT need to change this method
	 * 
	 */
	@Override
	protected void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D)g;

		// In later classes we will discuss way to avoid this code duplication,
		// but you do not need to here.
		for (TagPlayer t: this.tagPlayers) {
			t.drawOn(g2);
		}		
		for (Particle p: this.particles) {
			p.drawOn(g2);
		}	
		for (Person p: this.persons) {
			p.drawOn(g2);
		}	
		
	}	
	
	/**
	 *   You do NOT need to change this method
	 * 
	 *   This method simply loops through every kind of simulation object
	 *   and calls its update() method so that it will move appropriately.
	 *   It also checks to see if specific types of objects bump into each other
	 *   and if so calls the appropriate code. 
	 */
	public void update() {
		
		// In later classes we will discuss way to avoid this code duplication,
		// but you do not need to here.
		
		//move everything
		for (TagPlayer t: this.tagPlayers) {
			t.update( this.getSize() );
		}		
		for (Particle p: this.particles) {
			p.update( this.getSize() );
		}		
		for (Person p: this.persons) {
			p.update( this.getSize() );
		}	
		
		// In later classes we will discuss way to avoid this code duplication,
		// but you do not need to here.
		
		//check if anything is bumping and call bounce on it if so
		for (TagPlayer t1: this.tagPlayers) {
			for (TagPlayer t2: this.tagPlayers) {
				if (t1 != t2 && t1.overlapsWith(t2) ) {
					t1.bounce( t2 );
				}
			}
		}
		for (Particle p1: this.particles) {
			for (Particle p2: this.particles) {
				if (p1 != p2 && p1.overlapsWith(p2) ) {
					p1.bounce( p2 );
				}
			}
		}
		for (Person p1: this.persons) {
			for (Person p2: this.persons) {
				if (p1 != p2 && p1.overlapsWith(p2) ) {
					p1.bounce( p2 );
				}
			}
		}
		
		//Calls method to report information to visualization
		logPandemicInformation();
	}

	
	/**
	 * This code should not need to be changed.
	 * You need to implement code in Person in order for this to work.
	 */
	private void logPandemicInformation() {
		int healthy = 0;
		int sick = 0;
		int recovered = 0;
		for (Person p: this.persons) {
			//count and visualize the number of people in different states over time
			if (p.isHealthy() ) {
				healthy++;
			} else if (p.isInfected() ) {
				sick++;
			} else if (p.isRecovered() )  {
				recovered++;
			}
		}
		//only log information when there is information to report
		if( healthy + sick + recovered > 0) {
			this.statsComponent.addEntry(healthy, sick, recovered);
		}
	}

}
