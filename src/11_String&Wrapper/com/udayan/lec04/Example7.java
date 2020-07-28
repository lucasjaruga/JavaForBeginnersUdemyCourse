/**
 * This code explains that StringBuilder is preferred over String, when you have to make a 
 * lot of modifications to text contents.
 * 
 * For details, watch video lecture 4 of Section 11.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec04;

public class Example7 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("A");
		sb.append("B");
		sb.append("C");
		sb.append("D");
		System.out.println(sb);
		
		String s1 = "W";
		s1 = s1 + "X";
		s1 = s1 + "Y";
		s1 = s1 + "Z";
		System.out.println(s1);
		
	}
}
