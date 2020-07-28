/**
 * NegativeNumberException is a checked exception as it extends from Exception class.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec04;

public class NegativeNumberException extends Exception {
	//no-arg constructor
	public NegativeNumberException() {
		super(); //Invoke the no-arg constructor of Exception class
	}
	
	public NegativeNumberException(String s) { //String parameter to provide the cause / message 
		super(s); //Invoke the parameterized constructor of Exception class
	}
}
