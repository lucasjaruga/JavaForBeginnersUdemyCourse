/**
 * TestUtil class.
 * 
 * This example shows 2 schemes:
 * Primitive types are passed as pass-by-value and
 * Reference types are passed as pass-by-reference
 * 
 * @author Udayan Khattry
 */
package com.udayan.lecture12;

public class TestUtil {
	public static void main(String[] args) {
		int i1 = 100;
		System.out.println("Value of i1 before increment: " + i1);
		//pass-by-value
		i1 = Util.increment(i1); //Update the variable i1 with returned value.
		System.out.println("Value of i1 after increment: " + i1);
		
		Point point = new Point(10, 20);
		System.out.print("Point before increment: ");
		point.printPoint();
		
		//pass-by-reference
		Util.incrementXY(point);
		System.out.print("Point after increment: ");
		point.printPoint();
	}
}
