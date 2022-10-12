package graphics;
import javax.swing.JFrame;


public class ResponsiveCarViewer {
	
	private JFrame frame;
	
	//
	// ----------------------------------------------------------------------------
	//
	
	private void setUpViewer() {
		final int frameWidth = 800;
		final int frameHeight = 600;
		
		this.frame = new JFrame();
		this.frame.setTitle("Graphics Question");
		this.frame.setSize(frameWidth, frameHeight);
		this.frame.setLocation(200, 200);
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ResponsiveCarComponent component = new ResponsiveCarComponent();
		this.frame.add(component);

		
		//----------------------------------------------------------------------------
		// HERE ARE THE TODO'S
		//----------------------------------------------------------------------------
		// TODO #0
		// -- Run the application found in the package: keystrokeHandlerExample
		// -- Understand the code found in that package
		// -- Run this application to see from where you are starting
		
		// TODO #1: Add a Keystroke Handler (8 points)
		// -- Make car turn to the following directions when arrow keys are typed
		//    up arrow: North (angle = 270)
		//  down arrow: South (angle = 90, and if 90 doesn't seem to work, try 450)
		// right arrow: East  (angle = 0)
		//  left arrow: West  (angle = 180)
		
		
		// TODO #2: Modify Keystroke Handler from #1 (8 points)
		// -- Make car move when the space bar is typed
		
		// TODO #3: Modify what gets drawn (5 points)
		// -- Make car leave a trail when it moves, you can think of this as exhaust
		// Draw a line from the move's starting point to its ending point	
		// This trail needs to be persistent, i.e., you should be able to see the line from 
		// where car starts and finally ends up after all turns and moves have been processed
		//----------------------------------------------------------------------------

	} // setUpViewer
	
	//
	//----------------------------------------------------------------------------
	//
	
	//You do NOT have to change this method
	private void runApp() {
		this.frame.setVisible(true);
	} // runApp

	//
	//----------------------------------------------------------------------------
	//
		
	//You do NOT have to change this method
	public static void main(String[] args) {
		ResponsiveCarViewer responsiveCarViewer = new ResponsiveCarViewer();
		responsiveCarViewer.setUpViewer();
		responsiveCarViewer.runApp();
	} // main
	

	


	
	
	
	

}
