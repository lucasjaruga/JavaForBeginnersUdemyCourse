/**
 * One more example on Dynamic Polymorphism.
 * 
 * In this example, we learned about Explicit casting, its syntax and risks involved with it.
 * We also learned about usage of instanceof operator with Explicit Casting.
 * 
 * NOTE: Classes Parent and Child are declared in Polymorphism1.java file and these classes are declared with default
 * access modifier and hence are accessible within com.udayan.lec12 package.
 * This class is also declared in com.udayan.lec12 package and hence no issues in accessing Parent and Child classes.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec12;

public class Polymorphism2 {
	public static void main(String[] args) {
		//Case 1: obj1 is referring to an instance of Child class.
		Object obj1 = (Object) new Child(); //Implicit Casting, Compiler adds casting to Object type, if not provided.
		
		//Case 2: obj1 is referring to an instance of Object class.
		//Object obj1 = new Object();
		
		obj1.toString(); //No issues in Case 1 and Case 2
		//obj1.m1(); //Compilation error
		//obj1.m2(); //Compilation error
		
		//For Case 1; (obj1 instanceof Child) evaluates to true, hence the statements inside if block are executed
		//For Case 2; (obj1 instanceof Child) evaluates to false, hence the statements inside if block are not executed
		if(obj1 instanceof Child){
			Child obj = (Child)obj1; //Explicit Casting
			obj.m1();
			obj.m2();
		}
	}
}
