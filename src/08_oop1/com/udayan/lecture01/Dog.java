/**
 * Dog class.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lecture01;

public class Dog {
	public String name; //name property
	public int age; //age property
	public String breed; //breed property
	public String color; //color property
	
	/**
	 * This method prints "dog_name is barking." on to the console.
	 */
	public void bark() {
		System.out.println(name + " is barking.");
	}
	
	/**
	 * This method prints "dog_name is eating." on to the console.
	 */
	public void eat() {
		System.out.println(name + " is eating.");
	}
	
	/**
	 * This method prints "dog_name is wagging tail." on to the console.
	 */
	public void wagTail() {
		System.out.println(name + " is wagging tail.");
	}
}
