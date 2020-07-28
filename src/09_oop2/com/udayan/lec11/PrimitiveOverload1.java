/**
 * Method overloading with primitive types.
 * In this examples we have 6 overloaded methods: all have same name: m1; but accept different parameters.
 * Best possible match is invoked in case of method overloading.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec11;

public class PrimitiveOverload1 {
	public void m1(char i) {
		System.out.println("char version is invoked: " + i);
	}
	public void m1(byte i) {
		System.out.println("byte version is invoked: " + i);
	}
	public void m1(short i) {
		System.out.println("short version is invoked: " + i);
	}
	public void m1(int i) {
		System.out.println("int version is invoked: " + i);
	}
	public void m1(long i) {
		System.out.println("long version is invoked: " + i);
	}
	public void m1(double i) {
		System.out.println("double version is invoked: " + i);
	}

	public static void main(String[] args) {
		PrimitiveOverload1 obj = new PrimitiveOverload1();
		byte i1 = 1;
		short i2 = 2;
		int i3 = 3;
		long i4 = 4;
		double i5 = 5;
		char c = 97;
		obj.m1(i1); //invoke m1(byte)
		obj.m1(i2); //invoke m1(short)
		obj.m1(i3); //invoke m1(int)
		obj.m1(i4); //invoke m1(long)
		obj.m1(i5); //invoke m1(double)
		obj.m1(c); //invoke m1(char)
		obj.m1(100); //100 is an int literal, so m1(int) is invoked
	}
}
