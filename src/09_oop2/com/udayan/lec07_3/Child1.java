/**
 * Example to show hierarchical inheritance.
 * Class Child1 extends from Parent class.
 * Child1 class has a subclass: GrandChild
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec07_3;

public class Child1 extends Parent {
	@Override
	public void m1() {
		System.out.println("Child1 overrides m1()");
	}
}
