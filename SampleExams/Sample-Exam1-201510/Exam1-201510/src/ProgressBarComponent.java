import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;


/**
 * Creates some sample progress bars.
 * 
 * If you code correctly, your bars should match the ones given on the exam
 * 
 * When you are ready to move to stage 2, you'll need to uncomment some lines
 * 
 * YOU SHOULD NOT NEED TO MODIFY THIS CLASS in any signifigant way
 * You shouldn't need to change the way ProgressBar is used to make it work.
 * You can add to paintComponent to add additional bars for your testing.
 * 
 * @author Buffalo
 *
 */
@SuppressWarnings("serial")

public class ProgressBarComponent extends JComponent {

	@Override
	protected void paintComponent(Graphics g) {
		
		Graphics2D g2 = (Graphics2D) g;
		
		Font font = new Font("Courier", Font.PLAIN, 50);
		g2.setFont(font);
		
		ProgressBar bar = new ProgressBar();
		bar.setPercentage(100);
		bar.drawOn(g2);
		
		/* STAGE 2 & 3 - uncomment to make these work 
		 
		ProgressBar bar2 = new ProgressBar(0, 100, 250, 150);
		bar2.setPercentage(75);
		bar2.drawOn(g2);
		
		ProgressBar bar3 = new ProgressBar(250, 100, 250, 150);
		bar3.setPercentage(10);
		bar3.drawOn(g2);
		
		ProgressBar bar4 = new ProgressBar(300, 300, 339, 179);
		bar4.setPercentage(50);
		bar4.drawOn(g2);
		
		*/
	}

}
