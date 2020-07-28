/**
 * This is the test class for com.udayan.lecture03_01.Student.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lecture03_01;

public class StudentTest {
	public static void main(String[] args) {
		//Create a Student instance using no-arg constructor
		Student s = new Student();
		System.out.println(s.name + " studies at " + s.university);
		//TODO: Calling no-arg constructor should not be allowed as it assigns
		//value to university field only. Other properties are initialized to their
		//default values, which is not acceptable. 
		//We will resolve this issue in next Section.
		
		//Create a Student instance using parameterized constructor
		Student stud1 = new Student("John", 18, 'M', "Java", 2016);
		System.out.println(stud1.name + " studies at " + stud1.university);
		stud1.attendLecture();
		
		System.out.println("----------------------------------------");
		
		//Create a Student instance using parameterized constructor
		Student stud2 = new Student("Jack", 17, 'M', "DBA", 2016);
		System.out.println(stud2.name + " studies at " + stud2.university);
		stud2.attendLab();
		
		System.out.println("----------------------------------------");
		
		//Create a Student instance using parameterized constructor
		Student stud3 = new Student("Lucy", 18, 'F', "SQL", 2016);
		System.out.println(stud3.name + " studies at " + stud3.university);
		stud3.submitAssignment();
	}
}
