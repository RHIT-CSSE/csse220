package graphics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * 
 *  
 * 
 * @author YOUR_USERNAME
 *
 */
public class ResponsiveCarComponent extends JComponent {
	private static final long serialVersionUID = 1L;
	
	//
	// ************************************************************************
	//
	
	//There is only a single care which we will be using
	private ResponsiveCar car;
	
	//
	// ************************************************************************
	//
	

	//////////////////////
	// Part 1
	public void setCarDirection(int angle) {
		this.car.setDirection(angle);
	}
	//////////////////////
	
	//
	// ************************************************************************
	//
		
	//////////////////////
	// Part 2
	public void moveCarForward(int distance) {
		this.car.moveForward(distance);
	} // moveCarForward	
	//////////////////////	
	
	//
	// ************************************************************************
	//	

	public ResponsiveCarComponent() {
		this.car = new ResponsiveCar();
	} // ResponsiveCarComponent
	
	@Override
	protected void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		
		//This is for quick reference, feel free to comment it out if you like
		g2d.drawString("Part 1 ( required ) - Add functionality: change car directions using arrow keys - See TODO #1 ", 20, 20);
		g2d.drawString("Part 2 ( required ) - Add functionality: move car in direction it is facing when space bar is typed - See TODO #2", 20, 40);
		g2d.drawString("Part 3 ( required ) - Add functionality: when care moves, have it leave a trail - See TODO #3", 20, 60);
		this.car.drawOn(g2d);
	} // paintComponent
	
} // ResponsiveCarComponent
