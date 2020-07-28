/**
 * This class is used to explain the scope and lifetime of various Local variables.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lecture15;

public class LocalVariableScope {
	public static void main(String[] args) {
		String msg = "Welcome";
		
		for(int i = 0; i < 2; ) {
			System.out.println(++i);
		}
		
		printMsg(msg); //call printMsg(String) method
		
		{
			int i = 100;
			System.out.println(i);
		}
		
	} //main ends
	
	public static void printMsg(String str) {
		System.out.println(str);
	} //printMsg(String) ends
	
} //class ends
