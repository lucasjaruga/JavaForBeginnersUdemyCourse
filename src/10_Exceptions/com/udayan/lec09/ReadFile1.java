/**
 * Code without finally block.
 * FileInputStream is closed at 3 places: in try block and in catch blocks for IOException and ArithmeticException.
 * 
 * Watch video lecture 9 of Section 10 for details.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec09;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile1 {
	public static void main(String[] args) {
		readFile("D:/WORK/file1.txt");
	}
	
	private static void readFile(String filePath) {
		FileInputStream fis = null;
		try {
			/* OPEN the file input stream. */
			fis = new FileInputStream(filePath); //throws FileNotFoundException
			System.out.println("Found the file. Now start reading...");
			
			/* READ from file. */
			int i = fis.read();//throws IOException
			while(i != -1) { 
				//Uncomment below code to throw ArithmeticException
				/*if((char) i == 'G'){
					System.out.println(1/0);
				}*/
				System.out.print((char) i);
				i = fis.read();
			}
			System.out.println();
			System.out.println("Finished Reading the file.");
			
			/* Close the file input stream. */
			fis.close(); //throws IOException
			System.out.println("Closed the file.");
		} /*catch (FileNotFoundException ex) {
			System.out.println("File not found!");
		}*/ catch (IOException ex) {
			System.out.println(ex);
			/* Close the file input stream in case of IOException. */
			if(fis != null) {
				try {
					fis.close();
					System.out.println("Closed the file!");
				} catch (IOException e) {
					System.out.println(e);
				}
			}
		} catch(ArithmeticException ex) {
			System.out.println(ex);
			/* Close the file input stream in case of ArithmeticException. */
			if(fis != null) {
				try {
					fis.close();
					System.out.println("Closed the file!");
				} catch (IOException e) {
					System.out.println(e);
				}
			}
		} 
	}
}
