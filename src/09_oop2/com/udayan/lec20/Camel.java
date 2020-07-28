/**
 * Class Camel extends Animal class and implements two interfaces: Sellable and Rideable.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec20;

public class Camel extends Animal implements Sellable, Rideable {
	@Override
	public void eat() {
		System.out.println("Camel eats plants");
	}

	@Override
	public void sleep() {
		System.out.println("Camel sleeps by laying down on Stomach");
	}

	@Override
	public double getPrice() {
		return 200000;
	}

	@Override
	public void addRider(String name) {
		System.out.println(name + " is riding a camel.");
	}
}
