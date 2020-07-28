/**
 * This is the test class for com.udayan.lec01_1.Student class.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec01_1.test;

import com.udayan.lec01_1.Student;

public class TestStudent {
	public static void main(String[] args) {
		//Case 1:
		Student s1 = new Student(1001, "John", 25); //No issues over here as age >= 18 and age <= 40
		s1.printDetails();
		
		//Case 2: Below code tries to set age to out of range value and program terminates
		//Student s2 = new Student(1002, "Jack", 45);
		//s2.printDetails();
		
		//Case 3: Create Student object with valid age and then later change the age property.
		Student s3 = new Student(1003, "Joe", 25); //No issues over here as age >= 18 and age <= 40
		s3.age = 200; //Directly setting age property, bypassing age range check.
		s3.printDetails();
	}
}
