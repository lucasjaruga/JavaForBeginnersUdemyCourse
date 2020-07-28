/**
 * Class to implement following solution using if - else if - else statement only.
 * 
 * 		Write a program to implement following logic.
 *      1. if hour is less than 12 noon, greet with Good Morning.
 *      2. if hour is greater than or equal to 12 noon but less than 15 (3 PM), greet with Good Afternoon
 *      3. if hour is greater than or equal to 15 (3 PM), greet with Good Evening
 * 
 * @author Udayan Khattry
 */
public class Greetings3 {
	public static void main(String[] args) {
		byte hour = 16;

		// 1. if hour is less than 12 noon, greet with Good Morning.
		if (hour < 12) {
			System.out.println("Good Morning");
		}
		// 2. if hour is greater than or equal to 12 noon but less than 15 (3 PM), greet with Good Afternoon
		else if (hour < 15) {
			System.out.println("Good Afternoon");
		}
		// 3. if hour is greater than or equal to 15 (3 PM), greet with Good Evening
		else { //hour >= 15
			System.out.println("Good Evening");
		}
	}
}
