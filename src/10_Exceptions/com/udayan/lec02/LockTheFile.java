/**
 * This class locks the channel connected to D:/WORK/file1.txt file. It is helpful in showing
 * how to get IOException in ReadFile class.
 * 
 * For details check video lecture 2 of Section 10.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec02;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.Scanner;

public class LockTheFile {
	public static void main(String[] args) {
		try {
			//TODO: Change the file path according to your machine
			RandomAccessFile raf = new RandomAccessFile("D:/WORK/file1.txt", "rw");
	        FileChannel channel = raf.getChannel();
	        FileLock lock = channel.lock();
			System.out.println("File is locked.");
			
			Scanner scanner = new Scanner(System.in);
			System.out.print("Press <Enter> to continue.");
			scanner.nextLine();
			scanner.close();
			
			lock.release();
			System.out.println("Lock is released.");
			
			channel.close();
			raf.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		} catch (IOException e) {
			System.out.println("Cannot read from the file");
		}
	}
}
