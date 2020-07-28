/**
 * Interface I2 containing a default method and a static method.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec23;

public interface I2 {
	default void m2() { //public 
		System.out.println("I2: m2()");
		m3(); //calling static interface method using shorthand notation
	}
	
	static void m3() { //public
		System.out.println("I2: m3()");
	}
}
