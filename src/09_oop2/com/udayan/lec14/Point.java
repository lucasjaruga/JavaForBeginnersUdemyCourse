/**
 * Example on overriding equals(Object) method of Object class.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec14;

public class Point {
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	@Override
	public String toString() {
		String str = "Point: (" + this.x + ", " + this.y + ")";
		return str;
	}
	
	@Override
	public boolean equals(Object obj) {
		//this -> currently executing object, refers to 1st Point instance
		//obj - refers to 2nd Point instance
		if(obj instanceof Point) {
			Point p = (Point) obj;
			//if for two Point instances, x and y co-ordinates are same, then those instances are considered equal.
			boolean result = (this.x == p.x && this.y == p.y);
			return result;
		}
		return false;
	}
}
