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

public class ReadFile3 {
	public static void main(String[] args) {
		readFile("D:/programming/file1.txt");
	}
	
	private static void readFile(String filePath) {
		FileInputStream fis = null;
		try {
			/* OPEN the file input stream. */
			fis = new FileInputStream(filePath); //throws FileNotFoundException
			System.out.println("Found the file, now start reading...");
			
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
		} finally {
			/* Close the file input stream. */
			if(fis != null) {
				try {
					fis.close();
					System.out.println("Closed the file!");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
