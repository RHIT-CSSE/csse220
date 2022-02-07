import java.util.HashMap;

public class StudentAssignments {
	private String name;
	private HashMap<String, Integer> grades;
	
	public StudentAssignments() {
		this("Studenty McStudenton");
	}
	
	public StudentAssignments(String name) {
		this.name = name;
		this.grades = new HashMap<String, Integer>();
	}
	
	public void addAssignment(String name, int grade) {
		grades.put(name, grade);
	}
	
	public void printGradeReport() {
		String toPrint = this.name;
		for (String assignment : grades.keySet()) {
			toPrint += " " + assignment + " - " + this.grades.get(assignment);
		}
		System.out.println(toPrint);
		
	}
	
	public double getAverageGrade(){
		double totalNumber = this.grades.size();
		double total = 0;
		for (String assignment : grades.keySet()) {
			total += this.grades.get(assignment);
		}
		return total / totalNumber;
	}
	
	//Added to test getAverageGrade
	public void printGradeReportWithAverage() {
		String toPrint = this.name;
		for (String assignment : grades.keySet()) {
			toPrint += " " + assignment + " - " + this.grades.get(assignment);
		}
		toPrint += " - Average: " + this.getAverageGrade();
		System.out.println(toPrint);
		
	}
}
