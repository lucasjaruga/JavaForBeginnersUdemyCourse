/**
 * This example shows the difference between Primitive type and Reference type Arrays.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec16;

public class PrimitiveVsReferenceArray {
	public static void main(String[] args) {
		byte b = (byte) 1; //Explicit casting not needed
		int i = (int) b; //Explicit casting not needed
		
		byte [] arr1 = {1, 2, 3};
		//int [] arr2 = (int []) arr1; //Compilation error as byte [] object cannot be assigned to int [] reference variable.
		int [] arr2 = {100, 200, 300};
		
		System.out.println(arr1 instanceof byte []); // -> true
		System.out.println(arr1 instanceof Object); // -> true
		System.out.println(arr2 instanceof int []); // -> true
		System.out.println(arr2 instanceof Object); // -> true
		//System.out.println(arr1 instanceof int []); //Compilation error as byte [] and int [] are not compatible, they are not in multilevel inheritance relationship.
		
		String str = "JAVA";
		Object obj = (Object) str; //Explicit casting not needed, subtype String object can be assigned to supertype Object. This is Polymorphism.
		
		String [] arr3 = {"J", "A", "V", "A"};
		Object [] arr4 = (Object []) arr3; //Explicit casting not needed. String [] type extends from Object [] type, 
										   //and hence subtype String [] can be assigned to supertype Object []. This is Polymorphism.
		
		System.out.println(arr3 instanceof String []); // -> true
		System.out.println(arr3 instanceof Object []); // -> true
 	}
}
