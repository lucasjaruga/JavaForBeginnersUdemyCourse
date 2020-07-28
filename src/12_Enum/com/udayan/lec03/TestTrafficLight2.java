/**
 * This is the test class for the enum, com.udayan.lec03.TrafficLight2.
 * 
 * For details, watch video lecture 3 of Section 12.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec03;

public class TestTrafficLight2 {
	public static void main(String[] args) {
		TrafficLight2[] arr = TrafficLight2.values();
		for(TrafficLight2 obj : arr) {
//			System.out.println(obj.toString() + ": " + obj.getDuration() + " : " + obj.getMessage());
			System.out.println(obj.toString() + ": " + obj.getDuration() + " : " + getNewMessage(obj));
		}
	}
	
	//Returns the message based on constant value
	private static String getNewMessage(TrafficLight2 tl) {
		if(tl == null) {
			return "ERROR";
		}
		switch(tl) { //One of the possible switch expression is enum type
			case RED: //case value must be the constant name (RED) and not the instance of the constant (TrafficLight2.RED)
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
