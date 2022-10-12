package keystrokeHandlerExample;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KH implements KeyListener {

	@Override
	public void keyPressed(KeyEvent ke) {
		System.out.println("keyPressed:" + "\t" + "keyCode: " + ke.getKeyCode());
	} // keyPressed

	@Override
	public void keyReleased(KeyEvent ke) {
		// System.out.println("keyPressed:" + "\t" + "keyCode: " + ke.getKeyCode());
	} // keyReleased

	@Override
	public void keyTyped(KeyEvent ke) {
		// System.out.println("keyPressed:" + "\t" + "keyCode: " + ke.getKeyCode());
	} // keyTyped

}
