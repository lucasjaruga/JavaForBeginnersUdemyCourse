/**
 * Code with finally block.
 * FileInputStream is closed at one place only: in finally block. This is better than the code in ReadFile1 class.
 * 
 * Whether code in try block completes successfully or throws some exception: finally block always gets executed.
 * 
 * Watch video lecture 9 of Section 10 for details.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile2 {
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
		} catch (FileNotFoundException ex) {
			System.out.println(ex);
		} catch (IOException ex) {
			System.out.println(ex);
		} catch(ArithmeticException ex) {
			System.out.println(ex);
		} finally {
			/* Close the file input stream. */
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
