/**
 * Class Horse extends Animal class and implements two interfaces: Sellable and Rideable.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec20;

public class Horse extends Animal implements Sellable, Rideable {
	@Override
	public void eat() {
		System.out.println("Horse eats hay");
	}

	@Override
	public void sleep() {
		System.out.println("Horse sleeps standing up");
	}
	
	@Override
	public double getPrice() {
		return 150000;
	}
	
	@Override
	public void addRider(String name) {
		System.out.println(name + " is riding a horse.");
	}
}
