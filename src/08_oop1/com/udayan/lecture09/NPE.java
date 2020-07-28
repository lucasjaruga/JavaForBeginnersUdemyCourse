/**
 * Example on java.lang.NullPointerException.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lecture09;

class Point {
	public int x;
	public int y;
	public Point(int x1, int y1) {
			x = x1;
			y = y1;
	}
	public void printPoint() {
		System.out.println("Point: (" + x + ", " + y + ")");
	}
}

public class NPE {
	public static void main(String[] args) {
		Point p1 = new Point(10, 20); //Creates a point object: x = 10 and y = 20
		//Point p1 = null; //Point reference variable p1 is null
		/*
		 * Statements inside if block will execute only when p1 is not equals to null.
		 * if p1 is null, then if's boolean condition evaluates to false and statements inside
		 * if block are not executed.
		 * Below code will never throw NullPointerException
		 */
		if(p1 != null) {
			System.out.println(p1.x);
			System.out.println(p1.y);
			p1.printPoint();
		}
	}
}
