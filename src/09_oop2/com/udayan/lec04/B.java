/**
 * Example of INHERITANCE.
 * Class "B" is the Child / Sub / Derived class.
 * 
 * This class has its own instance variable "name" and getter and setter methods.
 * This class also overrides the parent class method: setValue(int).
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec04;

public class B extends A {
	private String name; //private instance variable

	public String getName() { //public getter
		return name;
	}
	
	public void setName(String name) { //public setter
		this.name = name;
	}
	
	@Override
	public void setValue(int value) { //Overriding method setValue
		System.out.println("setValue() method in class B.");
		super.setValue(value); //Calling the method of the parent class.
	}
}
