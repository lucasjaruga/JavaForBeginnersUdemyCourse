/**
 * This example shows how to read a text file using java.io package.
 * FileInputStream class is used for reading the file.
 * 
 * Java Exception Handling framework separates the business logic from error handling code.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {
	public static void main(String[] args) {
		readFile("D:/WORK/file1.txt"); //TODO: Change the file path according to your machine
	}
	
	private static void readFile(String filePath) {
		try {
			/* OPEN the file. */
			FileInputStream fis = new FileInputStream(filePath); //throws FileNotFoundException
			System.out.println("Found the file. Now start reading...");
			
			/* READ from file. */
			int i = fis.read(); //throws IOException
			while(i != -1) { 
				System.out.print((char) i);
				i = fis.read(); //throws IOException
			}
			System.out.println();
			System.out.println("Finished Reading the file.");
			
			/* Close the file. */
			fis.close(); //throws IOException
			System.out.println("Closed the file.");
		} catch (FileNotFoundException ex) {
			System.out.println("File not found!");
		} catch (IOException ex) {
			System.out.println("Cannot read from the file / cannot close the file.");
		}
	}
}
