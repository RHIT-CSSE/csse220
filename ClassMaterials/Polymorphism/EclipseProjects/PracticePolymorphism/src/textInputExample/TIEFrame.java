package textInputExample;

import java.awt.BorderLayout;

import javax.swing.JFrame;

/**
 * TextInputExample main GUI frame.
 *
 * @author Curt Clifton.
 *         Created Oct 12, 2008.
 */
public class TIEFrame extends JFrame {
	private TIEComponent graphicComponent;
	private TIEControls controlPanel;

	/**
	 * Constructs the main GUI frame object.
	 */
	public TIEFrame() {
		this.setTitle("Text Input Example");

		this.setSize(600, 480);
		
		
		this.graphicComponent = new TIEComponent(10,10,20,20);
		this.add(this.graphicComponent, BorderLayout.CENTER);

		this.controlPanel = new TIEControls(this.graphicComponent);
		this.add(this.controlPanel, BorderLayout.SOUTH);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
