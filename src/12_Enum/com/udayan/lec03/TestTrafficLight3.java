/**
 * This is the test class for the enum, com.udayan.lec03.Super.TrafficLight3.
 * 
 * In other classes, enum can be accessed by using full name [Super.TrafficLight3] only.
 * 
 * For details, watch video lecture 3 of Section 12.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec03;

public class TestTrafficLight3 {
	public static void main(String[] args) {
		Super.TrafficLight3 [] arr = Super.TrafficLight3.values(); //Using full name of the enum
		for(Super.TrafficLight3 obj : arr) { //for-each loop's declaration expression uses full name of the enum
			System.out.println(obj.toString() + ", " + obj.getDuration() + ", " + getNewMessage(null));
		}
	}
	
	private static String getNewMessage(Super.TrafficLight3 tl) { //Method parameter uses full name of the enum
		switch(tl) {
			case RED: //case value must be the constant name (RED) and not the instance of the constant (Super.TrafficLight3.RED)
				return "STOP NOW";
			case AMBER:
				return "SLOW DOWN";
			case GREEN:
				return "GO NOW";
			default:
				return "ERROR";
		}
	}
}
