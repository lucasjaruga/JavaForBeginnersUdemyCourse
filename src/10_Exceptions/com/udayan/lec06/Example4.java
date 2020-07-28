/**
 * Example on re-throwing the exception.
 * Check Video Lecture 6 of Section 10 for details.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec06;

public class Example4 {
	public static void main(String[] args) {
		try {
			m1();
		} catch (MyException e) {
			e.printStackTrace();
		}
		System.out.println("Main ends.");
	}
	
	private static void m1() throws MyException { //As this method throws checked exception(MyException), hence throws clause is compulsory.
		try {
			m2();
		} catch(ArithmeticException ex) {
			System.out.println(ex);
			MyException exp = new MyException(ex);
			throw exp; //Forwards MyException object, which wraps ArithmeticException object
			//throw ex; //Forwards the same exception object
		}
	}
	
	private static void m2() {
		System.out.println(1/0); //throws ArithmeticException
	}
}
