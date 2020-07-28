/**
 * Example5_1 and Example5_2 are related, these present an interesting example, in which
 * by moving System.out.println("Java"); statement 2 rows down, result of expression (s1 == s2) changed.
 * 
 * Watch Video Lecture 2 of Section 11 for details.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec02;

public class Example5_1 {
	public static void main(String[] args) {
		System.out.println("Java");
		String s1 = new String(new char[]{'J', 'a', 'v', 'a', '1'});
		String s2 = s1.intern();
		//How many objects will get created at this line? [Two String objects and One char [] object]
		
		System.out.println(s1 == s2);
		
		s1 = s2 = null;
		//How may objects are eligible of garbage collection? [One String object and One char [] object]
		
	}
}

