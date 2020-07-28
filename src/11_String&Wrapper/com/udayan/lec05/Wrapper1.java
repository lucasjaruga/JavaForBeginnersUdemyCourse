/**
 * There are 8 wrapper classes in Java:
 * Byte, Short, Integer, Long, Float, Double, Character and Boolean.
 * 
 * 1. All of the wrapper classes except Character provide two constructors: one that takes a primitive of the type being constructed, 
 *    and one that takes a String representation of the type being constructed.
 *    For example, Integer class has Integer(int) & Integer(String)
 *                 Byte class has Byte(byte) & Byte(String)
 * 
 * 2. static valueOf method available in all wrapper classes can also be used to construct wrapper objects.
 *    For example, Byte.valueOf(byte) & Byte.valueOf(String)
 *    
 * 3. Each of the six numeric wrapper classes has six methods: byteValue(), shortValue(), intValue(), longValue(), 
 *    floatValue() and doubleValue(). 
 *    
 * 4. To convert String to primitive type all wrapper classes except Character has static parseXxx() method.
 *    For example, Byte.parseByte("10");
 *    			   Short.parseShort("20");
 *      		   Integer.parseInt("30");
 *                 Long.parseLong("40");
 *                 Float.parseFloat("50.1f");
 *                 Double.parseDouble("100.1");
 *                 Boolean.parseBoolean("tRue");
 *                 
 * For details, watch video Lecture 5 of Section 11.
 *                 
 * @author Udayan Khattry
 */
package com.udayan.lec05;

public class Wrapper1 {
	public static void main(String[] args) {
		Byte b1 = new Byte((byte)127);
		System.out.println(b1);
		
		Byte b2 = new Byte("-128");
		System.out.println(b2);
		
		Integer i1 = new Integer("2000");
		System.out.println(i1);
		
		Byte b3 = Byte.valueOf((byte)1);
		System.out.println(b3);
		
		Byte b4 = Byte.valueOf("127");
		System.out.println(b4);
		
		int num = i1.intValue();
		System.out.println(num);
		
		byte val1 = i1.byteValue();
		System.out.println(val1);
		System.out.println((byte) 2000);
		
		System.out.println(b3.doubleValue());
		
		int i = Integer.parseInt("1000");
		System.out.println(i);
		
		boolean flag = Boolean.parseBoolean("tRue");
		System.out.println(flag);
	}
}
