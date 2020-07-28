/**
 * Method m1() is not overloaded in this case.
 * As byte, short, int, long and char are compatible with double type
 * so m1(double) is invoked for all the seven calls in main method.
 *  
 * @author Udayan Khattry
 */
package com.udayan.lec11;

public class PrimitiveOverload2 {

	public void m1(double i) {
		System.out.println("double version is invoked: " + i);
	}

	public static void main(String[] args) {
		PrimitiveOverload2 obj = new PrimitiveOverload2();
		byte i1 = 1;
		short i2 = 2;
		int i3 = 3;
		long i4 = 4;
		double i5 = 5;
		char c = 97;
		obj.m1(i1); //invoke m1(double)
		obj.m1(i2); //invoke m1(double)
		obj.m1(i3); //invoke m1(double)
		obj.m1(i4); //invoke m1(double)
		obj.m1(i5); //invoke m1(double)
		obj.m1(c); //invoke m1(double)
		obj.m1(100); //invoke m1(double)
	}
}
