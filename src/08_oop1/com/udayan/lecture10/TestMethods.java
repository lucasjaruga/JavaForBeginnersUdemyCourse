/**
 * Example to show how to call methods of the same class.
 * static methods can only invoke other static methods of same class, whereas
 * non-static methods can invoke both static and non-static methods of same class.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lecture10;

class Methods {
	public static void m1() {
		System.out.println("static method m1().");
	}
	
	public static void m2() {
		System.out.println("static method m2().");
		//either use Methods.m1() or only m1() as both m1() and m2() are in same class.
		Methods.m1(); //calling static method
		//this.m3();//instance method can't be invoked from static method
	}
	
	public void m3() {
		System.out.println("instance method m3().");
	}
	
	public void m4() {
		System.out.println("instance method m4().");
		//either use this.m3() or only m3() as both m3() and m4() are in same class.
		this.m3(); //calling instance method
		//either use Methods.m1() or only m1() as both m1() and m4() are in same class.
		Methods.m1(); //calling static method
	}
}

public class TestMethods {
	public static void main(String[] args) {
		//Can be invoked by using Methods.m2(); syntax only. 
		//As main(String []) method is in TestMethods class,
		//whereas method m2() is in Methods class.
		Methods.m2();
		System.out.println("--------------------");
		Methods obj = new Methods();
		obj.m4();
	}
}
