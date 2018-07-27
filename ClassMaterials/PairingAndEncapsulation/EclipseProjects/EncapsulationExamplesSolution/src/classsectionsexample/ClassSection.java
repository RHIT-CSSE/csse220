package classsectionsexample;

import java.util.ArrayList;

/**
 * 
 * Small class that represents a single section of a course
 *
 * @author hewner.
 *         Created Dec 27, 2013.
 */
public class ClassSection {

	@SuppressWarnings("unused")
	//In this case we don't use sectionnum, but if the example was
	//a bit less simplistic you probably would
	private int sectionNum;
	private ArrayList<String> students;
	
	/**
	 * 
	 * Creates a new section with the given number
	 *
	 * @param sectionNum
	 */
	public ClassSection(int sectionNum) {
		this.sectionNum = sectionNum;
		this.students = new ArrayList<String>();
	}

	/**
	 * 
	 * Adds a student's name to the class section
	 *
	 * @param name
	 */
	public void addStudent(String name) {
		this.students.add(name);
	}
	
	/**
	 * 
	 * Returns the student in the section with the longest name
	 *
	 * @return student with the longest name
	 */
	public String getStudentWithLongestName() {
		String longestName = "";
		for(String name : this.students) {
			if(name.length() > longestName.length()) {
				longestName = name;
			}
		}
		return longestName;
	}

}
