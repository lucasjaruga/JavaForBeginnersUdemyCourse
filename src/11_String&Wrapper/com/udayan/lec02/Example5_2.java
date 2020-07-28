/**
 * Example5_1 and Example5_2 are related, these present an interesting example, in which
 * by moving System.out.println("Java"); statement 2 rows down, result of expression (s1 == s2) changed.
 * 
 * Watch Video Lecture 2 of Section 11 for details.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec02;

public class Example5_2 {
	public static void main(String[] args) {
		String s1 = new String(new char[]{'J', 'a', 'v', 'a'});
		String s2 = s1.intern();
		System.out.println("Java");
		//How many objects will get created at this line? [One String object and One char [] object]
		
		System.out.println(s1 == s2);
		s1 = s2 = null;
		//How may objects are eligible of garbage collection? [Only one char [] object]
		
		
	}
}

