package capitalizeExample;

import capitalizeExampleSol.CapitalizeListener;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * This is a complete example to get you started
 * 
 * @author hewner
 *
 */
public class CapitalizeViewer {

	public static void main(String[] args) {
		String name = "BUFFALO";
		JFrame frame = new JFrame();
		
		JPanel panel = new JPanel();
		
		for(int i = 0; i < name.length(); i++) {
			JButton b = new JButton(name.charAt(i) + "");
			b.addActionListener(new CapitalizeListener(b));
			panel.add(b);
		}
		
		
		frame.add(panel, BorderLayout.CENTER);
		frame.add(new JLabel("Press a letter to change capitalization"), BorderLayout.SOUTH);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
