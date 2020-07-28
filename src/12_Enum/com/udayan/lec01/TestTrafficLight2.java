/**
 * This is the test class for the enum, com.udayan.lec01.TrafficLight2.
 * 
 * For details, watch video lecture 1 of Section 12.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec01;

public class TestTrafficLight2 {
	public static void main(String[] args) {
		//Enum constants are accessed by using Enum name [TrafficLight2], then dot operator [.] and after that constant name[RED].
		/*
		 * System.out.println(TrafficLight2.RED.getDuration());
		 * System.out.println(TrafficLight2.AMBER.getDuration());
		 * System.out.println(TrafficLight2.GREEN.getDuration());
		 */
		
		// System.out.println(TrafficLight2.GREEN);
		
	
		TrafficLight2 [] arr = TrafficLight2.values();
		
		for(TrafficLight2 a : arr) {
			System.out.println(a.toString() + " : " + a.getDuration() + " : " + getInfo(a));
		}
	}
	
	public static String getInfo(TrafficLight2 tl) {
		if(tl == null) {
			return "ERROR";
		}
		switch(tl) {
			default:
				return "ERROR";
			case RED:
				return "STOP";
			case AMBER:
				return "SLOW";
			case GREEN:
				return "GO";
		}
	}
}