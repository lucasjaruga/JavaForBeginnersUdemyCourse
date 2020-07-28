/**
 * Class to Test Point class objects.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec07_1.test;

import com.udayan.lec07_1.Point;

public class TestPoint {
	public static void main(String[] args) {
		
		int x = 10;
		String name = "Udayan";
		
		Point p1 = new Point(2, 2);
		Point p2 = new Point(2, 3);
		
		System.out.println(x);
		System.out.println(name); //java.lang.String class overrides toString() method, and hence we get text in the output
		
		//Case 1: When Point class doesn't override toString() method, toString() method of Object class is invoked, 
		//which shows the output in the format: <fully qualified class name>@<hexadecimal value>, such as "com.udayan.lec07_1.Point@15db9742"
		//Case 2: When Point class overrides toString() method, meaningful output is shown on to the console, such as "Point: (2, 2)"
		System.out.println(p1); 
		System.out.println(p2);
		
		System.out.println(new Point(5, 6));//toString() method is called on the Point object, so "new Point(x, y)" works as well.
	}
}
