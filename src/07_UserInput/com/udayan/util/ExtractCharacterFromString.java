/**
 * This class shows how to extract all the characters from String object.
 * 
 * @author Udayan Khattry
 */
package com.udayan.util;

public class ExtractCharacterFromString {
	public static void main(String[] args) {
		String str = "Udayan";
		
		for(int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}
}
