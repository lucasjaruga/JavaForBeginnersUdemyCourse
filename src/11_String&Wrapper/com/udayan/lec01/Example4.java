/**
 * Use overriding equals(Object) method of String class to match the contents of 2 String objects.
 * 
 * Watch Video Lecture 1 of Section 11 for details.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec01;

public class Example4 {
	public static void main(String[] args) {
		String s1 = "A";
		String s2 = new String("A");
		System.out.println(checkStringEquality(s1, s2));
	}
	
	private static boolean checkStringEquality(String s1, String s2) {
		//return s1 ==s2; //Never use == operator to match the contents of 2 String objects.
		return s1.equals(s2); //Always use equals(Object) method to match the contents of 2 String objects.
	}
}
