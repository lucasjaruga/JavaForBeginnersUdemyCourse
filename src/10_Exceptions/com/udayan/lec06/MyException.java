/**
 * MyException is a checked exception as it extends from Exception class.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec06;

public class MyException extends Exception {
	//no-arg constructor
	public MyException() { 
		super(); //Invoke the no-arg constructor of Exception class
	}
	
	public MyException(String s) { //String parameter to provide the cause / message
		super(s); //Invoke the parameterized constructor of Exception class, which takes String parameter
	}
	
	public MyException(Throwable t) { //Throwable parameter to pass on the cause and stack trace of original message
		super(t); //Invoke the parameterized constructor of Exception class, which takes Throwable parameter
	}
}
