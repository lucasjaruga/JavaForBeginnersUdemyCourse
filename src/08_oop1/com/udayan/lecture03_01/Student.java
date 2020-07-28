/**
 * Shows the example of calling one constructor from another.
 * 
 * No-arg constructor assigns "Stanford University" to university property / field.
 * Parameterized constructor calls no-arg constructor using this().
 * 
 * @author Udayan Khattry
 */
package com.udayan.lecture03_01;

public class Student {
	public String name; //Property for Student's name
	public int age; //Property for Student's age
	public char gender; //Property for Student's gender
	public String course; //Property for Student's course
	public int year; //Property for the year in which student enrolled
	public String university; //Property for Student's university
	
	/**
	 * No-argument constructor.
	 * This constructor assigns "Stanford University" to university field.
	 * 
	 * NOTE: Constructor added by Java Compiler is also no-arg constructor 
	 * and known as default constructor. But below no-arg constructor is provided by us
	 * and hence is not a default constructor.
	 */
	public Student() {
		university = "Stanford University";
	}
	
	/**
	 * Parameterized Constructor.
	 * This constructor calls no-arg constructor, which assigns "Stanford University" to university field.
	 * 
	 * @param studName name of the Student
	 * @param studAge age of the Student
	 * @param studGender gender of the Student
	 * @param studCourse course for which this student is enrolled
	 * @param studYear Year in YYYY format.
	 */
	public Student(String studName, int studAge, char studGender, String studCourse, int studYear) {
		this(); //Call to another constructor must be the first statement
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
