/**
 * An example of associating multiple values with enum constants.
 * 
 * For details, watch video lecture 3 of Section 12.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec03;

public enum TrafficLight2 {
	RED(40, "STOP"), AMBER(5, "SLOW"), GREEN(60, "GO"); //Pass the duration and message at the time of creation
	
	private int duration; //for duration
	
	private String message; //for message
	
	//Parameterized constructor
	TrafficLight2(int duration, String message) {
		this.duration = duration;
		this.message = message;
	}
	
	//Getter for duration
	public int getDuration() {
		return duration;
	}
	
	//Getter for message
	public String getMessage() {
		return message;
	}
}
