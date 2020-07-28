/**
 * I1 is a functional interface as it contains only one abstract method.
 * We discussed following points:
 * 1. interfaces are implicitly abstract
 * 2. methods without curly brackets are by default public and abstract
 * 3. all the interface variables are by default public, static and final
 * 4. An interface cannot contain constructor or initialization blocks
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec22;

@FunctionalInterface
public interface I1 {
	int i = 100; //public static final
	void m1(); //public abstract
	
	//public I1() {} //Interface cannot have constructors
	
	//interface cannot have initializers
	/*
	{
		System.out.println("instance initialization block");
	}
	
	static {
		System.out.println("static initialization block");
	}
	*/
}
