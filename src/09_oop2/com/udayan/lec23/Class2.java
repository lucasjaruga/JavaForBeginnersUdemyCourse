/**
 * Class2 implements both I1 and I2. 
 * Both the interfaces contain default method m2() with same signature.
 * If Class2 does not override method m2(), then we get compilation error.
 * So it is compulsory for this class to override method m2().
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec23;

public class Class2 implements I1, I2 {

	@Override
	public void m1() {
		System.out.println("Class2: m1()");
	}
	
	@Override
	public void m2() { //It is compulsory to override m2() as both the interface I1 & I2 have default method m2 with same signature
		System.out.println("Class2: m2()");
		I1.super.m2(); //invoke default method m2() of I1
		I2.super.m2(); //invoke default method m2() of I2
	}

	public static void main(String[] args) {
		I1 obj = new Class2();
		obj.m1(); //invokes overriding method m1() of Class2
		obj.m2(); //invokes overriding method m2() of Class2
		//I1.super.m2(); //Compilation error as super cannot be used in static context
		
		//From outside interface, static method of the interface can only be invoked
		//by using <Interface_name>.<method_name>
		I2.m3(); //Calling static interface method.
		//Even though Class2 implements I2, but m3() cannot be invoked by using Class2
		//Class2.m3(); //Compilation error.
	}

}
