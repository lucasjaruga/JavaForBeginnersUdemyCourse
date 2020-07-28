package com.udayan.lec11;

import java.util.Scanner;

public class TestScanner {
	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)) {
			System.out.println("Type a word and press <ENTER>: ");
			String s = scanner.nextLine();
			System.out.println(s);
		}
	}
}