/**
 * In JDK 8.0, default methods were added in Java interface.
 * 
 * This feature allows to add a new method in interface without breaking implementer classes.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec23;

public interface I1 {
	void m1(); //public abstract
	
	default void m2() { //public 
		System.out.println("I1: m2()");
	}
}
