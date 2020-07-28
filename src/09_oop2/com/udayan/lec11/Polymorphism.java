/**
 * An example of Dynamic Polymorphism.
 * A reference variable of parent/super/base class can refer to instance variable of
 * child/sub/derived class.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec11;

class Parent {
	public void m1() {
		System.out.println("Parent: m1()");
	}
}

class Child extends Parent {
	@Override
	public void m1() {
		System.out.println("Child: m1()");
	}
}

public class Polymorphism {
	public static void main(String[] args) {
		Parent obj1 = new Parent();
		obj1.m1();
		
		Child obj2 = new Child();
		obj2.m1();
		
		obj1 = obj2; //Parent class reference variable referring to an instance of Child class
		//Compiler checks whether m1() is defined in Parent class or not.
		//But at runtime overriding method of Child class is invoked.
		obj1.m1();
	}
}
