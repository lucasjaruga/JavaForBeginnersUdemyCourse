/**
 * Class1 implements I1 and overrides the abstract method m1.
 * It also overrides default method m2()
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec23;

public class Class1 implements I1 {
	@Override
	public void m1() {
		System.out.println("Class1: m1()");
	}
	
	@Override
	public void m2() {
		System.out.println("Class1: m2()");
	}
	
	public static void main(String[] args) {
		I1 obj = new Class1();
		obj.m1(); //Invokes overriding method m1 of Class1.
		
		//Case 1: if method m2() is not overridden, then method m2() of I1 is invoked.
		//Case 2; if method m2() is overridden, then overriding method m2() of Class1 is invoked.
		obj.m2();
	}
}
