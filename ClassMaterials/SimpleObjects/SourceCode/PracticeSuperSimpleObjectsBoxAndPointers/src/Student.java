
public class Student {
	private String name;
	private String email;
	private int year;
	
	public Student(String name, String email, int year) {
		this.name = name;
		this.email = email;
		this.year = year;
	}
	

	public void setYear(int year) {
		this.year = year;
	}
	

	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "(" + name + "," + email + "," + year + ")";
	}
}
