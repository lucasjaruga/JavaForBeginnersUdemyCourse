package com.udayan.debugging;

public class StringTest {
	public static void main(String[] args) {
		String str = "  \nCore Java   \t ";
		/*
		 * Write code to:
		 * 1. trim leading and trailing whitespace from above string and then
		 * 2. convert all the characters of the trimmed string to upper case and finally
		 * 3. print the character value at index 2 of upper case String.
		 */
		String trimmedStr = str.trim();//Core Java
		String upperCaseStr = trimmedStr.toUpperCase();//CORE JAVA
		char ch1 = upperCaseStr.charAt(2);//R
		System.out.println("ch1: " + ch1);
		
		char ch2 = str.trim().toUpperCase().charAt(2);
		System.out.println("ch2: " + ch2);
		
		System.out.println(str.trim().toUpperCase().charAt(2));
	}
}
