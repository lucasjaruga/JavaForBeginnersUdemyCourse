package com.company2;
/**
 * This class provides various utility methods for Strings.
 * This belongs to www.company2.com
 * 
 * @author Company2
 * @version 1.0.0
 */
public class StringUtils {
	/**
	 * Accepts two Strings and returns result after concatenation.
	 * If you pass "Udayan" and "Khattry" as parameters then it returns
	 * Udayan Khattry
	 * 
	 * @param param1 first String parameter
	 * @param param2 second String parameter
	 * @return result after concatenating param1 and param2
	 */
	public static String concat(String param1, String param2) {
		String res = param1 + " " + param2;
		return res;
	}
}
