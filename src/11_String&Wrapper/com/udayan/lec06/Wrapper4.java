/**
 * Some tricky scenarios asked in interviews or certification exams. 
 * 
 * For details, watch video lecture 6 of Section 11.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec06;

public class Wrapper4 {
	static int var1; //By default initialized to 0
	static Integer var2; //By default initialized to null
	public static void main(String[] args) {
		System.out.println(++var1); //1
		//System.out.println(++var2); //NullPointerException as var2 is null and automatically called var2.intValue() method throws NullPointerException
		
		/*
		byte b1 = 5;
		int i1 = b1; //primitive byte can easily be assigned to primitive int
		
		Byte b2 = 5;
		Integer i2 = b2; //Byte type cannot be assigned to Integer type as both are reference type and not in multilevel inheritance relationship
		*/
		
		printMessage(new Boolean("true")); 
		printMessage(true); //Auto-boxing
		
	}
	
	private static void printMessage(Boolean flag) {
		if(flag) { //Auto-Unboxing
			System.out.println("Good Morning!");
		} else {
			System.out.println("Good Evening!");
		}
	}
}
