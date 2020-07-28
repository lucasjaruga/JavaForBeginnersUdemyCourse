/**
 * This class shows the problem of using nextLine() method after other next methods.
 * It also shows how to resolve this problem.
 * 
 * @author Udayan Khattry
 */
package com.udayan.input;

import java.util.Scanner;

public class UseScanner3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int num1  = scanner.nextInt();
		
		System.out.print("Enter second number: ");
		int num2 = scanner.nextInt();
		
		//Below statement is to consume newline character (\n) left by previous nextInt() method.
		scanner.nextLine();
		
		System.out.print("Provide a String: ");
		String str = scanner.nextLine();
		
		scanner.close(); //Close the scanner
		
		System.out.print("OUTPUT:" + num1 + ":" + num2 + ":" + str + ":");
	}
}
