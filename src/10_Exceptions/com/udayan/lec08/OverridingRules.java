/**
 * In this example, we covered following Overriding rules:
 * 1. There are no rules related to Runtime Exceptions and Errors.
 * 
 * 2. If the parent class method does not declare to throw any checked exceptions, 
 *    then overriding method of child class must not declare a throws clause for checked exceptions.
 *    
 * 3. If the parent class method declares to throw a checked exceptions: then overriding method has following options:
 *    A. It may not declare to throw any checked exception.
 *    B. It may declare to throw any Runtime exceptions or errors.
 *    C. It may declare to throw the same checked exception thrown by parent class method.
 *    D .It may declare to throw the sub class of the exception thrown by parent class method.
 *    E. It cannot declare to throw the super class of the exception thrown by parent class method.
 * 
 * Check Video Lecture 8 of Section 10 for details.
 * NOTE: parent class can be a concrete class / an abstract class / an interface. I have used abstract class in this example.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec08;

import java.io.IOException;

abstract class Parent {
	public abstract void m1();
	public abstract void m2() throws RuntimeException;
	public abstract void m3() throws IOException;
}

public class OverridingRules extends Parent{
	/*
	 * Overriding method:
	 * 1. May not declare to throw any exception: public void m1() {} -> NO COMPILATION ERROR
	 * 2. May declare to throw any Runtime Exceptions: public void m1() throws ArrayIndexOutOfBoundsException {} -> NO COMPILATION ERROR
	 * 3. May declare to throw any Errors: public void m1() throws StackOverflowError {} -> NO COMPILATION ERROR
	 * 4. Must not declare any Checked exceptions: public void m1() throws IOException {} -> COMPILATION ERROR
	 */
	@Override
	public void m1() {
		System.out.println("m1");
	}
	
	/*
	 * Overriding method:
	 * 1. May not declare to throw any exception: public void m2() {} -> NO COMPILATION ERROR
	 * 2. May declare to throw any Runtime Exceptions: public void m2() throws ArithmeticException {} -> NO COMPILATION ERROR
	 * 3. May declare to throw any Errors: public void m2() throws Error {} -> NO COMPILATION ERROR
	 * 4. Must not declare any Checked exceptions: public void m2() throws IOException {} -> COMPILATION ERROR
	 */
	@Override
	public void m2() {
		System.out.println("m2");
	}
	
	/*
	 * Overriding method:
	 * 1. May not declare to throw any checked exception: public void m3() {} -> NO COMPILATION ERROR
	 * 2. May declare to throw any Runtime exceptions or errors: public void m3() throws ClassCastException {} -> NO COMPILATION ERROR
	 * 3. May declare to throw the same checked exception thrown by parent class method: public void m3() throws IOException {} -> NO COMPILATION ERROR
	 * 4. May declare to throw the sub class of the exception thrown by parent class method: public void m3() throws FileNotFoundException {} -> NO COMPILATION ERROR
	 * 5. Cannot declare to throw the super class of the exception thrown by parent class method: public void m3() throws Exception {} -> COMPILATION ERROR
	 */
	@Override
	public void m3() {
		System.out.println("m3");
	}
	
	public static void main(String[] args) {
		/*
		 * Reference type, obj1 is of OverridingRules type. 
		 * obj1.m3(); -> For this invocation, compiler checks the declaration of method m3() of OverridingRules class.
		 */
		OverridingRules obj1 = new OverridingRules();
		obj1.m3();
		
		/*
		 * Reference type, obj2 is of Parent type.
		 * obj2.m3(); -> For this invocation, compiler checks the declaration of method m3() of Parent class, 
		 * which declares to throw IOException (Checked Exception) and hence compiler is forcing to handle it.
		 */
		Parent obj2 = new OverridingRules();
		//obj2.m3(); //Compilation error.
	}

}
