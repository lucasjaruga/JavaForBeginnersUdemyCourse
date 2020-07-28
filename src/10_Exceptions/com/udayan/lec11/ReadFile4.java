/**
 * Code with finally block.
 * FileInputStream is closed in the final block.
 * 
 * Whether code in try block completes successfully or throws some exception: finally block always gets executed at the end.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec11;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile4 {
	public static void main(String[] args) {
		readFile("D:/programming/file1.txt");
	}
	
	private static void readFile(String filePath) {
		try(FileInputStream fis = new FileInputStream(filePath); Scanner scanner = new Scanner(System.in)) {
			/* OPEN the file input stream. */
			System.out.println("Found the file. Press <ENTER> to start reading file...");
			scanner.nextLine();
			
			/* READ from file. */
			int i = fis.read();//throws IOException
			while(i != -1) { 
				System.out.print((char) i);
				i = fis.read();
			}
			System.out.println();
			System.out.println("Finished Reading the file.");
		} catch (IOException ex) {
			System.out.println("Cannot read from the file.");
		} 
	}
}
