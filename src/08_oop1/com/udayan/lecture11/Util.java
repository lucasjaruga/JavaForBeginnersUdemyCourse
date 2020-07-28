/**
 * Util class.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lecture11;

public class Util {
	
	/**
	 * Static method.
	 * 
	 * This method accepts primitive parameter and increments its value by 1.
	 * 
	 * @param x int parameter
	 */
	public static void increment(int x) {
		x = x + 1;
	}
	
	/**
	 * Static method.
	 * 
	 * This method accepts Point reference variable.
	 * It increments the properties x and y of the object (referred by pt reference) by 1.
	 * 
	 * @param pt Point reference parameter
	 */
	public static void incrementXY(Point pt) {
		pt.x = pt.x + 1;
		pt.y = pt.y + 1;
	}
}
