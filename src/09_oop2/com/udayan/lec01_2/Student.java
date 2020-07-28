/**
 * An example of encapsulated class where all the instance variables are private and 
 * are exposed only through getters and setters.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec01_2;

public class Student {
	private int id; //instance variable with private access modifier
	private String name; //instance variable with private access modifier
	private int age; //instance variable with private access modifier
	
	/**
	 * Returns age of the Student.
	 * 
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	
	/**
	 * Sets the age property to passed age.
	 * 
	 * @param age the age to set
	 */
	public void setAge(int age) {
		checkAndChangeAge(age);
	}
	
	/**
	 * Returns id of the Student.
	 * 
	 * @return the id of the Student
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets the id property to passed id.
	 * 
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Returns name of the Student.
	 * 
	 * @return the name of the Student
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name property to passed name.
	 * 
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Parameterized Constructor.
	 * 
	 * @param id the id to set
	 * @param name the name to set
	 * @param age the age to set
	 */
	public Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		checkAndChangeAge(age);
	}
	
	/**
	 * This method only sets the age property to passed value 
	 * if and only if the value is within specified range.
	 * 
	 * @param age the age to set
	 */
	private void checkAndChangeAge(int age) {
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
