/**
 * Shows the example of assigning values to class variables during declaration.
 * Over here "Stanford University" is assigned to university property / field.
 * All the objects of this class will have "Stanford University" in their university field.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lecture03_02;

public class Student {
	public String name; //Property for Student's name
	public int age; //Property for Student's age
	public char gender; //Property for Student's gender
	public String course; //Property for Student's course
	public int year; //Property for the year in which student enrolled
	//"Stanford University" is assigned to university property
	public String university = "Stanford University";
	
	/**
	 * Constructor.
	 * 
	 * @param studName name of the Student
	 * @param studAge age of the Student
	 * @param studGender gender of the Student
	 * @param studCourse course for which this student is enrolled
	 * @param studYear Year in YYYY format.
	 */
	public Student(String studName, int studAge, char studGender, String studCourse, int studYear) {
		name = studName;
		age = studAge;
		gender = studGender;
		course = studCourse;
		year = studYear;
	}
	
	/**
	 * This method prints [name] is attending [course] lecture.
	 * [name] and [course] are replaced with field values at runtime.
	 */
	public void attendLecture() {
		System.out.println(name + " is attending " + course + " lecture.");
	}
	
	/**
	 * This method prints [name] is submitting [course] assignment.
	 * [name] and [course] are replaced with field values at runtime.
	 */
	public void submitAssignment() {
		System.out.println(name + " is submitting " + course + " assignment.");
	}
	
	/**
	 * This method prints [name] is attending [course] lab.
	 * [name] and [course] are replaced with field values at runtime.
	 */
	public void attendLab() {
		System.out.println(name + " is attending " + course + " lab.");
	}
}
