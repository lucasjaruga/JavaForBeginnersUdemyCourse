/**
 * This is the test class to create various objects of com.udayan.lecture02.Dog.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lecture02;

public class DogTest2 {
	public static void main(String[] args) {
		//Create a Dog instance using no-arg constructor
		Dog d1 = new Dog();
		d1.name = "Bubbly"; //Assign Bubbly to name property of d1
		d1.age = 10; //Assign 10 to age property of d1
		d1.breed = "Poodle"; //Assign "Poodle" to breed property of d1
		d1.color = "White"; //Assign "White" to color property of d1
		
		d1.eat(); //Call eat() method on d1
		
		//Get d1's name, age, breed and color
		System.out.println(d1.name + " : " + d1.age + " : " + d1.breed + " : " + d1.color);
		
		//Create a Dog instance using no-arg constructor
		Dog d2 = new Dog();
		d2.eat(); //Call eat() method on d2
		
		//Get d2's name, age, breed and color
		System.out.println(d2.name + " : " + d2.age + " : " + d2.breed + " : " + d2.color);
		
		//Create a Dog instance using parameterized constructor
		Dog d3 = new Dog("Rusty", 5, "Golden Retriever", "Dark Golden");
		
		//Get d3's name, age, breed and color
		System.out.println(d3.name + " : " + d3.age + " : " + d3.breed + " : " + d3.color);
	}
}
