/**
 * Effects of INHERITANCE on constructors and initialization blocks.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec06_3;

public class A {
	
	public A() { //no-arg constructor
		System.out.println("no-arg constructor of A");
	}
	
	static { //static initialization block
		System.out.println("static initialization block of A");
	}
	
	{ //instance initialization block
		System.out.println("instance initialization block of A");
	}
	
}
