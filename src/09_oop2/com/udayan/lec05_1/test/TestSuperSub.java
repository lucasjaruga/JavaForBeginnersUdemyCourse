/**
 * Class to test the behaviors of classes Super and Sub.
 * 
 * As Sub extends Super, hence Sub class inherits the visible instance variables and methods of Super class.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec05_1.test;

import com.udayan.lec05_1.Sub;

public class TestSuperSub {
	public static void main(String[] args) {
		
		Sub s = new Sub(); //Create an object of Sub class
		//Case 1: if variable x is not available in Sub class, then variable of Super class is accessed
		//Case 2: if variable x is available in Sub class, then variable of Sub class is accessed
		System.out.println("Value of x before increment: " + s.x); //Access variable x on Sub class reference
		
		s.increment(); //Invoke the inherited method of Super class, which increments the variable x of Super class only.
		
		//Case 1: if variable x is not available in Sub class, then variable of Super class is accessed
		//Case 2: if variable x is available in Sub class, then variable of Sub class is accessed
		System.out.println("Value of x after increment: " + s.x);
		
		System.out.println(s.getSuperX()); //Invoke instance method of Sub class, which returns the instance variable x of Super class
		
	}
}
