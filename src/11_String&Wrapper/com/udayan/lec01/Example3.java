/**
 * Concepts of String Pool table explained using this example.
 * 
 * Watch Video Lecture 1 of Section 11 for details.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec01;

public class Example3 {
	public static void main(String[] args) {
		String s1 = "Core";
		String s2 = "Java";
		String s3 = "Co" + "re";
		String s4 = new String("Core");
		String s5 = s4.intern();
		String s6 = s1 + s2;
		String s7 = s6.intern();
		
		System.out.println(s1 == s3); //true
		System.out.println(s1 == s4); //false
		System.out.println(s1 == s5); //true
		System.out.println(s2 == "Java"); //true
		System.out.println(s6 == s7); //true
	}
}
