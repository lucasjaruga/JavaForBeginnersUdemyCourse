package com.company1;
/**
 * This provides various utility methods for Strings.
 * This belongs to www.company1.com
 * 
 * @author Company1
 * @version 1.0.0
 */
public class StringUtils {
	/**
	 * Accepts a String and returns its reverse.
	 * If you pass "UDAYAN", this method returns "NAYADU".
	 * 
	 * @param str Original String
	 * @return reverse of Original String
	 */
	public static String reverse(String str) {
		/*
		 * Convert the String to char array
		 * and traverse the array from end to finish.
		 */
		String rev = "";
		
		char c[] = str.toCharArray();
		for(int i = c.length-1; i >=0; i--) {
			rev += c[i];
		}
		return rev;
		//TODO: change above logic and use StringBuilder.
	}
}
