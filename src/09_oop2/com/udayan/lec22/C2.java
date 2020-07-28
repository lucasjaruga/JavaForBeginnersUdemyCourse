/**
 * Class C2 implements I3 [it has method m2()]. I3 extends I1 [it has method m1()]
 * As class C2 is not abstract, hence it must implement methods m1() and m2().
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec22;

public class C2 implements I3 {

	@Override
	public void m1() {
		System.out.println(I1.i); //static variable i is defined in I1 interface, so it is accessed using I1.i
		System.out.println(I3.i); //As I3 extends I1, hence static variable i of I1 can also be accessed using I3.i. But I1.i is recommended.
	}

	@Override
	public void m2() {

	}

}
