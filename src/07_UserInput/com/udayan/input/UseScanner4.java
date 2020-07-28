/**
 * This class shows a workaround on accepting char value using Scanner class.
 * 
 * @author Udayan Khattry
 */
package com.udayan.input;

import java.util.Scanner;

public class UseScanner4 {
	public static void main(String[] args) {
		//Creates Scanner object linked to keyboard.
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a char value: ");
		//Accept a series of texts/digits until newline character is found.
		String str = scanner.nextLine();
		scanner.close(); //Close the scanner, no more input is expected.
		
		//If text length is not equal to 1, then display error message to the user
		//and end the program.
		if(str.length() != 1) {
			System.out.println("Please provide only one character.");
			return;
		}
		
		//Extract character at 0th index from String object referred by str.
		char value = str.charAt(0);
		
		//Display value entered by the user.
		System.out.println("char value provided by user: " + value);
	}
}
