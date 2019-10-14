

import java.awt.Color;
import java.awt.Point;

import javax.swing.JComponent;
import javax.swing.JFrame;

/**
 * A standard GUI application viewer.
 * Mostly test code for the GUI.
 * 
 * Run main to start your application.
 * 
 * @author hewner
 *
 */
public class ByoGUIViewer {
	
	/*
	public static class ButtonChangeClickListener implements ByoClickListener {

		ByoMasterComponent master;
		ByoButton button;
		
		public ButtonChangeClickListener(ByoMasterComponent master, ByoButton button) {
			this.master = master;
			this.button = button;
		}
		
		@Override
		public void clickPerformed(Point p) {
			button.setBackground(getRandomColor());
			master.repaint();
		}
	
		public static Color getRandomColor() {
			return new Color((float) Math.random(), (float) Math.random(), (float)Math.random());
		}

	}
	*/
	
	public static void main(String[] args) {
		JFrame frame2 = new JFrame();
		int frameWidth2 = 900;
		int frameHeight2 = 800;

		frame2.setSize(frameWidth2, frameHeight2);
		frame2.setTitle("Build Your Own GUI Framework");
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.setLocation(300, 0);
		
		ByoMasterComponent component = new ByoMasterComponent();
		ByoLabel hello = new ByoLabel("Example");
		component.addByoComponent(hello, 0, 0);
		ByoLabel hello2 = new ByoLabel("ByoLabel");
		component.addByoComponent(hello2, 0, 20);
		
		// Part 1: ByoImage
		/*
		ByoImage logo = new ByoImage("RH.png");
		component.addByoComponent(logo, 120, 0);
		ByoImage alien = new ByoImage("alien.png");
		component.addByoComponent(alien, 320, 0);
		ByoLabel imageLabel = new ByoLabel("Pt 1. ByoImages");
		component.addByoComponent(imageLabel, 150, 230);
		*/
		
		// Part 2: ByoButton Sizing and Drawing
		
		/*
		ByoButton button = new ByoButton("Pt 2. ByoButton", Color.cyan);
		component.addByoComponent(button, 400, 0);
		ByoButton button2 = new ByoButton("ByoButton2", Color.cyan);
		component.addByoComponent(button2, 400, 30);
		*/
		// Part 2: ByoButton ButtonClicks
		
		// NOTE: in addition to uncommenting the code below
		// you must go to the top of this file and uncomment tje
		// ButtonChangeClickListener inner class
		
		/* 
		button.addClickListener(new ButtonChangeClickListener(component, button));
		button2.addClickListener(new ButtonChangeClickListener(component, button2));
		*/
		
		// Part 3: ByoFlowContainer

		/*
		ByoLabel flowLabel = new ByoLabel("Pt 3. ByoFlowContainer");
		component.addByoComponent(flowLabel, 0, 350);

		ByoFlowContainer flow = new ByoFlowContainer();
		
		for(int i = 0; i < 3; i++) {
			ByoButton but = new ByoButton("flow" + i, Color.white);
			but.addClickListener(new ButtonChangeClickListener(component, but));
			flow.addChild(but);
		}
		
		flow.addChild(new ByoImage("alien.png"));
		component.addByoComponent(flow, 0, 300);
		*/
		// Part 4: ByoGridContainer
		/*
		ByoGridContainer grid = new ByoGridContainer(200, 100, 2, 3);
		
		for(int i = 0; i < 5; i++) {
			ByoButton but = new ByoButton("G" + i, Color.white);
			but.addClickListener(new ButtonChangeClickListener(component, but));
			grid.addChild(but);
		}
		grid.addChild(new ByoImage("RH.png"));
		
		
		component.addByoComponent(grid, 300, 300);
		
		ByoLabel gridLabel = new ByoLabel("Pt 4. ByoGridContainer");
		component.addByoComponent(gridLabel, 300, 410);
		*/
		
		frame2.add(component);

		frame2.setVisible(true);
		
		
		
		
		
	}
		
}
