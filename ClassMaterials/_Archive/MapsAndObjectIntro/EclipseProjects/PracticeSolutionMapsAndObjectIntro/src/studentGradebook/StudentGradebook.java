package studentGradebook;

import java.util.HashMap;

public class StudentGradebook {
	private String name;
	private HashMap<String, Integer> grades;
	
	public StudentGradebook() {
		this("Studenty McStudenton");
	}
	
	public StudentGradebook(String name) {
		this.name = name;
		this.grades = new HashMap<String, Integer>();
	}
	
	public void addAssignment(String name, int grade) {
		grades.put(name, grade);
	}
	
	public void printGradeReport() {
		String toPrint = getGradeString();
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
		String toPrint = getGradeString();
		toPrint += " - Average: " + this.getAverageGrade();
		System.out.println(toPrint);
	}
	
	private String getGradeString() {
		String toReturn = this.name;
		for (String assignment : this.grades.keySet()) {
			toReturn += " " + assignment + " - " + this.grades.get(assignment);
		}
		return toReturn;
	}
}
