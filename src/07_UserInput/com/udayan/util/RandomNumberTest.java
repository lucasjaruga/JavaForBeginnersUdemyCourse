/**
 * This class shows how to generate random numbers in java.
 * We are using java.security.SecureRandom class over here.
 * 
 * There is java.util.Random class as well, but java.security.SecureRandom provides better 
 * security and random numbers generated using this class are hard to guess.
 * 
 * So if you have a requirement of generating random values, 
 * then go for java.security.SecureRandom.
 * 
 * @author Udayan Khattry
 */
package com.udayan.util;

import java.security.SecureRandom;

public class RandomNumberTest {
	public static void main(String[] args) {
		//Create an object of SecureRandom class.
		SecureRandom random = new SecureRandom();
		
		//for loop to run the code 100 times.
		for(int i = 0; i < 100; i++) {
			int num1 = random.nextInt(10); //This generates a random number between 0 and 9
			System.out.println("num1 = " + num1);
			
			//To generate number between 1 and 10, add 1 to the generated number
			int num2 = random.nextInt(10) + 1; //This results in number between 1 and 10
			System.out.println("num2 = " + num2);
		}
	}
}
