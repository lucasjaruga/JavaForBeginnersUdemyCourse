/**
 * Class to test the behaviors of classes A and B.
 * 
 * As B extends A, hence B class inherits the visible methods of A class.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec03.test;

import com.udayan.lec03.A;
import com.udayan.lec03.B;

public class TestA_B {
	public static void main(String[] args) {
		A a = new A(); //Create an instance of A class
		a.setValue(5); //Invoke the method of A's instance
		System.out.println("a.getValue() = " + a.getValue()); //Invoke the method of A's instance
		
		B b = new B(); //Create an instance of B class
		b.setValue(77); //Invoke the inherited method of B's instance
		System.out.println("b.getValue() = " + b.getValue()); //Invoke the inherited method of B's instance
	}
}
