/**
 * Default exception handler provided by Java runtime handles exceptional event as follows:
 * 1. Prints out Exception Description on to the Console
 * 2. Prints the stack trace on to the Console
 * 3. Terminates the program
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec01;

public class DivByZero {
	public static void main(String[] args) {
		method1(); //Line 13
		System.out.println("main ends.");
	}
	
	private static void method1() {
		int i = 0;
		System.out.println(23 / i); //Line 19
	}
}

/*
OUTPUT:
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at com.udayan.lec01.DivByZero.method1(DivByZero.java:19)
	at com.udayan.lec01.DivByZero.main(DivByZero.java:13)
*/
