/**
 * Example to show shadowing of instance variable by local variable and how to access instance variable
 * in such cases.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lecture17;

public class Counter {
	public int count; //instance variable
	
	public void increment() {
		count = count + 1; //instance variable is accessed using short hand notation.
							// Compiler adds this and dot operator over here as there is no conflict with local variable.
	}
	
	public void setCounter(int count) { //local variable count shadows instance variable
		this.count = count; //Full name (this.count) refers to instance variable and short hand (name) refers to local variable.
	}
	
	public void print() {
		System.out.println(count); //instance variable is accessed using short hand notation.
		System.out.println(this.count); //instance variable is accessed using this reference.
		int count = 500; //local variable count shadows instance variable count
		System.out.println(count); //Short hand notation points to local variable and as local variable name conflicts with instance variable name,
									//compiler doesn't add this and dot operator over here.
		System.out.println(this.count); //instance variable is accessed using full name
	}
	
	public static void main(String [] args) {
		Counter ctr = new Counter();
		ctr.print();
		
		ctr.increment();
		System.out.println("After increment: " + ctr.count);
		
		ctr.setCounter(11);
		System.out.println("After setCounter: " + ctr.count);
		
	}
}
