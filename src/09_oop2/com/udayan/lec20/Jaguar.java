/**
 * Class Jaguar extends Animal class but doesn't implement any interface.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec20;

public class Jaguar extends Animal {
	@Override
	public void eat() {
		System.out.println("Jaguar eats meat");
	}

	@Override
	public void sleep() {
		System.out.println("Jaguar sleeps in trees");
	}
}
