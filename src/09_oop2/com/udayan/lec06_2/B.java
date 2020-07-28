/**
 * Constructors in case of INHERITANCE.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec06_2;

public class B extends A {
	//Default constructor added by Java compiler
	/*public B() {
		super(); //calling Parent class's no-arg constructor, which is not available. Hence, compilation error.
	}*/
	
	//no-arg constructor
	public B() {
		super(-1); //Calling Parent class's parameterized constructor, which is available.
	}
	
}
