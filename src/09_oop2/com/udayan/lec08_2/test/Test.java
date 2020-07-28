/**
 * Test class.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec08_2.test;

import com.udayan.lec08_2.Sub;

public class Test {
	public static void main(String[] args) {
		Sub sub = new Sub();
		sub.m1(); //Calls the inherited method m1() of Super class
		sub.m2(); //Calls the overriding method m2() of Sub class
	}
}
