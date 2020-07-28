/**
 * Enum to represent days of the week.
 * This enum has getMessage() method and SATURDAY and SUNDAY overrides the getMessage() method.
 * 
 * For details, watch video lecture 5 of Section 12.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec05.sol3;

public enum Day {
	MONDAY, 
	TUESDAY, 
	WEDNESDAY, 
	THURSDAY, 
	FRIDAY, 
	SATURDAY{
		@Override
		public String getMessage() {
			return "WEEKEND";
		}
	},
	SUNDAY{
		@Override
		public String getMessage() {
			return "WEEKEND";
		}
	};
	
	public String getMessage() {
		return "WEEKDAY";
	}
}