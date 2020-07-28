/**
 * Initialization blocks example.
 * This class discusses the syntax of static initialization block and instance initialization block.
 * This class also explains the need of static and instance initialization blocks.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lecture18;

import java.security.SecureRandom;

public class InitializationBlocks1 {
	public int x; //instance variable
	public static int y; //static variable
	
	/**
	 * No-arg Constructor.
	 * 
	 * We can write complex logic inside the constructor.
	 */
	public InitializationBlocks1() {
		SecureRandom random = new SecureRandom();
		int temp = random.nextInt(10);
		System.out.println(temp);
		x = temp;
	}
	
	/**
	 * Parameterized Constructor.
	 * 
	 * @param x to assign to instance variable x.
	 */
	public InitializationBlocks1(int x) {
		this.x = x; //Instance variable is accessed by using this reference
	}
	
	/**
	 * Static initialization block.
	 * This block allows to write complex logic required for initializing static variables.
	 */
	static {
		SecureRandom random = new SecureRandom();
		int temp = random.nextInt(10);
		System.out.println(temp);
		y = temp;
	}
	
	/**
	 * Instance initialization block.
	 * This block is used to write codes, common to all the constructors.
	 */
	{
		x = 50;
		System.out.println();
	}
}
