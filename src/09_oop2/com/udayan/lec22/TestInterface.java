/**
 * Example to show that instance of an interface cannot be created.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec22;

public class TestInterface {

	public static void main(String[] args) {
		//I1 obj = new I1(); //Compilation error
		
		//instance of I1 is not created, in fact, below statement creates an instance of 
		//I1 [] type, which contains 3 elements and each element is of I1 type.
		I1 [] arr = new I1[3];
	}

}
	