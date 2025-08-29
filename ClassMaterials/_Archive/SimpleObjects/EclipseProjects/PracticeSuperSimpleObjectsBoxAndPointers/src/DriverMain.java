
/**
 * Class: DriverMain
 * @author CSSE Faculty
 * <br>Purpose: Driver program for Written Exam 1 Question 2 Box & Pointers 
 */
public class DriverMain {
	
	// TODO #1
	// Hand trace operation Q2Part1 and draw the box & pointers diagram for 
	// all the local variables declared in Q2Part1
	//
	// Run this app and verify that your box & pointers diagram matches the output for Part 1
	// 
	// Compare your diagram against the file E1BoxPtrsPart1.png (included in this Eclipse project)
	
	private void Q2Part1() {
		Student s1 = new Student("John", "john@rose.edu", 1);
		s1.setYear(2);
		s1.setName("Jonny");
		
		System.out.println("Question #2 Part #1");
		System.out.println("s1: " + s1.toString());	
		System.out.println();
	} // Q2Part1
	
	// TODO #2
	// Hand trace operation Q2Part2 and draw the box & pointers diagram for 
	// all the local variables declared in Q2Part2
	//
	// Run this app and verify that your box & pointers diagram matches the output for Part 2
	// 
	// Compare your diagram against the file E1BoxPtrsPart2.png (included in this Eclipse project)
	
	private void Q2Part2() {
		Student s2 = new Student("Amy", "amy@mail.com", 3);
		ProjTeam team1 = new ProjTeam("Scorpions", 3);
		team1.addMember(s2);
		team1.addMember(s2);
		team1.addMember(s2);
		s2.setYear(4);
		s2.setName("Amieee");
		s2 = new Student("Tommy", "t@rt.com", 2);
		
		System.out.println("Question #2 Part #2");
		System.out.println("team1: " + team1.toString());
		System.out.println();
	} // Q2Part2
	
	// TODO #3
	// Hand trace operation Q2Part3 and draw the box & pointers diagram for 
	// all the local variables declared in Q2Part3
	//
	// Run this app and verify that your box & pointers diagram matches the output for Part 3
	// 
	// Compare your diagram against the file E1BoxPtrsPart3.png (included in this Eclipse project)
	
	private void Q2Part3() {
		String[] names = {"Jim", "Pat", "Susy"};
		Student s3 = new Student(names[0], names[1], 1);
		Student s4 = s3;
		for (int i = 0; i < names.length; i++) {
			s3.setName(names[i]);
		} // end for
		names[2] = "Jen";
		ProjTeam team2 = new ProjTeam(names[2], 2);
		team2.addMember(s3);
		team2.addMember(s4);
		s4.setName("Sam");		
		
		System.out.println("Question #2 Part #1");
		System.out.println("team2: " + team2.toString());
		System.out.println();
	} // Q2Part3
	
	private void runApp() {
		this.Q2Part1();
		this.Q2Part2();
		this.Q2Part3();
	} // runApp
	
	public static void main(String[] args) {
		DriverMain app = new DriverMain();
		app.runApp();
	} // main

}
