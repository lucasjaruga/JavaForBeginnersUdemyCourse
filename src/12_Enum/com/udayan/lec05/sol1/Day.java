/**
 * Enum to represent days of the week.
 * 
 * For details, watch video lecture 5 of Section 12.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec05.sol1;

public enum Day {
	MONDAY, 
	TUESDAY, 
	WEDNESDAY, 
	THURSDAY, 
	FRIDAY, 
	SATURDAY, 
	SUNDAY;
	
	public static String dayType(Day day) {
		if(day != null) {
				switch(day) {
					default:
						return "ERROR";
					case MONDAY:
					case TUESDAY:
					case WEDNESDAY:
					case THURSDAY:
					case FRIDAY:
						return "WEEKDAY";
					case SATURDAY:
					case SUNDAY:
						return "WEEKEND";
				}
		} else
			return "ERROR";
	}
}