/**
 * This is the test class to show examples of moving duplicate codes to methods and invoke these methods
 * to avoid code repetition.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lecture10;

public class DogTest3 {
	public static void main(String[] args) {
		//Invoke static getDogObject(String, int, String, String) method to instantiate dog object.
		Dog dog1 = getDogObject("Bubbly", 10, "Poodle", "White");
		//Invoke static testDog(Dog) method.
		testDog(dog1);
		
		System.out.println("-------------------------------");
		
		Dog dog2 = getDogObject("Rusty", 5, "Bulldog", "Brown");
		testDog(dog2);
	}
	
	/**
	 * Creates a dog instance / object and initializes the properties with passed values.
	 * 
	 * @param name name of the dog
	 * @param age age of the dog
	 * @param breed breed of the dog
	 * @param color color of the dog
	 * @return the Dog reference variable referring to newly created Dog object
	 */
	public static Dog getDogObject(String name, int age, String breed, String color) {
		Dog dog = new Dog(); 
		dog.name = name; 
		dog.age = age; 
		dog.breed = breed; 
		dog.color = color; 
		return dog;
	}
	
	/**
	 * Prints the properties of passed Dog object and invokes bark(), eat() and wagTail() methods.
	 * 
	 * @param dog Dog object's reference
	 */
	public static void testDog(Dog dog) {
		System.out.println(dog.name + " : " + dog.age + " : " + dog.breed + " : " + dog.color);
		dog.bark(); 
		dog.eat(); 
		dog.wagTail();
	}
}
