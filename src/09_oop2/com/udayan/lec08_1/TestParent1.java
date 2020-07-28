/**
 * Class to test the visibility of the members of com.udayan.lec08_1.Parent class through instances.
 * 
 * All the members declared with protected or default access specifiers are accessible to other classes within the same package. 
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec08_1;

public class TestParent1 {
	public static void main(String[] args) {
		Parent p1 = new Parent(); //Calling no-arg constructor of Parent class
		p1.m1(); //Calling method m1() of Parent class
		System.out.println(p1.var); //Calling instance variable var of Parent class
	}
}
