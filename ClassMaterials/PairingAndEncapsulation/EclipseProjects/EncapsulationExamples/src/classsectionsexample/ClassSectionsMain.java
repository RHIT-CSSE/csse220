package classsectionsexample;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 
 * Example for showing how to read input and make objects for a map.
 *
 * @author hewner.
 *         Created Dec 27, 2013.
 */
public class ClassSectionsMain {

	/**
	 * 
	 * Prints student with the longest name, per class section
	 * 
	 * @param args not used
	 */
	public static void main(String[] args) {
		
		HashMap<Integer, ClassSection> map = new HashMap<Integer,ClassSection>();
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.println("Enter student's name (or exit to quit).");
			String name = input.nextLine().trim();
			if(name.equals("exit")) {
				break;
			}
			System.out.println("What section should I add the student to?");
			int sectionNum = input.nextInt();
			//removes the enter
			input.nextLine();
			
			// Your code goes here
			if(map.containsKey(sectionNum)) {
				map.get(sectionNum).addStudent(name);
			} else {
				ClassSection section = new ClassSection(sectionNum);
				map.put(sectionNum, section);
				section.addStudent(name);
			}		
		}
		
		input.close();
		
		System.out.println("Students with the longest names:");
		for(int section : map.keySet()) {
			System.out.println("Section " + section + ": " + map.get(section).getStudentWithLongestName());
		}
	}
}
