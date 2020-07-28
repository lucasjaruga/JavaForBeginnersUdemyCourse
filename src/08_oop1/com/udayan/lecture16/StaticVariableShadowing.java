/**
 * Example to show shadowing of static variable by local variable and how to access static variable
 * in such cases.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lecture16;

public class StaticVariableShadowing {
	public static int i = 2017; //static variable
	
	public static void main(String [] args) {
		System.out.println(StaticVariableShadowing.i); //static variable is accessed using full name
		System.out.println(i); //static variable is accessed using short hand notation. 
								// Compiler adds <class_name> and dot operator over here as there is no conflict with local variable.
								
		for(int i = 0; i < 1 ; i++) { //local variable i shadows static variable i
			System.out.println(i); //Short hand notation points to local variable and as local variable name conflicts with static variable name,
									//compiler doesn't add <class_name> and dot operator over here.
			System.out.println(StaticVariableShadowing.i); //static variable is accessed using full name
		}
		
		System.out.println(i); //No-conflict with local variable name, hence compiler adds <class_name> and dot operator over here.
		
		{
			String i = "Hello"; //local variable i shadows static variable i
			System.out.println(i);//Short hand notation points to local variable and as local variable name conflicts with static variable name,
								//compiler doesn't add <class_name> and dot operator over here.
			System.out.println(StaticVariableShadowing.i); //static variable is accessed using full name
		}
		
		double i = 15.67; //local variable i shadows static variable i
		System.out.println(i); //Short hand notation points to local variable and as local variable name conflicts with static variable name,
							//compiler doesn't add <class_name> and dot operator over here.
		System.out.println(StaticVariableShadowing.i); //static variable is accessed using full name
	}
}
