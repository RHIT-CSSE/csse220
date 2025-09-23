//package hourtimer;
//import java.awt.BasicStroke;
//import java.awt.Graphics;
//import java.awt.Graphics2D;
//import java.awt.RenderingHints;
//import javax.swing.JComponent;
//
//public class HourTimerComponent extends JComponent {
//	private static final long serialVersionUID = 1L;
//
//	//
//	// ****************************************************************************************
//	//
//
//	/**
//	 * ensures: draws some guide lines to make the geometry more obvious
//	 * @param g2d the graphics object to draw on
//	 */
//	private void drawDottedLines(Graphics2D g2d){
//		float dash1[] = {10.0f};
//	    BasicStroke dashed = new BasicStroke(1.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 10.0f, dash1, 0.0f);
//	    BasicStroke regular = new BasicStroke();
//	    g2d.setStroke(dashed);
//		g2d.drawLine(0, 300, 600, 300);
//		g2d.drawLine(300, 0, 300, 600);
//		g2d.setStroke(regular);
//	} // drawDottedLines
//
//	//
//	// ****************************************************************************************
//	//
//
//	/**
//	 * ensures: draws the big clock on g2d
//	 * @param g2d the graphics object to draw on
//	 */
//	private void doStage1(Graphics2D g2d) {
//		HourTimer bigClock = new HourTimer();
//		bigClock.drawOn(g2d);
//	} // doStage1
//
//	//
//	// ****************************************************************************************
//	//
//
//	/**
//	 * ensures: draws the clocks at the top of the frame
//	 * @param g2d the graphics object to draw on
//	 */
//	private void doStage2(Graphics2D g2d) {
//		final int clockRadius = 50;
//		final int maxClockCenterX = 600;
//		final int clockCenterInc = 100;
//		int startingClockCenterX = 350;
//		int clockCenterY = 50;
//
//		for(int clockCenterX = startingClockCenterX; clockCenterX < maxClockCenterX; clockCenterX += clockCenterInc) {
//			HourTimer upperRightClock = new HourTimer(clockCenterX, clockCenterY, clockRadius);
//			upperRightClock.drawOn(g2d);
//		} // end for
//
//		// draw a 20x20 clock in the upper left hand corner
//		HourTimer upperLeftClock = new HourTimer(10, 10, 10);
//		upperLeftClock.drawOn(g2d);
//	} // doStage2
//
//	//
//	// ****************************************************************************************
//	//
//
//	/**
//	 * ensures: draws the clocks at the bottom of the frame
//	 * @param g2d the graphics object to draw on
//	 */
//	private void doStage3(Graphics2D g2d) {
//		final int clockRadius = 50;
//		final int maxClockCenterX = 600;
//		final int clockCenterInc = 100;
//		final int addTenMinutes = 10;
//		int clockTimeInMinutes = 0;
//		int clockCenterY = 550;
//		int startingClockCenterX = 50;
//		for(int clockCenterX = startingClockCenterX; clockCenterX < maxClockCenterX; clockCenterX += clockCenterInc) {
//			HourTimer lowerClock = new HourTimer(clockCenterX, clockCenterY, clockRadius);
//			lowerClock.setTime(clockTimeInMinutes);
//			lowerClock.drawOn(g2d);
//			clockTimeInMinutes += addTenMinutes;
//		} // end for
//	} // doStage3
//
//	//
//	// ****************************************************************************************
//	//
//
//	/**
//	 * ensures: calls all the doStageX operations to get the clocks drawn
//	 * @param g treats 'g' as a Graphics2D
//	 */
//	@Override
//	protected void paintComponent(Graphics g) {
//		super.paintComponent(g);
//		Graphics2D g2d = (Graphics2D) g;
//
//		//
//		// Use 'setRenderingHint' to make things look slightly prettier
//		// For more details on this, search:  java docs "Controlling Rendering Quality"
//		//
//		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//
//
//		this.drawDottedLines(g2d);
//
//		//
//		// Use procedural abstraction by placing code for each stage in its own helper operation
//		//
//		this.doStage1(g2d);
//		this.doStage2(g2d);
//		this.doStage3(g2d);
//	} // paintComponent
//
//
//} // end class HourTimerComponent
