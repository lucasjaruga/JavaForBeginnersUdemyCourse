/**
 * Student class used to show working of STACK and HEAP memory.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lecture05;

public class Student {
	public String name; //Property for Student's name
	public int age; //Property for Student's age
	public int year; //Property for the year in which student enrolled
	public String univ = "Stanford University"; //"Stanford University" is assigned to university property
	
	/**
	 * No-arg constructor. Assigns 2016 to year property.
	 */
	public Student() {
		year = 2016; //Java compiler uses this.year
	}
	
	/**
	 * Parameterized Constructor.
	 * 
	 * @param studName name of the Student
	 * @param studAge age of the Student
	 */
	public Student(String studName, int studAge) {
		this(); //Call no-arg constructor
		name = studName; //Java compiler uses this.name
		age = studAge; //Java compiler uses this.age
	}
	
	/**
	 * This method prints name, age, year and univ values on to the Console.
	 */
	public void printDetails() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Year: " + year);
		System.out.println("University: " + univ);
	}
	
	/**
	 * Entry point of this class.
	 * 
	 * @param args for passing command-line arguments
	 */
	public static void main(String[] args) {
		Student s = new Student("Jack", 20);
		s.printDetails();
	}
}
