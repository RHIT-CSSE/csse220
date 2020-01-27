import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Look at the computer part documentation to see what to do here.
 */
public class PolymorphismMain {

	ArrayList<LessTimidAddCharacters> adders;
	ArrayList<LessTimidReplace> replacers;
	ArrayList<LessTimidCapitializer> capitalizers;
	Random random;
	
	public PolymorphismMain() {
		setupAllModifiers();
		random = new Random();
	}
	
	public void setupAllModifiers() {
		adders = new ArrayList<LessTimidAddCharacters>();
		replacers = new ArrayList<LessTimidReplace>();
		capitalizers = new ArrayList<LessTimidCapitializer>();
		
		adders.add(new LessTimidAddCharacters("!!!!!"));
		adders.add(new LessTimidAddCharacters("OR ELSE"));
		adders.add(new LessTimidAddCharacters(", stinkybutt"));
		
		replacers.add(new LessTimidReplace(" ", "_"));
		replacers.add(new LessTimidReplace("?", "!!!"));
		replacers.add(new LessTimidReplace(":)", ":-P"));
	
		capitalizers.add(new LessTimidCapitializer());
	}
	
	public String applyRandomEnhancement(String input) {
		int numEnhancements = adders.size() + replacers.size() + capitalizers.size();
		int pick = random.nextInt(numEnhancements);
		if(pick < adders.size()) {
			return adders.get(pick).applyToString(input);
		}
		pick -= adders.size();
		if(pick < replacers.size()) {
			return replacers.get(pick).applyToString(input);
		}
		pick -= replacers.size();
		return capitalizers.get(pick).applyToString(input);
		
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
		for(LessTimidAddCharacters adder : adders) {
			System.out.print(currentNum + ". ");
			currentNum++;
			System.out.println(adder.getDescription());
		}
		for(LessTimidReplace replace : replacers) {
			System.out.print(currentNum + ". ");
			currentNum++;
			System.out.println(replace.getDescription());
		}
		for(LessTimidCapitializer capitializer : capitalizers) {
			System.out.print(currentNum + ". ");
			currentNum++;
			System.out.println(capitializer.getDescription());
		}
	}
	
	public static void main(String[] args) {
		
		
		PolymorphismMain main = new PolymorphismMain();
		main.handleInput();

	}

}
