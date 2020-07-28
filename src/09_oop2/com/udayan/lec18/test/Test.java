/**
 * This class uses abstract class (Electronics) reference to refer to instance of 
 * concrete classes (SmartPhone, Television and Camera).
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec18.test;

import com.udayan.lec18.Camera;
import com.udayan.lec18.Electronics;
import com.udayan.lec18.SmartPhone;
import com.udayan.lec18.Television;

public class Test {
	public static void main(String[] args) {
		Electronics e1 = new SmartPhone();
		e1.powerOn();
		e1.operate();
		
		Electronics e2 = new Television("Star Sports");
		e2.powerOn();
		e2.operate();
		
		Electronics e3 = new Camera();
		e3.powerOn();
		e3.operate();
		
		//Compilation error for new Electronics(); as abstract classes cannot be instantiated.
//		Electronics e4 = new Electronics();
//		e4.powerOn();
//		e4.operate();
	}
}
