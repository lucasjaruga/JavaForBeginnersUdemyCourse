/**
 * This class isn't encapsulated at all, because all the properties / attributes
 * are declared as public. Which means classes outside this package can
 * get/set the values of these properties directly.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec01_1;

public class Student {
	public int id; //instance variable with public access modifier
	public String name; //instance variable with public access modifier
	public int age; //instance variable with public access modifier
	
	/**
	 * Parameterized constructor.
	 * 
	 * @param id id of the student
	 * @param name name of the student
	 * @param age age of the student
	 */
	public Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		//Allowed age is between 18 and 40
		if(age >= 18 && age <= 40) {
			this.age = age;
		} else {
			System.out.println("Age should be between 18 and 40 only.");
			System.out.println("Exiting the program...");
			System.exit(-1); //a nonzero status code argument indicates abnormal termination.
		}
	}
	
	/**
	 * Prints all the properties of Student object.
	 */
	public void printDetails() {
		System.out.println("Student Details: id = " + id + ", name = " + name + ", age = " + age);
	}
}
