/**
 * Example to test equals method of Point class.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec14.test;

import com.udayan.lec14.Point;

public class TestPoint {
	public static void main(String[] args) {
		int i1 = 5;
		int i2 = 5;
		
		Point p1 = new Point(2, 2);
		Point p2 = new Point(2, 2);
		Point p3 = new Point(2, 3);
		
		System.out.println(i1 == i2); //true, equality of primitive types are checked using == operator
		System.out.println(p1 == p3); //false, p1 and p3 refer to different objects
		System.out.println(p1 == p2); //false, p1 and p2 refer to different objects
		System.out.println(p1.equals(p3)); //false, p1 -> (2, 2) is not equal to p3 -> (2, 3)
		System.out.println(p1.equals(p2)); //true, p1 -> (2, 2) is equal to p2 -> (2, 2)
		System.out.println(p1.equals("text")); //false, Point and String instances can never be equal.
	}
}
