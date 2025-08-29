package textbased;

import java.util.ArrayList;
import java.util.Scanner;


/**
 * Simple text-based demo in order to show refactoring of code to handle collisions
 * 
 * @author Jason Yoder
 *
 *
 *
 */
public class TextCollisonMain {
	

	//Using separate lists in conjunction with Inheritance is a powerful way to deal with collision handling
	private ArrayList<AbstractDrop> drops = new ArrayList<>();
	private ArrayList<BouncingPlatform> platforms = new ArrayList<>();
	private UserControlledPlatform userPlatform;
	

	public static void main(String[] args) {
		TextCollisonMain app = new TextCollisonMain();
		app.handleCollisions();
	}
	
	
	public TextCollisonMain() {
		
		for (int i=0; i<20; i++) {
			this.drops.add(new DamagingDrop( "damage"+i ));
			this.drops.add(new HealingDrop( "heal"+i ));
			this.drops.add(new InvincibilityDrop( "invincible"+i ));
		}

		for (int i=0; i<5; i++) {
			this.platforms.add(new BouncingPlatform( "bouncer"+i ));
		}

		this.userPlatform = new UserControlledPlatform( "user" );

		
	}
	
	
	public void handleCollisions() {
		
		Scanner scanner = new Scanner(System.in);
		String response= "";
		while ( !response.equals("Exit") ) {
			System.out.println("Press Enter to run a round of collisions. Type Exit to end.");
			response = scanner.next();

			for (AbstractDrop d: this.drops) {
				for (BouncingPlatform p: this.platforms) {
					d.collideWith(p);
				} 
				d.collideWith(userPlatform);
			} 
			
		} //end while
		
	}

}
