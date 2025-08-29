package lionstigersbears;

import java.util.ArrayList;
import java.util.Scanner;

public class LionsTigersBearsMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Animal> animals = new ArrayList<Animal>();
		
		while (true) {
			System.out.println("Which animal would you like (lion/tiger/bear)? (Or exit)");
			String command = input.nextLine();
			if (command.equals("exit")) {
				break;
			} else if (command.equals("lion")) {
				System.out.println("I love lions! I'll add one to our group.");
				animals.add(new Lion());
			} else if (command.equals("tiger")) {
				System.out.println("GGGRRReat choice! I'll add one to our group.");
				animals.add(new Tiger());
			} else if (command.equals("bear")) {
				System.out.println("Baloo it is! I'll add one to our group.");
				animals.add(new Bear());
			}
		}

		System.out.println("Hear our animals speak!");
		for (Animal animal : animals) {
			animal.speak();
		}
		input.close();
		
		
	}

}
