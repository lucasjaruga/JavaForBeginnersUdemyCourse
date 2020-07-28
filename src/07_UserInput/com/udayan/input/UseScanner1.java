/**
 * This class shows how to accept user input using java.util.Scanner class.
 * In this example we accepted all the primitive types as input except char.
 * 
 * @author Udayan Khattry
 */
package com.udayan.input;

import java.util.Scanner;

public class UseScanner1 {
	public static void main(String[] args) {
		//Create a Scanner object.
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a byte value: ");
		byte b1 = scanner.nextByte(); //Accept byte value from user
		
		System.out.print("Enter a short value: ");
		short s1 = scanner.nextShort(); //Accept short value from user
		
		System.out.print("Enter a int value: ");
		int i1 = scanner.nextInt(); //Accept int value from user
		
		System.out.print("Enter a long value: ");
		long l1 = scanner.nextLong(); //Accept long value from user
		
		System.out.print("Enter a float value: ");
		float f1 = scanner.nextFloat(); //Accept float value from user
		
		System.out.print("Enter a double value: ");
		double d1 = scanner.nextDouble(); //Accept double value from user
		
		System.out.print("Enter true/false: ");
		boolean flag = scanner.nextBoolean(); //Accept boolean value from user
		
		scanner.close(); //Close the scanner
		//int i2 = scanner.nextInt(); //Throws java.lang.IllegalStateException
		
		System.out.println("---------------------------");
		System.out.println("You entered following values: ");
		System.out.println("byte value = " + b1);
		System.out.println("short value = " + s1);
		System.out.println("int value = " + i1);
		System.out.println("long value = " + l1);
		System.out.println("float value = " + f1);
		System.out.println("double value = " + d1);
		System.out.println("boolean value = " + flag);
	}
}
