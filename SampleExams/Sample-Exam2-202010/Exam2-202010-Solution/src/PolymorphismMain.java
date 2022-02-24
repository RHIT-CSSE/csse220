import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Look at the computer part documentation to see what to do here.
 */
public class PolymorphismMain {

	ArrayList<LessTimidEnhancer> enhancers;
	Random random;
	
	public PolymorphismMain() {
		setupAllModifiers();
		random = new Random();
	}
	
	public void setupAllModifiers() {
		enhancers = new ArrayList<LessTimidEnhancer>();
		
		enhancers.add(new LessTimidAddCharacters("!!!!!"));
		enhancers.add(new LessTimidAddCharacters("OR ELSE"));
		enhancers.add(new LessTimidAddCharacters(", stinkybutt"));
		
		enhancers.add(new LessTimidReplace(" ", "_"));
		enhancers.add(new LessTimidReplace("?", "!!!"));
		enhancers.add(new LessTimidReplace(":)", ":-P"));
	
		enhancers.add(new LessTimidCapitializer());
	}
	
	public String applyRandomEnhancement(String input) {
		int numEnhancements = enhancers.size();
		int pick = random.nextInt(numEnhancements);
		System.out.println("I pick " + (pick + 1));
		return enhancers.get(pick).applyToString(input);
	}
	
	public void handleInput() {
		printDescriptions();
		Scanner in = new Scanner(System.in);
		System.out.println("\nWhat phrase would you like to enhance?");
		String phrase = in.nextLine();
		
		for(int i = 0; i < 3; i++) {
			phrase = applyRandomEnhancement(phrase);
		}
		System.out.println("\nLess timid suggests: ");
		System.out.println(phrase);
	}
	
	public void printDescriptions() {
		System.out.println("Welcome to less timid!\n");
		System.out.println("Currently installed enhancers: ");
		int currentNum = 1;
		for(LessTimidEnhancer each : enhancers) {
			System.out.print(currentNum + ". ");
			currentNum++;
			System.out.println(each.getDescription());
		}
	}
	
	public static void main(String[] args) {
		
		
		PolymorphismMain main = new PolymorphismMain();
		main.handleInput();

	}

}
