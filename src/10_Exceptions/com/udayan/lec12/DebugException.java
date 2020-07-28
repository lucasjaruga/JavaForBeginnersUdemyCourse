/**
 * Class used to explain Exception Breakpoint.
 * 
 * Watch Video Lecture 12 of Section 10 for details.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec12;

public class DebugException {
	public static void main(String[] args) {
		check();
	}
	
	private static void check() {
		int num = 1000;
		int [] dens = {5, 10, 15, 0, 25, 30};
		
		try {
			for(int den : dens) {
				int res = num/den;
				System.out.println(res);
			}
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
}
