/**
 * final methods cannot be overridden by sub classes.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec08_2;

public class Sub extends Super {
	
	//final method is inherited but not overridden by sub class
//	public final void m1() {
//		System.out.println("Sub: m1");
//	}
	
	//non-final method is overridden by sub class
	public void m2() {
		System.out.println("Sub: m2");
	}
}
