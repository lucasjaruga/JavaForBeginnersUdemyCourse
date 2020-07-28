/**
 * Example to show that siblings cannot be casted to each other.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec12;

class Animal {
	
}

class Dog extends Animal {
	
}

class Cat extends Animal {
	
}

public class Polymorphism3 {
	public static void main(String[] args) {
		Dog dog1 = new Dog();
		Cat cat1 = new Cat();
		
		/* Siblings cannot be casted to each other.*/
		//dog1 = cat1; //Type mismatch: cannot convert from Cat to Dog
		//dog1 = (Dog)cat1; //Cannot cast from Cat to Dog
		
		/* instanceof operator cannot be used between siblings or unrelated classes. */
		//System.out.println(cat1 instanceof Dog); //Incompatible conditional operand types: Cat and Dog
		
		Dog dog2 = new Dog();
		Animal cat2 = new Cat();
		
		//cat2 is of Animal type and it is check against Dog, as Dog and Animal are in multilevel inheritance relationship, 
		//hence no error over here. At runtime, if condition evaluates to false.
		if(cat2 instanceof Dog) 
			dog2 = (Dog)cat2; //At runtime a dog reference variable should not refer to instance of Cat class.
	}
}
