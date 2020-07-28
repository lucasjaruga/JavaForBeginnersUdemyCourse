/**
 * This is the test class for com.udayan.lec01_2.Student class.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec01_2.test;

import com.udayan.lec01_2.Student;

public class TestStudent {
	public static void main(String[] args) {
		Student s1 = new Student(1001, "John", 25);
		s1.setAge(35); //age property can only be changed by using setAge(int) method
		
		s1.printDetails();

		if(s1.getAge() == 25) { //age property's value can only be accessed by using getAge() method
			System.out.println("25% off on Java Course.");
		}
	}
}
