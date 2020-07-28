/**
 * All four access modifiers can be applied to the members (variables, constructors and methods) of the class.
 * We had already covered public, default and private in second lecture of this section.
 * 
 * I am covering protected vs. default in this example.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec08_1;

public class Parent {
	
	protected String var = "HELLO"; //instance variable
	
	protected Parent() { //Constructor
		System.out.println("Inside constructor.");
	}
	
	protected void m1() { //instance method
		System.out.println("Inside method m1()");
	}
	
}
