/**
 * This class was used to discuss abstract keyword. We covered following points:
 * 1. A class in Java can be declared abstract even if it doesn't have even a single abstract method.
 * 2. If a class has even one abstract method, then class must be abstract.
 * 3. Constructor of an abstract class cannot be invoked using new keyword but it is invoked by using super().
 * 4. If a subclass doesn't implement/override abstract method of superclass, then it must be declared as abstract.
 * 5. Implementing method must follow all the overriding rules.
 * 6. A method cannot be declared both: private & abstract, final & abstract and static & abstract.
 * 
 * For more details check Video Lecture No. 19 of Section 9.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec19;

abstract class A extends Object {
	public A() {
		super();
	}
	
	public abstract void m1();
}

abstract class B extends A {
	public B() {
		super();
	}
}

class C extends B {
	public C() {
		super();
	}
	
	public void m1() {
		System.out.println("C: m1");
	}
}

public class TestAbstraction {
	public static void main(String[] args) {
		//A [] arr = new A[5];
		A a1 = new C();
		a1.m1();
	}
}
