/**
 * This is the test class for the enum, com.udayan.lec05.sol3.Day.
 * 
 * For details, watch video lecture 5 of Section 12. 
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec05.sol3;

public class TestDay3 {
	public static void main(String[] args) {
		for(Day day : Day.values()) {
			System.out.println(day.toString() + " : " + day.getMessage());
		}
	}
}
