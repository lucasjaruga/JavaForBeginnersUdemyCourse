/**
 * This example shows, it is perfectly legal for a method to declare the exception but not throw it.
 * Method m1() declares the checked Exception: IOException; but is is not throwing it.
 * 
 * Compiler works with the declaration of the method, it knows that this method m1() can throw checked exception. 
 * Hence it forces main() method to handle the Exception.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec06;

import java.io.IOException;

public class Example3 {
	public static void main(String[] args) {
		try {
			m1(); //Compiler forces to handle IOException (checked) as m1() declares it.
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//Method m1() declare IOException but it doesn't throw it.
	private static void m1() throws IOException {
		System.out.println("Inside method m1().");
	}
}
