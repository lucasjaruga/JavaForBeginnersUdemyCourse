/**
 * An example of associating values with enum constants.
 * An enum can declare variables, constructors and methods.
 * 
 * For details, watch video lecture 2 of Section 12.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec02;

public enum TrafficLight2 {
	RED(40), AMBER(5), GREEN(60); //Semicolon is compulsory as we have more codes after this statement.
	//Above statement invokes constructor 3 times: once for RED(40), once for AMBER(5) and once for GREEN(60)
	//These constants, which are instances of TrafficLight2 are created when any of the above constant is accessed or a static method is invoked.
	
	int duration; //variable to store duration
	
	//Parameterized constructor, you cannot invoke an enum constructor yourself and that is why Enum constructors cannot be declared public or protected
	TrafficLight2(int duration) {
		System.out.println("Inside TrafficLight2 Constructor");
		this.duration = duration;
	}
	
	//Getter method
	public int getDuration() {
		return duration;
	}
}
