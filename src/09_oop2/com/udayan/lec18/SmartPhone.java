/**
 * SmartPhone extends from Electronics and implements operate() method.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec18;

public class SmartPhone extends Electronics {
	@Override
	public void operate() {
		if (isOn()) {
			System.out.println("Place a call");
		} else {
			System.out.println("Switch on you Smart Phone");
		} 
	}
}
