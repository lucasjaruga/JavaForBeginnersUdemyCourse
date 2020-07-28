/**
 * This class shows the usage of some of the important methods of String class.
 * 
 * @author Udayan Khattry
 */
package com.udayan.util;

public class StringTest {
	public static void main(String[] args) {
		String str1 = "Java";
		String str2 = "java";
		
		//length() method returns the number of elements in the String object.
		System.out.println(str1.length()); // -> 4
		
		//charAt(int index) method returns the char value at particular index
		//Like arrays, index starts with 0 and if you provide out of range index value
		//then StringIndexOutOfBoundsException is thrown.
		//For arrays, ArrayIndexOutOfBoundsException was thrown.
		System.out.println(str1.charAt(1)); // -> a
		
		//Match two Strings objects
		System.out.println(str1.equals(str2)); // -> false, as in str1 J is in upper case.
		//Match String object with literal
		System.out.println(str1.equals("Java")); // -> true, case matches
		//Match literal with String object
		System.out.println("Java".equals(str2)); // -> false, as in str2 j is in lower case.
		//Match two String literals
		System.out.println("Java".equals("Java")); // -> true, both the Strings are exactly same
		
		//To check if two Strings are equal, ignoring their case
		System.out.println(str1.equalsIgnoreCase(str2)); // -> true
		
		//Match string objects using == operator
		System.out.println(str1 == str2); //-> false
		
		//Convert a String object to upper case
		System.out.println(str1.toUpperCase()); // -> JAVA
		
		//Convert a String object to lower case
		System.out.println(str1.toLowerCase()); // -> java
		
		//Trims all the whitespace characters.
		System.out.println(" \n\r\t    Udayan\tKhattry\n\f  ".trim()); // -> Udayan	Khattry
	}
}
