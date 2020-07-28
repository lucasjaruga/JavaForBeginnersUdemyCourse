/**
 * This is the test class for com.udayan.lec01.TrafficLight1 class.
 * 
 * For details, watch video lecture 1 of Section 12.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec01;

public class TestTrafficLight1 {
	public static void main(String[] args) {
		TrafficLight1 tl1 = new TrafficLight1();
		System.out.println(tl1.getDuration("RED")); //Pass valid String literal
		System.out.println(tl1.getDuration(TrafficLight1.RED)); //Pass valid String reference of "RED"
		System.out.println(tl1.getDuration(TrafficLight1.AMBER)); //Pass valid String reference of "AMBER"
		System.out.println(tl1.getDuration(TrafficLight1.GREEN)); //Pass valid String reference of "GREEN"
		System.out.println(tl1.getDuration("red")); //Pass invalid String literal
	}
}

