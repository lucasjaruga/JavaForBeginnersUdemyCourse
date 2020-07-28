/**
 * Example to show multilevel inheritance.
 * Class SubChild extends from Child class.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec07_2;

public class SubChild extends Child {
	public void m3() {
		System.out.println("In SubChild:m3()");
	}
	
	//Class SubChild inherits all the visible methods of Child class.
	//Class SubChild inherits all the visible methods of Parent class (as Child extends Parent)
	//Class SubChild inherits all the visible methods of Object class as well (as Parent extends Object)
}
