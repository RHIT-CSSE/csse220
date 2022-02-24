package events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener {

	private HourTimerComponent component;
	private int hour;

	public ButtonListener(HourTimerComponent component, int hour) {
		this.component = component;
		this.hour = hour;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("Button " + hour + " pressed.");
		component.setHour(hour);

	}

}
