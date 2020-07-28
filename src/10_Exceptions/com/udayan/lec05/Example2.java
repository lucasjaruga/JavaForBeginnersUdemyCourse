/**
 * Used in Video Lecture 05 of Section 10.
 * We discussed following points in this lecture:
 * 1. syntax of multi-catch statement.
 * 2. Meaning of eating the exception.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec05;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Example2 {
	public static void main(String[] args) {
		for(int i = 1; i <= 3; i++) {
			
				try {
					m1(i);
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (ArrayIndexOutOfBoundsException | IOException e) {
					e.printStackTrace();
				}
		}
		
		System.out.println("Main ends.");
	}
	
	private static void m1(int var) throws FileNotFoundException, IOException, ArrayIndexOutOfBoundsException {
		switch (var) {
		case 1:
			throw new ArrayIndexOutOfBoundsException("case 1");
		case 2:
			throw new IOException("case 2");
		case 3:
			throw new FileNotFoundException("case 3");
		}
	}
}
