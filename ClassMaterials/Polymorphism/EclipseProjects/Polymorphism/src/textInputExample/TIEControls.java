package textInputExample;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * A panel to hold the controls for this example.
 * 
 * @author Curt Clifton. Created Oct 12, 2008.
 */
public class TIEControls extends JPanel {

	private TIEComponent graphicComponent;
	private JButton updateButton;
	private JTextField xField;
	private JTextField yField;

	/**
	 * Constructs a control panel that updates the given component.
	 * 
	 * @param graphicComponent
	 */
	public TIEControls(TIEComponent graphicComponent) {
		this.graphicComponent = graphicComponent;

		JLabel xLabel = new JLabel("X:");
		this.add(xLabel);
		this.xField = new JTextField(4);
		this.xField
				.setText(Integer.toString(this.graphicComponent.getShapeX()));
		this.add(this.xField);

		JLabel yLabel = new JLabel("Y:");
		this.add(yLabel);
		this.yField = new JTextField(4);
		this.yField
				.setText(Integer.toString(this.graphicComponent.getShapeY()));
		this.add(this.yField);

		this.updateButton = new JButton("Update");
		this.add(this.updateButton);
		this.updateButton.addActionListener(new Updater());
	}

	private class Updater implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			/*
			 * The "TIEControls." before the "this" tells Java to look at the
			 * fields of the surrounding class:
			 */
			String xText = TIEControls.this.xField.getText();
			int x = Integer.parseInt(xText);
			String yText = TIEControls.this.yField.getText();
			int y = Integer.parseInt(yText);

			TIEControls.this.graphicComponent.setShapeX(x);
			TIEControls.this.graphicComponent.setShapeY(y);
		}
	}
}
