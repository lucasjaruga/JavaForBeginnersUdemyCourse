/**
 * Class Rabbit extends Animal class and implements Sellable interface.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec20;

public class Rabbit extends Animal implements Sellable {
	@Override
	public void eat() {
		System.out.println("Rabbit eats carrots");
	}

	@Override
	public void sleep() {
		System.out.println("Rabbit sleeps underground in burrow");
	}
	
	@Override
	public double getPrice() {
		return 5000;
	}
}
