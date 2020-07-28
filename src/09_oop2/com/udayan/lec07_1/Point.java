/**
 * Example to show that java.lang.Object is the root of all the classes in Java.
 * All the classes in Java extends from Object class.
 * If we don't provide "extends Object", then Java compiler adds it.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec07_1;

public class Point extends Object {
	private int x; //private instance variable
	private int y; //private instance variable
	
	public Point(int x, int y) { //parameterized constructor
		this.x = x;
		this.y = y;
	}

	public int getX() { //public getter
		return x;
	}

	public int getY() { //public getter
		return y;
	}
	
//	@Override
//	public String toString() { //toString() method is overridden to show meaningful output in the Console, when object is passed in System.out.println statement.
//		String str = "Point: (" + this.x + ", " + this.y + ")";
//		return str;
//	}
	
}
