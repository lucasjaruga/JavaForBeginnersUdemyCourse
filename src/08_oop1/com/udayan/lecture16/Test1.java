/**
 * Example to show that duplicate static, instance and local variables are not 
 * possible in the same scope. However, it is possible to declare a local variable with 
 * a name same as the static and instance variables of the class.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lecture16;

public class Test1 {
	public static int i1 = 10; //static variable
	public int i2 = 20; //instance variable
	
	//public int i1 = 30; //Compilation error, as variable i1 is already defined
	//public int i2 = 30; //Compilation error, as variable i2 is already defined
	
	public static void main(String [] args) {
		int i3 = 40;
		
		//int i3 = 50; //Compilation error for duplicate local variable
		
		/*
		{
			int i3 = 50; //Compilation error for duplicate local variable
		}
		*/
		
		//for(int i3 = 0; i3 < 2; i3++) {} //Compilation error for duplicate local variable
		
		int i1 = 60; //It is possible to create a local variable with the same name as the static variable of the class.
		int i2 = 70; //It is possible to create a local variable with the same name as the instance variable of the class.
	}
}
