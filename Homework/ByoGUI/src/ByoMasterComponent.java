import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JComponent;

/**
 * 
 * This is the one part of the system that interacts with the standard java
 * swing library. All other classes are ByoComponents (i.e. they are in the
 * class hierarchy we build ourselves, not the ones that java provides). As a
 * result, all visible drawing must start with the Graphics object provided to
 * paintComponent here.
 * 
 * This component is meant to be the only component in a Java swing window. It
 * has child components which are of ByoComponent subclasses.
 * 
 * Usage:
 * 
 * JComponent component = new ByoMasterComponent();
 * component.addByoComponent(new ByoLabel("hello"), 10, 10);
 * myJFrame.add(component);
 * 
 * @author hewner
 *
 */
public class ByoMasterComponent extends JComponent implements MouseListener {

	private ArrayList<ByoComponent> byoComponents; 
	
	public ByoMasterComponent() {
		byoComponents = new ArrayList<ByoComponent>();
		addMouseListener(this);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
	    
		// this makes things slightly prettier looking
		RenderingHints rh = new RenderingHints(
	             RenderingHints.KEY_TEXT_ANTIALIASING,
	             RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
	    g2.setRenderingHints(rh);
		

		for(ByoComponent cur : byoComponents) {
			cur.drawOn(g2);
		}
	}
	
	public void addByoComponent(ByoComponent comp, int x, int y) {
		comp.setPosition(x, y, comp.getPreferredWidth(), comp.getPreferredHeight());
		this.byoComponents.add(comp);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		for(ByoComponent cur: byoComponents) {
			if(cur.containsPoint(e.getPoint())) {
				cur.acceptClick(e.getPoint());
			}
		}		
	}

}
