/**
 * An enum can be defined within a class as well.
 * enum TrafficLight3 is defined within class Super. There are 2 ways to access TrafficLight3 enum within this class:
 * 1. By using full name of the enum: Super.TrafficLight3
 * 2. By using shorthand name of the enum: TrafficLight3
 * 
 * For details, watch video lecture 3 of Section 12.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec03;

public class Super {
	public enum TrafficLight3 {
		RED(40, "STOP"), AMBER(5, "SLOW"), GREEN(60, "GO");
		
		int duration;
		
		String message;

		TrafficLight3(int duration, String message) {
			this.duration = duration;
			this.message = message;
		}
		
		public int getDuration() {
			return duration;
		}
		
		public String getMessage() {
			return message;
		}
	} //enum definition ends
	
	public static void main(String[] args) {
		Super.TrafficLight3 obj1 = Super.TrafficLight3.RED; //Using full name of the enum
		TrafficLight3 obj2 = TrafficLight3.AMBER; //Using shorthand name of the enum
		System.out.println(obj1.toString() + ", " + obj1.getDuration() + ", " + obj1.getMessage());
		System.out.println(obj2.toString() + ", " + obj2.getDuration() + ", " + obj2.getMessage());
	}
}