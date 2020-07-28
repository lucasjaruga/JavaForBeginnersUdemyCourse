/**
 * In order to save memory, two instances of the following wrapper objects, which are created through boxing, 
 * will always be same when their primitive values are same:
 *   Boolean
 *   Character from \u0000 to \u007f (7f is 127 in decimal)
 *   Byte
 *   Short and Integer from -128 to 127
 * 
 * For details, watch video lecture 6 of Section 11.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec06;

public class Wrapper3 {
	public static void main(String[] args) {
		Integer i1 = 500;
		Integer i2 = 500;
		System.out.println("i1 == i2: " + (i1 == i2)); //false
		
		Integer i3 = 100;
		Integer i4 = 100;
		System.out.println("i3 == i4: " + (i3 == i4)); //true
		
		Boolean b1 = true;
		Boolean b2 = true;
		System.out.println("b1 == b2: " + (b1 == b2)); //true
		
		Character c1 = 'A';
		Character c2 = 'A';
		System.out.println("c1 == c2: " + (c1 == c2)); //true
		 
		Byte x1 = -128;
		Byte x2 = -128;
		System.out.println("x1 == x2: " + (x1 == x2)); //true
		
		Short s1 = 127;
		Short s2 = 127;
		System.out.println("s1 == s2: " + (s1 == s2)); //true
		
		Integer i5 = new Integer(20);
		Integer i6 = new Integer(20);
		System.out.println("i5 == i6: " + (i5 == i6)); //false
		
		int var1 = 1000;
		int var2 = 1000;
		System.out.println("var1 == var2: " + (var1 == var2)); //true
		
		Integer var3 = 1000;
		Integer var4 = 1000;
		System.out.println("var3 == var4: " + (var3 == var4)); //false
		
		System.out.println(var3.equals(var4)); //true
	}
}
