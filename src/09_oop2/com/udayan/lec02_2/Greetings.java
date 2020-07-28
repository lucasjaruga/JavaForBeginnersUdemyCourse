/**
 * All four access modifiers can be applied to the members (variables, constructors and methods) of the class.
 * But in this example we are covering only three: public, default and private, 
 * protected will be covered later.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec02_2;

public class Greetings {
	public String msg; //instance variable
	
	public Greetings(String msg) { //constructor
		this.msg = msg;
	}
	
	public static void sayHello() { //static method
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		/*
		 * Below 3 statements are accessible for public, default and private access specifiers. 
		 */
		Greetings g = new Greetings("Weclocme!"); //Calling the constructor
		
		System.out.println(g.msg); //Accessing instance variable
		
		Greetings.sayHello(); //Invoking method
	}
}

