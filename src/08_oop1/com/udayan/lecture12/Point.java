/**
 * Point class.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lecture12;

public class Point {
	public int x; //instance variable x
	public int y; //instance variable y
	
	/**
	 * Parameterized Constructor.
	 * 
	 * @param x1 to assign to x
	 * @param y1 to assign to y
	 */
	public Point(int x1, int y1) {
			x = x1;
			y = y1;
	}
	
	/**
	 * Instance method.
	 * 
	 * Prints the point object in the format Point: (x, y). 
	 * x and y will be replaced at runtime.
	 */
	public void printPoint() {
		System.out.println("Point: (" + x + ", " + y + ")");
	}
}
