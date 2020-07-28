/**
 * In this class we are using try-catch block during method invocation.
 * 
 * Check Video Lecture 3 of Section 10 for details.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec03;

public class TestCalculator {
	public static void main(String[] args) {
		int num = 100;
		int den = 0;
		try {
			int result = Calculator.divide(num, den);
			System.out.println(result);
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
}
