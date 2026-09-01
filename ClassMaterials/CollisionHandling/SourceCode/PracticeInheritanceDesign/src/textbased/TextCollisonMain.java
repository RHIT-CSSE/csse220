package textbased;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Simple text-based demo in order to show refactoring of code to handle collisions
 * 
 * @author Jason Yoder
 *
 */
public class TextCollisonMain {

	// Demo instance of usage with a single main list
	private ArrayList<GameObject> allGameObjects = new ArrayList<>();

	public static void main(String[] args) {
		TextCollisonMain app = new TextCollisonMain();
		app.handleCollisions();
	}

	public TextCollisonMain() {

		for (int i = 0; i < 20; i++) {
			allGameObjects.add(new DamagingDrop("damage" + i));
			allGameObjects.add(new HealingDrop("heal" + i));
			//TODO add InvincibilityDrop Class
			// allGameObjects.add(new InvincibilityDrop( "invincible"+i ));
		}

		for (int i = 0; i < 5; i++) {
			allGameObjects.add(new BouncingPlatform("bouncer" + i));
		}

		allGameObjects.add(new UserControlledPlatform("user"));

	}

	public void handleCollisions() {

		Scanner scanner = new Scanner(System.in);
		String response = "";
		while (!response.equals("Exit")) {
			System.out.println("Type anything and then press Enter to run a round of collisions. Type Exit to end.");
			response = scanner.next();

			for (GameObject o1 : allGameObjects) {
				for (GameObject o2 : allGameObjects) {

					// UGLY CODE NEVER DO THIS!

					if (o1 instanceof DamagingDrop && o2 instanceof UserControlledPlatform) {
						if (o1.intersects(o2)) {
							DamagingDrop d = (DamagingDrop) o1;
							UserControlledPlatform p = (UserControlledPlatform) o2;

							System.out.println(d + " collided with userPlatform and will be removed");
						}
					}

					if (o1 instanceof HealingDrop && o2 instanceof UserControlledPlatform) {
						if (o1.intersects(o2)) {
							HealingDrop d = (HealingDrop) o1;
							UserControlledPlatform p = (UserControlledPlatform) o2;

							System.out.println(d + " collided with userPlatform and will be removed");
						}
					}

					if (o1 instanceof DamagingDrop && o2 instanceof BouncingPlatform) {
						if ( o1.intersects(o2)) {
							DamagingDrop d = (DamagingDrop) o1;
							BouncingPlatform p = (BouncingPlatform) o2;
							System.out.println(d + " collided with BouncingPlatform and will be removed");
							System.out.println(p + " collided with DamagingDrop and will be 1 drop wetter.");

						}
					}

					if (o1 instanceof HealingDrop && o2 instanceof BouncingPlatform) {
						if ( o1.intersects(o2)) {
							HealingDrop d = (HealingDrop) o1;
							BouncingPlatform p = (BouncingPlatform) o2;
							System.out.println(d + " collided with BouncingPlatform and will be removed");
							System.out.println(p + " collided with HealingDrop and will be completely dry.");
						}
					}
					
					//TODO add InvincibilityDrop Collision Handling Code
					
					

				} // end for

			} // end for

		} // end while

	}

}
