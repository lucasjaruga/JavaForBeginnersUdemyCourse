/**
 * This is a test class to check eat(), sleep(), getPrice() and addRider(String) methods of 
 * animal instances.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec20.test;

import com.udayan.lec20.Animal;
import com.udayan.lec20.Camel;
import com.udayan.lec20.Horse;
import com.udayan.lec20.Jaguar;
import com.udayan.lec20.Rabbit;
import com.udayan.lec20.Rideable;
import com.udayan.lec20.Sellable;

public class AnimalTest {
	private static void checkAnimals(Animal animal) {
		animal.eat();
		animal.sleep();
		
		//Right way to invoke getPrice() and addRider(String) methods on animal instances.
		//If newly added animal class is sellable, then it just needs to implement Sellable 
		//interface and implement getPrice() method.
		//If newly added animal class is rideable, then if just needs to implement Rideable
		//interface and implement addRider(String) method.
		//No changes are required in below code.
		if(animal instanceof Sellable) {
			Sellable obj = (Sellable) animal;
			System.out.println(obj.getPrice());
		}
		if(animal instanceof Rideable) { //No else if, as an animal can be both Sellable and Rideable
			Rideable obj = (Rideable) animal;
			obj.addRider("Jack");
		}
		
		//Not a good way to invoke getPrice() and addRider(String) methods on animal instances.
		//Every time a new animal is added (who is rideable or sellable), then we instanceof
		//check should be added for that animal type.
		/*
		if(animal instanceof Horse) {
			Horse horse = (Horse) animal;
			System.out.println(horse.getPrice());
			horse.addRider("Jack");
		}
		
		else if(animal instanceof Rabbit) { //else if, as an animal cannot be both Horse and Rabbit
			Rabbit rabbit = (Rabbit) animal;
			System.out.println(rabbit.getPrice());
		}
		
		else if(animal instanceof Camel) {
			Camel camel = (Camel) animal;
			System.out.println(camel.getPrice());
			camel.addRider("Jack");
		}
		*/
	}
	
	public static void main(String[] args) {
		Animal obj = new Horse();
		checkAnimals(obj);
	}
}
