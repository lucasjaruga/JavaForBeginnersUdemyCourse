/**
 * This class declares three String constant variables: RED, AMBER and GREEN.
 * 
 * For details, watch video lecture 1 of Section 12.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec01;

public class TrafficLight1 {
	public static final String RED = "RED";
	public static final String AMBER = "AMBER";
	public static final String GREEN = "GREEN";
	
	/**
	 * Returns the duration (in seconds) for which these lights will be on.
	 * 
	 * @param color String representation of color
	 * @return int value for "RED", "AMBER" and "GREEN" and 0 for others
	 */
	public int getDuration(String color) {
		if(color == null) {
			return 0;
		}
		switch (color) {
			case RED:
				return 40;
			case AMBER:
				return 5;
			case GREEN:
				return 60;
			default:
				return 0;
		}
	}
}
