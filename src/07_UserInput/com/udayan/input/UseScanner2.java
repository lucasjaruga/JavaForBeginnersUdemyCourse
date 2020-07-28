/**
 * This class shows how to accept String from user using java.util.Scanner class.
 * 
 * @author Udayan Khattry
 */
package com.udayan.input;

import java.util.Scanner;

public class UseScanner2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Provide a sentence and I will repeat it:");
		
		//Accept a series of texts/digits until newline character is found.
		String str = scanner.nextLine();
		scanner.close();//Close the scanner
		
		System.out.println(str);
	}
}
