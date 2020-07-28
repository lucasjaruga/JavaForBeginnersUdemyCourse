/**
 * TestUtil class.
 * 
 * This example shows 2 schemes:
 * Primitive types are passed as pass-by-value and
 * Reference types are passed as pass-by-reference
 * 
 * @author Udayan Khattry
 */
package com.udayan.lecture11;

public class TestUtil {
	public static void main(String[] args) {
		int i1 = 100;
		System.out.println("Value of i1 before increment: " + i1);
		Util.increment(i1); //pass-by-value
		System.out.println("Value of i1 after increment: " + i1);
		
		Point point = new Point(10, 20);
		System.out.print("Point before increment: ");
		point.printPoint();
		
		Util.incrementXY(point); //pass-by-reference
		System.out.print("Point after increment: ");
		point.printPoint();
	}
}
