/**
 * Example to show 3 types of variables:
 * Class variables or static variables
 * Instance variable or non-static variable
 * Local variable or Automatic variable
 * 
 * @author Udayan Khattry
 */
package com.udayan.lecture14;

public class Student {
	/* fName, lName and age are instance variables. */
	public String fName; //Property for Student's first name
	public String lName; //Property for Student's last name/family name
	public int age; //Property for Student's age
	
	/* univ is a class variable. */
	public static String univ = "Stanford University"; //"Stanford University" is assigned to univ property
	
	/**
	 * Parameterized Constructor.
	 * 
	 * @param firstName first name of the Student
	 * @param lastName last name of the Student
	 * @param studAge age of the Student
	 */
	public Student(String firstName, String lastName, int studAge) {
		/* Parameter variables firstName, lastName and studAge are local variables. */
		/* fName, lName and age are instance variables. */
		fName = firstName;
		lName = lastName;
		age = studAge;
	}
	
	/**
	 * This method prints name, age, year and univ values on to the Console.
	 */
	public void printDetails() {
		/* name is a local variable. */ 
		String name = lName + ", " + fName;
		System.out.println("Name: " + name); //can't use this.name here, as name is a local variable
		System.out.println("Age: " + age); //this.age, all instance variables are accessed by using keyword this.
		System.out.println("University: " + univ); //Student.univ, all class variables are accessed by using class name.
	}
}
