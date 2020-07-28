/**
 * This is the test class for com.udayan.lecture14.Student.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lecture14;

public class TestStudent {
	public static void main(String[] args) {
		//Create a Student instance using parameterized constructor
		Student s1 = new Student("James", "Ross", 21);
		
		//Create a Student instance using parameterized constructor
		Student s2 = new Student("Edward", "Lee", 23);
		
		s1.printDetails();
		s2.printDetails();
	}
}
