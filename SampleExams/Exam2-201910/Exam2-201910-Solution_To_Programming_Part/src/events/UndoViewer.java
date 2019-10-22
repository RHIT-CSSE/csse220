package events;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 * This is a complete example to get you started
 * 
 * @author hewner
 *
 */
public class UndoViewer {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		
		JLabel label = new JLabel("0", SwingConstants.CENTER); //this label contains your sum
        label.setFont(new Font(label.getFont().getName(), label.getFont().getStyle(), 20));
		
		JPanel panel = new JPanel();
		ArrayList<Integer> ints = new ArrayList<>();
		ints.add(0);
		for(int i = 1; i <= 3; i++ ) {
			JButton button = new JButton("+" + i);
			button.addActionListener(new AddListener(label, ints, i));
			panel.add(button);
		}
		
		JButton undo = new JButton("Undo");
		undo.addActionListener(new UndoListener(label, ints));
		panel.add(undo);
		
		frame.add(label, BorderLayout.CENTER);
		frame.add(panel, BorderLayout.SOUTH);
		frame.setSize(400,100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
