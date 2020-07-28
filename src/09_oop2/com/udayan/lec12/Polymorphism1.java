/**
 * Another example on Dynamic Polymorphism.
 * 
 * This example discusses the limitation of dynamic polymorphism.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec12;

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
	
	public void m2() {
		System.out.println("Child: m2()");
	}
}

public class Polymorphism1 {
	public static void main(String[] args) {
		Object obj1 = new Child();
		/*
		 As Object class reference has access to toString() and other methods of Object class only,
		 methods m1() and m2() cannot be invoked on Object class reference
		 even though instance is of Child class [has access to methods m1() and m2()]
		 */
		obj1.toString();
		//obj1.m1(); //Compilation error
		//obj1.m2(); //Compilation error
		
		Parent obj2 = new Child();
		/*
		 As Parent class reference has access to all the methods of Object class + m1() method of Parent class,
		 method m2() cannot be invoked on Parent class reference
		 even though instance is of Child class [has access to method m2()]
		 */
		obj2.toString();
		obj2.m1();
		//obj2.m2(); //Compilation error
		
		Child obj3 = new Child();
		/*
		 Child class reference has access to all the methods of Object class + m1() method of Parent class + m2() method of Child class.
		 */
		obj3.toString();
		obj3.m1();
		obj3.m2();
	}
}
