/**
 * Dog class.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lecture02;

public class Dog {
	public String name;
	public int age;
	public String breed;
	public String color;
	
	/**
	 * No argument Constructor.
	 */
	public Dog() {
		System.out.println("Inside Dog() Constructor."); 
		name = "Hunter";
		age = 5;
		breed = "Bulldog";
		color = "Brown";
	}
	
	/**
	 * Parameterized Constructor.
	 * 
	 * @param dogName name of the dog
	 * @param dogAge age of the dog
	 * @param dogBreed breed of the dog
	 * @param dogColor color of the dog
	 */
	public Dog(String dogName, int dogAge, String dogBreed, String dogColor){
		name = dogName;
		age = dogAge;
		breed = dogBreed;
		color = dogColor;
	}
	
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
