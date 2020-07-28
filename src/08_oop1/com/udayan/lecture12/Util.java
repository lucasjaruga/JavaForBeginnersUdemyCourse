/**
 * Util class.
 * 
 * Two differences from com.udayan.lecture11.Util class:
 * 1. increment(int) method returns int value.
 * 2. Implementation of incrementXY(Point) method is changed.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lecture12;

public class Util {
	
	/**
	 * Static method.
	 * 
	 * This method accepts primitive parameter and increments its value by 1.
	 * It also returns the incremented value.
	 * 
	 * @param x int parameter
	 * @return incremented value
	 */
	public static int increment(int x) {
		x = x + 1;
		return x;
	}
	
	/**
	 * Static method.
	 * 
	 * This method accepts Point reference variable which refers to the passed object.
	 * 
	 * But it creates a new Point object and modifies the pt reference to refer to this newly
	 * created object. Then it increments the properties x and y of the newly created object 
	 * (referred by pt reference) by 1.
	 * 
	 * The originally passed object stays unchanged.
	 * 
	 * @param pt Point reference parameter
	 */
	public static void incrementXY(Point pt) { //pt refers to the passed object.
		pt = new Point(100, 200); //Creates new Point object and pt now refers to it.
		pt.x = pt.x + 1;
		pt.y = pt.y + 1;
	}
}
