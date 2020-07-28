/**
 * This class uses calculateTotal(...) method of Exam class to add three integers.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lecture09;

import com.udayan.lecture08.Exam;

public class Test1 {
	public static void main(String[] args) {
		//Even though static methods can be invoked by using reference variable name
		//but it is a confusing syntax as static methods are not related to instances
		//Below code gives warning for calculateTotal(...) method not being called in
		//static way
		/*
		Exam exam = new Exam("", 0, 0, 0);
		int i = exam.calculateTotal(107, 65, 32);
		*/
		
		//Correct syntax to invoke static method of Exam class.
		int i = Exam.calculateTotal(107, 65, 32);
		System.out.println(i);
	}
}
