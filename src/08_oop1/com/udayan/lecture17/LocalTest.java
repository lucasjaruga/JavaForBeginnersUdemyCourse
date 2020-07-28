/**
 * This example was used to discuss following points:
 * 1. Local variables are not initialized to default values.
 * 2. Local variables needs to be assigned with some values before they can be used.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lecture17;

public class LocalTest {
	public static void main(String[] args) {
		//i is a local variable
		int i = 0; //Variable i is declared and initialized to 0
		System.out.println(i); //Variable i must be initialized before its value is accessed
		
		//str is a local variable
		String str;
		//Compiler is 100% sure that either if or else block will execute and thus str will be definitely initialized
		if(i == 0) {
			str = "A";
		} else {
			str = "B";
		}
		System.out.println(str); //Variable str must be initialized before its value is accessed
	}
}
