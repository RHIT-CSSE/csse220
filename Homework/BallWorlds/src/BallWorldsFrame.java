

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * This is the main window for the application. It can display a collection of
 * ball simulations.
 * 
 * @author Curt Clifton. Created Jan 22, 2011.
 */
public class BallWorldsFrame extends JFrame {

	private static final int GAP = 10;

	/**
	 * Constructs a frame for displaying the given simulations.
	 * 
	 * @param panels
	 *            a non-empty list of simulation panels to display
	 */
	public BallWorldsFrame(List<SimulationPanel> panels) {
		setTitle("Ball Worlds");

		JPanel content = new JPanel();
		// Changes the layout of the panel so the worlds will stack vertically
		content.setLayout(new BoxLayout(content, BoxLayout.PAGE_AXIS));
		// add "rigid stuff" to force minimum spacing
		content.add(Box.createVerticalStrut(GAP));
		for (SimulationPanel sp : panels) {
			content.add(sp);
			content.add(Box.createVerticalStrut(GAP));
		}
		add(content);

		add(quitButtonComponent(), BorderLayout.PAGE_END);
		setResizable(false);
		
		pack();
	}

	/**
	 * Adds a quit button to the bottom-right corner of the window.
	 */
	private JComponent quitButtonComponent() {
		Box quitPanel = Box.createHorizontalBox();
		quitPanel
				.setBorder(BorderFactory.createEmptyBorder(0, GAP, GAP, GAP));
		quitPanel.add(Box.createHorizontalGlue());
		JButton quitButton = new JButton("Quit");
		quitPanel.add(quitButton);

		ActionListener quitter = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				dispose();
				System.exit(0);
			}
		};
		
		quitButton.addActionListener(quitter);
		return quitPanel;
	}

}
