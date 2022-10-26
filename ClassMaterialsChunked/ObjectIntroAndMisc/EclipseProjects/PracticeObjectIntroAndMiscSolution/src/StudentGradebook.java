import java.util.HashMap;

public class StudentGradebook {
	private String name;
	private HashMap<String, Integer> nameToGradeMap;
	
	public StudentGradebook() {
		this("Studenty McStudenton");
	}
	
	public StudentGradebook(String name) {
		this.name = name;
		this.nameToGradeMap = new HashMap<String, Integer>();
	}
	
	public void addAssignment(String name, int grade) {
		nameToGradeMap.put(name, grade);
	}
	
	public void printGradeReport() {
		String toPrint = this.name;
		for (String assignment : nameToGradeMap.keySet()) {
			toPrint += " " + assignment + " - " + this.nameToGradeMap.get(assignment);
		}
		System.out.println(toPrint);
		
	}
	
	public double getAverageGrade(){
		double totalNumber = this.nameToGradeMap.size();
		double total = 0;
		for (String assignment : nameToGradeMap.keySet()) {
			total += this.nameToGradeMap.get(assignment);
		}
		return total / totalNumber;
	}
	
	//Added to test getAverageGrade
	public void printGradeReportWithAverage() {
		String toPrint = this.name;
		for (String assignment : nameToGradeMap.keySet()) {
			toPrint += " " + assignment + " - " + this.nameToGradeMap.get(assignment);
		}
		toPrint += " - Average: " + this.getAverageGrade();
		System.out.println(toPrint);
		
	}
}
