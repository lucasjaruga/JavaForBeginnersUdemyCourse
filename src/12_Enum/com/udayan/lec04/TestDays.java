/**
 * This is the test class for com.udayan.lec04.Day.
 * 
 * For details, watch video lecture 4 of Section 12.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec04;

public class TestDays {
	public static void main(String[] args) {

//		Day d1 = Day.valueOf("SUNDAY");
//		System.out.println(d1);
		
		Day [] days = Day.values();
		
		for(Day d : days) {
			System.out.println(d.name() + " : " + d.ordinal());
		}
		
		System.out.println();
		
		for(Day d : Day.values()) {
			System.out.println(d.name() + " : " + d.ordinal());
		}
		
		Day day1 = Day.MONDAY;
		Day day2 = Day.MONDAY;
		Day day3 = Day.FRIDAY;
		
		System.out.println();
		
		System.out.println(day1 == day2);
		System.out.println(day1 == day3);
		
		System.out.println();
		
		System.out.println(day1.equals(day2));
		System.out.println(day1.equals(day3));
		
		System.out.println();
		
		System.out.println(day1.compareTo(day2)); //day1.ordinal() - day2.ordinal() = 0 - 0 
		System.out.println(day1.compareTo(day3)); //day1.ordinal() - day3.ordinal() = 0 - 4 = -4
		System.out.println(day3.compareTo(day1)); //day3.ordinal() - day1.ordinal() = 4 - 0 = 4
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Day d1 = Day.valueOf("SUNDAY"); //returns enum constant Day.SUNDAY
//		System.out.println(d1);
//		
////		Day d2 = Day.valueOf("Sunday"); //throws IllegalArgumentException
////		System.out.println(d2);
////		
////		Day d3 = Day.valueOf(null); //throws NullPointerException
////		System.out.println(d3);
//		
//		
//		Day [] days = Day.values();
//		for(Day d : days) {
//			System.out.println(d.toString() + " : " + d.ordinal());
//		}
//		
//		
//		Day day1 = Day.MONDAY;
//		Day day2 = Day.MONDAY;
//		Day day3 = Day.FRIDAY;
//		
//		System.out.println(day1 == day2); //true
//		System.out.println(day1 == day3); //false
//		
//		System.out.println(day1.equals(day2)); //true
//		System.out.println(day1.equals(day3)); //false
//		//equals() method of java.lang.Enum class uses double equals operator
//		
//		System.out.println(day1.compareTo(day2)); //day1.ordinal() - day2.ordinal() = 0 - 0 = 0
//		System.out.println(day1.compareTo(day3)); //day1.ordinal() - day3.ordinal() = 0 - 4 = -4
//		System.out.println(day3.compareTo(day1)); //day3.ordinal() - day1.ordinal() = 4 - 0 = 4
	}
}
