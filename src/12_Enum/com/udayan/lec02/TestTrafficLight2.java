/**
 * This is the test class for the enum, com.udayan.lec02.TrafficLight2.
 * 
 * For details, watch video lecture 2 of Section 12.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec02;

public class TestTrafficLight2 {
	public static void main(String[] args) {
		System.out.println(TrafficLight2.RED instanceof TrafficLight2); //true
		System.out.println(TrafficLight2.AMBER instanceof Enum); //true
		System.out.println(TrafficLight2.GREEN instanceof Object); //true
		
		
		//Access duration associated with enum constants
		TrafficLight2 obj = TrafficLight2.RED;
		System.out.println(obj.getDuration());
		
		System.out.println(TrafficLight2.AMBER.getDuration()); //TrafficLight2.AMBER is and instance of TrafficLight2 enum, hence getDuration() method can be invoked.
		
		//Iterate through all the constants defined in TrafficLight2
		TrafficLight2 [] arr = TrafficLight2.values(); //static method values() returns an array of specified enum type, TrafficLight2 [] in this case. 
		//for-each loop to print constant name and associated duration
		for(TrafficLight2 tl : arr) {
			System.out.println(tl.toString() + " : " + tl.getDuration());
		}
	}
}
