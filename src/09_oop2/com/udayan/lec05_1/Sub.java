/**
 * Class Sub hides the instance variable x of Super class.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec05_1;

public class Sub extends Super {
	public int x = 200; //hides the instance variable of parent class
	
	public int getSuperX() { //public instance method.
		return super.x; //super.x refers to instance variable x of Super class.
	}
}
