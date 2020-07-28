/**
 * Class to test the visibility of the members of com.udayan.lec08_1.Parent class through INHERITANCE.
 * 
 * All the members declared with protected or default access specifiers are accessible to Sub class in the same package. 
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec08_1;

public class Child1 extends Parent {
	public Child1() {
		super(); //Invoking no-arg constructor of parent class
	}
	
	public void m2() {
		super.m1(); //Invoking method m1() of parent class
		System.out.println(super.var); //Accessing instance variable var of parent class
	}
}
