/**
 * This is the test class for the enum, com.udayan.lec05.sol1.Day.
 * 
 * For details, watch video lecture 5 of Section 12.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec05.sol1;

public class TestDay1 {
	public static void main(String[] args) {
		for(Day a : Day.values()) {
			System.out.println(a.toString() + " : " + Day.dayType(a));
		}
	}
}