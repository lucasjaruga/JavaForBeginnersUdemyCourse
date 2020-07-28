/**
 * This example was used to explain following overriding rules.
 * 1. The parent class method must be accessible in child class to be overridden. private method cannot be overridden.
 * 2. The argument list in overriding method must exactly match that of the overridden method.
 * 3. If parent class method returns primitive type, then return type must be same in overriding method.
 *    If parent class method returns reference type, then overriding method must return either same type or a subtype.
 * 4. Access modifier in overriding method cannot be more restrictive.
 * 
 * Watch Video lecture no. 15 of Section 9 for details.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec15;

class Super {
	protected int m1(Object s1) {
		return 2;
	}
	
	public Object m2() {
		//This method should return Object type but we are returning String instance, which is same as polymorphic behavior.
		//parent class reference can easily refer to any instance of child class
		//String extends Object hence following statement is correct:
		//Object obj = "Super";
		return "Super"; 
	}
}

class Sub extends Super {
	protected int m1(Object s1) {
		return 3;
	}
	
	public Object m2() {
		return "Sub";
	}
}

public class OverridingRules {
	public static void main(String[] args) {
		Super obj = new Sub();
		int i1 = obj.m1("test");
	}
}
