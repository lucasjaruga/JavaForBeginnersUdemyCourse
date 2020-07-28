/**
 * Class to test the visibility of the members of com.udayan.lec02_2.Greetings class.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec02_2.test;

import com.udayan.lec02_2.Greetings;

public class TestGreetings2 {
	public static void main(String[] args) {
		/*
		 * Below 3 statements are accessible only for public access specifier. 
		 */
		Greetings g = new Greetings("Good Morning!"); //Calling the constructor
		
		System.out.println(g.msg); //Accessing instance variable
		
		Greetings.sayHello(); //Invoking method
	}
}

