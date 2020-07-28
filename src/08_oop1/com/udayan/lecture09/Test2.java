/**
 * This class uses calculateTotal(...) method of Exam class 
 * to calculate average temperature of three readings.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lecture09;

import com.udayan.lecture08.Exam;

public class Test2 {
	public static void main(String[] args) {
		int temp1 = 45;
		int temp2 = 51;
		int temp3 = 47;
		
		//Even though static methods can be invoked by using reference variable name
		//but it is a confusing syntax as static methods are not related to instances
		//Below code gives warning for calculateTotal(...) method not being called in
		//static way
		/*
		Exam e1 = new Exam(null, 0, 0, 0);
		int avgTemp = e1.calculateTotal(temp1, temp2, temp3) / 3;
		*/
		
		//Correct syntax to invoke static method of Exam class.
		int avgTemp = Exam.calculateTotal(temp1, temp2, temp3) / 3;
		System.out.println("Average temp is: " + avgTemp );
	}
}
