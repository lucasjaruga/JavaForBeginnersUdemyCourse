/**
 * Position of nested try block matters.
 * 
 * Watch video Lecture 6 of Section 10 for details.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec06;

public class Example6 {
	public static void main(String[] args) {
		try { // outer try
			for (int i = 1; i <= 2; i++) {
				try { // inner try
					m1(i);
				} catch (ArrayIndexOutOfBoundsException ex) {
					System.out.println(ex);
				}
			}
		} catch (ArithmeticException ex) {
			System.out.println(ex);
		}
		System.out.println("Main ends.");
	}
	
	private static void m1(int var) {
		switch (var) {
		case 1:
			System.out.println(1/0);
			break;
		case 2:
			int [] arr = new int[2];
			System.out.println(arr[2]);
			break;
		}
	}
}
