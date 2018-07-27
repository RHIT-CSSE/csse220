package minesweeperEasierTesting;
/**
 * Unit tests for the {@link MinesweeperMain}  GUI.
 * 
 * @author defoe on Nov 3, 2015.
 */
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import minesweeperEasier.MinesweeperGame;
import minesweeperEasier.MinesweeperGenerator;
import minesweeperEasier.MinesweeperMain;
import minesweeperEasier.RandomMinesweeperGenerator;

public class MinesweeperMainTest {
	private MinesweeperGame game;
	private JLabel label;
	private int size;
	private String labelText;
	
	public JButton[][] getButtons(MinesweeperGame game){
		JPanel bigPanel = MinesweeperMain.initializePanel(game, label);
		JButton[][] buttons = new JButton[size][size]; 
		Component[] innerPanels = bigPanel.getComponents();
		for(int r = 0; r < innerPanels.length; r++){
			JPanel p = (JPanel) innerPanels[r];
			Component[] jbuttons = p.getComponents();
			for(int c = 0; c < jbuttons.length; c++){
				JButton b = (JButton) jbuttons[c];
				buttons[r][c] = b;
			}
		}
		
		return buttons;
	}
	
	@Before
	public void setUp() throws Exception {
		size = 7;
		labelText = "Enjoy Minesweeper";
		MinesweeperGenerator generator = new RandomMinesweeperGenerator(size);
		game = new MinesweeperGame(generator);
		label = new JLabel(labelText);
	}

	@After
	public void tearDown() throws Exception {
		game = null;
		label = null;
	}

	@Test
	public void testInitializePanel() {
		JButton[][] buttons = getButtons(game); 
		assertEquals(label.getText(), labelText);
		for(int r = 0; r < buttons.length; r++){
			for(int c = 0; c < buttons[r].length; c++){
				assertEquals(buttons[r][c].getText(), "?");
			}
		}
		
	}
	
	@Test
	public void testButtonEventHandling(){
		JButton[][] buttons = getButtons(game); 
		for(int r = 0; r < buttons.length; r++){
			for(int c = 0; c < buttons[r].length; c++){
				buttons[r][c].doClick();
				assertNotEquals(buttons[r][c].getText(), "?");
			}
		}
	}
	
	@Test
	public void testLostState(){
		JButton[][] buttons = getButtons(game); 
		assertEquals(label.getText(), labelText);
		for(int r = 0; r < buttons.length; r++){
			for(int c = 0; c < buttons[r].length; c++){
				buttons[r][c].doClick();
				if(buttons[r][c].getText().equals("X")){
					assertNotEquals(label.getText(), labelText);
					return;
				}
			}
		}
	}

}
