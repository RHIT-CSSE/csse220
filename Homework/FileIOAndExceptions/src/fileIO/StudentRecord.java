package fileIO;

import java.util.HashMap;

/**
 * This is a class for tracking each individual student found in the main class.
 * It stores the first and last names of a student, the email and also an average
 * grade.  It is essentially a data class, but a rather good one to have.
 * 
 * 
 * @author Aaron Wilkin and other CSSE220 faculty
 *
 */
public class StudentRecord {
	private String firstname;
	private String lastname;
	private String email;
	private double average;
	
	public StudentRecord(String f, String l, String e) {
		this.firstname = f;
		this.lastname = l;
		this.email = e;
		this.average = 0.0;
	}
	
	public String getFirstName() {return this.firstname;}
	
	public String getLastName() {return this.lastname;}
	
	public String getEmail() {return this.email;}
	
	public double getAverage() {return this.average;}
	
	public void setAverage(double a) {this.average = a;}
	
	/**
	 * This method is a static method that takes a HashMap (from main) that maps file names 
	 * to student records and returns the specific record associated with the student that
	 * has firstname and lastname.
	 * 
	 * @param records - The HashMap of filenames to student records
	 * @param firstname - The first name of the student looking for
	 * @param lastname - The last name of the student looking for
	 * @return the student record for which the first and last names match
	 */
	public static StudentRecord getStudentRecord(HashMap<String, StudentRecord> records, String firstname, String lastname) {
		for(String key : records.keySet()) {
			StudentRecord cur = records.get(key);
			if(firstname.equals(cur.getFirstName()) && lastname.equals(cur.getLastName()))
				return cur;
		}
		return null;
	}
}
