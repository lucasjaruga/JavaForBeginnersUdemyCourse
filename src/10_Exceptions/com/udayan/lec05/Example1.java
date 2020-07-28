/**
 * Used in Video Lecture 05 of Section 10.
 * We discussed following points in this lecture:
 * 1. A method in Java can throw multiple exceptions.
 * 2. Order of catch blocks matter in case of related exceptions. Sub type must be handled before Super type.
 * 3. There should not be any statements between try and catch and two catch blocks.
 * 4. Not a good programming practice to catch super type (Exception or Throwable) for all the sub types.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec05;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Example1 {
	public static void main(String[] args) {
		
			for(int x = 1; x <= 3; x++) {
				try {
					m1(x);
				}  catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				} catch (ArrayIndexOutOfBoundsException e) {
					e.printStackTrace();
				}
			}
			System.out.println("Main ends");
		}
	
	/**
	 * This method declares three exceptions in throws clause.
	 * 
	 * @param var
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws ArrayIndexOutOfBoundsException
	 */
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