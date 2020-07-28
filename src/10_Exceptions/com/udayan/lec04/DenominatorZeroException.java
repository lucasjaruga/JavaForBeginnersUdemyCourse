/**
 * DenominatorZeroException is an unchecked exception as it extends from RuntimeException class.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec04;

public class DenominatorZeroException extends RuntimeException {
	//no-arg constructor
	public DenominatorZeroException() {
		super(); //Invoke the no-arg constructor of RuntimeException class
	}
	
	public DenominatorZeroException(String s) { //String parameter to provide the cause / message 
		super(s); //Invoke the parameterized constructor of RuntimeException class
	}
}
