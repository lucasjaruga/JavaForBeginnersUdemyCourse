/**
 * This examples shows how Java handles exception using try-catch block.
 * In this example, try-catch block is used at the exception source.
 * 
 * Check Video Lecture 3 of Section 10 for details.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec03;

public class DivByZero {
	public static void main(String[] args) {
		method1();
		System.out.println("main ends.");
	}
	
	private static void method1() {
		int i = 0;
		try {
			System.out.println(23 / i);
		} catch(ArithmeticException ex) { //You can pass any super class of ArithmeticException as well, such as RuntimeException, Exception or Throwable but not Object
			System.out.println("Can't divide by zero");
			System.out.println(ex.getMessage());
			ex.printStackTrace();
			System.out.println(ex);
		}
	}
}
