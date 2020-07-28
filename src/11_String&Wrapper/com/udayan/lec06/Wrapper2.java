/**
 * Boxing and Unboxing.
 * 
 * For details, watch video lecture 6 of Section 11.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec06;

public class Wrapper2 {
	public static void main(String[] args) {
		/* Pre JDK 5 */
		Integer y = new Integer(1234); // create the wrapper object
		
		int x = y.intValue(); // unwrap the primitive value
		x--; // decrement the value
		y = new Integer(x); // re-wrap the modified value
		
		System.out.println(y); // print the modified object
		
		
		/* JDK 5 onwards */
		Integer i = 1234; // create the wrapper object (without constructor or valueOf method)
		
		i--; // unwrap, decrement, re-wrap
		
		System.out.println(i); // print the modified object.
		
        

	}
}
