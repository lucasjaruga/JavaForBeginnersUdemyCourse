/**
 * Constructors and Inheritance.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec06_1;

public class A {
	private int i; //private instance variable
	
	public A() { //no-arg constructor
		System.out.println("In no-arg constructor of A");
	}

	public int getI() { //getter
		return i;
	}

	public void setI(int i) { //setter
		this.i = i;
	}
	
}
