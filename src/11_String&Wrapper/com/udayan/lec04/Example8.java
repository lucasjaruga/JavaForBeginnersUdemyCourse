/**
 * In this example we covered some important methods of StringBuilder class.
 * 1. append(): various overloaded append methods are available.
 * 2. delete(int start, int end): start index is inclusive, end index is exclusive
 * 3. insert(): various overloaded insert methods are available.
 * 4. reverse(): Reverses the character sequence of StringBuilder object.
 * 5. toString(): Returns the String representation of StringBuilder object.
 * 
 * For details, watch video lecture 4 of Section 11.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec04;

public class Example8 {
	public static void main(String[] args) {
		/*
		 * StringBuilder sb = new StringBuilder();
		 * 
		 * //appends the passed parameter to the end sb.append("0123456789");
		 * 
		 * //deletes the characters starting at index 2 and ending at 4 - 1, which is 3
		 * sb.delete(2, 4);
		 * 
		 * //inserts the 2nd parameter 23 at index no. 2 sb.insert(2, 23);
		 * 
		 * //Reverses the character sequence of StringBuilder object sb.reverse();
		 * 
		 * //Invokes toString() method of StringBuilder object System.out.println(sb);
		 * 
		 * //Example of method chaining StringBuffer obj = new StringBuffer("a"); String
		 * a = obj.append("b").append("c").insert(0, true).delete(1,
		 * 3).reverse().toString().toUpperCase().trim();
		 * 
		 * System.out.println(a);
		 * 
		 * StringBuilder sc = new StringBuilder("SpaceStation"); sc.delete(5,
		 * 6).insert(5, " S").toString().toUpperCase(); System.out.println(sc);
		 */
        
        String s1 = new String("Java"); //Line 3
        String s2 = "JaVa"; //Line 4
        String s3 = "JaVa"; //Line 5
        String s4 = "Java"; //Line 6
        String s5 = "Java"; //Line 7
        
        int i = 1; //Line 9
		
		
	}
}
