/**
 * This is the test class to create various objects of com.udayan.lecture01.Dog.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lecture01;

public class DogTest1 {
	public static void main(String[] args) {
		//Create a dog object, referenced by dog1
		Dog dog1 = new Dog(); 
		dog1.name = "Bubbly"; //Set dog1's name property to Bubbly
		dog1.age = 10; //Set dog1's age to 10
		dog1.breed = "Poodle"; //Set dog1's breed to Poodle
		dog1.color = "White"; //Set dog1's color to White
		
		//Get dog1's name, age, breed and color
		System.out.println(dog1.name + " : " + dog1.age + " : " + dog1.breed + " : " + dog1.color);
		
		dog1.bark(); //Invoke bark method on dog1
		dog1.eat(); //Invoke eat method on dog1
		dog1.wagTail(); //Invoke wagTail method of dog1
		
		System.out.println("--------------------------------------------");
		
		//Create a dog object, referenced by d2
		Dog d2 = new Dog();
		d2.name = "Rusty"; //Set d2's name property to Rusty
		d2.age = 5; //Set d2's age property to 5
		d2.breed = "Golder Retriever"; //Set d2's breed property to Golden Retriever
		d2.color = "Dark Golden"; //Set d2's color property to Dark Golden
		
		//Get d2's name, age, breed and color
		System.out.println(d2.name + " : " + d2.age + " : " + d2.breed + " : " + d2.color);
		
		d2.bark(); //Invoke bark method on d2
		d2.eat(); //Invoke eat method on d2
		d2.wagTail(); //Invoke wagTail method of d2
		
		System.out.println("--------------------------------------------");
		
		//Create a dog object, referenced by d3
		Dog d3 = new Dog();
		d3.name = "Hunter"; //Set d3's name property to Hunter
		d3.age = 2; //Set d3's age property to 2
		d3.breed = "German Shepherd"; //Set d3's breed property to German Shepherd
		d3.color = "Golden Black"; //Set d3's color property to Golden Black
		
		//Get d3's name, age, breed and color
		System.out.println(d3.name + " : " + d3.age + " : " + d3.breed + " : " + d3.color);
		
		d3.bark(); //Invoke bark method on d3
		d3.eat(); //Invoke eat method on d3
		d3.wagTail(); //Invoke wagTail method of d3
	}
}
