/**
 * Test class to show that object of SubChild class has access to following:
 * 1. Visible methods of SubChild Class
 * 2. Visible methods of Child Class (immediate parent)
 * 3. Visible methods of Parent Class (grandparent)
 * 4. Visible methods of Object Class (Great grandparent)
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec07_2.test;

import com.udayan.lec07_2.SubChild;

public class Test {
	public static void main(String[] args) {
		SubChild obj = new SubChild();
		
		//Reference variable of SubChild class is used to access below methods:
		obj.m3(); //Method of SubChild class
		obj.m2(); //Method of Child class
		obj.m1(); //Method of Parent class
		obj.toString(); //Method of Object class
	}
}
