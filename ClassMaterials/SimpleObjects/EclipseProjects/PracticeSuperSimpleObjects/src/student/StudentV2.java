package student;

public class StudentV2 {
	private String name;
	private static char grade;

	public StudentV2(String name, char grade) {
		this.name = name;
		StudentV2.grade = grade;
	} // StudentV2

	@Override
	public String toString() {
		return this.name + " has grade of " + StudentV2.grade;
	} // toString
	
} // end class StudentV2
