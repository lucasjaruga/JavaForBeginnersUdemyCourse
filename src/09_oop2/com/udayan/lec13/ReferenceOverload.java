/**
 * Example of reference type method overloading.
 * Which overloaded method to call is decided at compile time but which overriding method to call is decided at runtime.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec13;

public class ReferenceOverload {
	public void m1(Object obj) {
		System.out.println("Object verison");
		if(obj instanceof String) {
			String str = (String)obj;
			System.out.println(str.toUpperCase());
		} else {
			System.out.println(obj); //Invokes toString() method
		}
	}

	public void m1(String s) {
		System.out.println("String version");
		System.out.println(s.toUpperCase());
	}

	public static void main(String[] args) {
		ReferenceOverload ref = new ReferenceOverload();
		
		Object ob1 = new Object(); //1
		String ob2 = "abc"; //2
		Object ob3 = "def"; //3
		
		ref.m1(ob1); //4 Calls m1(Object)
		ref.m1(ob2); //5 Calls m1(String)
		ref.m1(ob3); //6 Calls m1(Object)
	}
}
