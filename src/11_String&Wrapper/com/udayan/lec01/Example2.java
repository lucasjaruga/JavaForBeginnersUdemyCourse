/**
 * String objects are immutable, which means once String objects are created they cannot be changed.
 * 
 * Watch Video Lecture 1 of Section 11 for details.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec01;

public class Example2 {
	public static void main(String[] args) {
		String s1 = "Jan"; //s1 refers to "Jan"
		String s2 = "_Feb";//s2 refers to "_Feb"
		s1.concat(s2); //Creates another String object "Jan_Feb" and no variable refers to it.
		System.out.println(s1); //Prints "Jan"
		
		String s3 = "Mar"; //s3 refers to "Mar"
		String s4 = "_Apr"; //s4 refers to "_Apr"
		s3 = s3.concat(s4); //Creates another String object "Mar_Apr" and s3 refers to it.
		System.out.println(s3); //Prints "Mar_Apr"
	}
}
