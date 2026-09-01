package student;

public class StudentV1 {
	private String name;
	private char grade;

	public StudentV1(String name, char grade) {
		this.name = name;
		this.grade = grade;
	} // StudentV1

	@Override
	public String toString() {
		return "[name=" + name + ", grade=" + grade + "]";
	}



} // end class StudentV1