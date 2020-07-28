/**
 * Example on handling RuntimeException (unchecked) by correcting program logic.
 * 
 * Check video Lecture 7 of Section 10 for details.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec07;

public class HandleRuntimeExceptions {
	private static String name;
	private static int [] arr = {1, 2, 3};
	
	public static void main(String[] args) {
		divide(10, 2);
		lengthOfString("Udayan");
		elementAtIndex(arr, 2);
	}
	
	private static void divide(int num, int den) {
		//To avoid ArithmeticException, check if den is not zero. If it is zero, then print the message and return.
		if(den == 0) {
			System.out.println("Denominator can't be 0.");
			return;
		}
		int res = num / den;
		System.out.println(res);
	}
	
	private static void lengthOfString(String str) {
		//To avoid NullPointerException, check if reference variable is not null.
		if(str != null)
			System.out.println("Length of passed string is: " + str.length());
	}
	
	private static void elementAtIndex(int [] arr, int index) {
		//To avoid NullPointerException, check if reference variable is not null.
		//To avoid ArrayIndexOutOfBoundsException, check the index boundary.
		if(arr != null && (index >=0 && index < arr.length))
			System.out.println("Element at index no: " + index + " is: " + arr[index]);
	}
	
	//NOTE: Though not covered in this example, to avoid ClassCastException, do instanceof check.
}
