/**
 * Creation of String objects(instances) using constructor or literal syntax.
 * 
 * Watch Video Lecture 1 of Section 11 for details.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec01;

public class Example1 {
	public static void main(String[] args) {
		//Below syntax creates 2 String objects: One is referred by String Pool table and another by str1
		String str1 = new String("Hello");
		System.out.println(str1);
		
		//Below syntax creates 1 String object: Same object is referred by String Pool table and by str2
		String str2 = "Hello"; 
		System.out.println(str2);
		
        StringBuilder a = new StringBuilder("SpaceStation");
        a.delete(5, 6).insert(5, " S").toString().toUpperCase();
        System.out.println(a);
	}
}
