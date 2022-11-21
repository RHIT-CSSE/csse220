package sim;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
/**
 * This class DOES have to be modified in Part 3 and 4.
 * 
 * This class is where the program begins and it provides 
 * the setup and configuration of various GUI pieces.
 * 
 * @author Jason Yoder
 *
 * 
 *************************************************************************************** 
 *         REQUIRED HELP CITATION
 * 
 *         Help from anyone other than a CSSE220 Instructor or CSSE220 TA must
 *         be cited. If you didn't get any outside help, then you can simply
 *         state below: "I did not receive any outside help"
 ***************************************************************************************
 *         Help Citation (for this or any other files in this assignment)
 * 
 *         TODO: cite your help here
 *************************************************************************************** 
 */
public class SimulationViewer {
		
	public static final int FRAME_WIDTH = 800;
	public static final int FRAME_HEIGHT = 600;
	public static final Color LIGHT_GRAY = new Color(200,200,200);
	
	//How long to wait in milliseconds between each step of the simulation
	private static final int DELAY = 50;
	
	public static void main(String[] args) {
		new SimulationViewer();
	}
	
	public SimulationViewer() {
		JFrame frame = new JFrame();
		frame.setPreferredSize( new Dimension(FRAME_WIDTH, FRAME_HEIGHT));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Create a component for visualizing population status
		PandemicStatsComponent statsComponent = new PandemicStatsComponent();
		frame.add(statsComponent, BorderLayout.SOUTH);
		
		//Create a component for watching simulations
		SimulationComponent simulationComponent = new SimulationComponent(statsComponent);
		frame.add(simulationComponent, BorderLayout.CENTER);
		
		//create a panel for buttons
		JPanel buttonPanel = new JPanel();
		//Set up the panel to use a vertical layout and give it a background color
		buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));
		buttonPanel.setBackground( LIGHT_GRAY );
		
		//create panel to add dropdown and label to
		JPanel dropdownPanel  = new JPanel();
		dropdownPanel.setBackground( LIGHT_GRAY );
		JLabel dropdownLabel = new JLabel("Select number to add: ");
		dropdownPanel.add(dropdownLabel);
		buttonPanel.add(dropdownPanel);
		
		//Modify this if you wish to add different numbers of things into the simulation
		Integer[] numbersForDropdown = {1, 10, 100};
		// create a combo box with the fixed array so you can pick how many things to add
		JComboBox<Integer> addNumberSelector = new JComboBox<Integer>(numbersForDropdown);
		//set its maximum size to be its preferred size so it doesn't get too big
		addNumberSelector.setMaximumSize( addNumberSelector.getPreferredSize() );
		addNumberSelector.setAlignmentX(Component.LEFT_ALIGNMENT);
		
		dropdownPanel.add( addNumberSelector );
		dropdownPanel.setMaximumSize( dropdownPanel.getPreferredSize() );
		
		//Button for adding Particles to a simulation
		JButton addParticles = new JButton("Add Particles");
		addParticles.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//passes in the number from the dropdown list
				simulationComponent.addParticles(  (Integer)addNumberSelector.getSelectedItem()  );
			} });
		buttonPanel.add( addParticles );
		
		//Button for adding TagPlayers to simulation (includes 1 "it" player)
		JButton addTagPlayers = new JButton("Add TagPlayers");
		addTagPlayers.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//passes in the number from the dropdown list
				simulationComponent.addTagPlayers( (Integer)addNumberSelector.getSelectedItem() );
			} });
		buttonPanel.add( addTagPlayers );
		
		//////////////////////////////////////////////
		//YOU DO NOT HAVE TO MODIFY CODE ABOVE HERE //
		//////////////////////////////////////////////
		
		//TODO Part 3 add buttons to add ChargedParticles, see JButton addParticle for an example
		
		
		
		
		//TODO Part 4 add buttons to add Persons, see JButton addParticle for an example
		
		
		
		
		
		//////////////////////////////////////////////
		//YOU DO NOT HAVE TO MODIFY CODE BELOW HERE //
		//////////////////////////////////////////////
		
		//Button to clear all the different things from our simulation
		JButton clear = new JButton("Clear All");
		clear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				simulationComponent.clearAll();
			} });
		buttonPanel.add( clear );
		
		// Add button panel on the right side
		frame.add(buttonPanel, BorderLayout.EAST);
		
		//We study these in the MoreEventBasedProgramming project
		Timer t = new Timer(DELAY, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				simulationComponent.update();
				simulationComponent.repaint();
				statsComponent.repaint();
				frame.repaint();
			}
		});
		
		//Starts the simulator
		t.start();
		frame.pack();
		frame.setVisible(true);	
	}
}
