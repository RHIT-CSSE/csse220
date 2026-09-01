package fractals;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class SnowflakeComponent extends JComponent {
	
	@Override
	protected void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D)g;
		
		Snowflake small = new Snowflake(100, 100, 100, 1);
		small.drawOn(g2d);
		
		Snowflake medium = new Snowflake(300, 100, 100, 2);
		medium.drawOn(g2d);
		
		Snowflake medium2 = new Snowflake(500, 100, 100, 3);
		medium2.drawOn(g2d);
		
		Snowflake large = new Snowflake(100, 300, 200, 4);
		large.drawOn(g2d);
		
		Snowflake huge = new Snowflake(400, 300, 200, 5);
		huge.drawOn(g2d);

	}

}
