/**
 * Constructors in case of INHERITANCE.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec06_2;

public class A {
	private int i; //private instance variable
	
	public A(int i) { //parameterized constructor
		System.out.println("In parameterized constructor of A");
		this.i = i;
	}

	public int getI() { //getter
		return i;
	}

	public void setI(int i) { //setter
		this.i = i;
	}
	
}
