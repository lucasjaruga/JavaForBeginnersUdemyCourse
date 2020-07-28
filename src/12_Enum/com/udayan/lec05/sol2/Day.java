/**
 * Enum to represent days of the week.
 * "WEEKDAY" and "WEEKEND" are associated with enum constants.
 * Instance variable, Constructor and Getter methods are used.
 * 
 * For details, watch video lecture 5 of Section 12.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec05.sol2;

public enum Day {
	MONDAY("WEEKDAY"), 
	TUESDAY("WEEKDAY"), 
	WEDNESDAY("WEEKDAY"), 
	THURSDAY("WEEKDAY"), 
	FRIDAY("WEEKDAY"), 
	SATURDAY("WEEKEND"), 
	SUNDAY("WEEKEND");
	
	private String dayType;
	
	Day(String dayType){
		this.dayType = dayType;
	}
	
	public String getDayType() {
		return dayType;
	}
}