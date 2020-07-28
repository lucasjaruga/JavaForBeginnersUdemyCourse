/**
 * Class to test the visibility of the members of com.udayan.lec08_1.Parent class through INHERITANCE.
 * 
 * All the members declared with protected modifier are accessible to Sub class in different package.
 * All the members declared with default modifier are NOT accessible to Sub class in different package.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec08_1_1;

import com.udayan.lec08_1.Parent;

public class Child2 extends Parent {
	public Child2() {
		super(); //Invoking no-arg constructor of parent class
	}
	
	public void m2() {
		super.m1(); //Invoking method m1() of parent class
		System.out.println(super.var); //Accessing instance variable var of parent class
	}
}
