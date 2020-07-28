/**
 * Following methods of String class were covered Lecture 9 of Section 7:
 * length()
 * charAt(int)
 * equals(Object)
 * equalsIgnoreCase(String)
 * toUpperCase()
 * toLowerCase()
 * trim()
 * 
 * Following methods of String class are covered in this lecture:
 * concat(String)
 * compareTo(String)
 * compareToIgnoreCase(String)
 * replace(char, char)
 * substring(int)
 * substring(int, int)
 * startsWith(String)
 * endsWith(String)
 * 
 * For details, watch video lecture 3 of Section 11.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec03;

public class Example6 {
	public static void main(String[] args) {
		//1. public String concat(String s)
		String s1 = "Cricket ";
		System.out.println("01-> " + (s1.concat("Match")));
		
		//+ and += operators perform functions similar to the concat()
		System.out.println("02-> " + (s1 + "Match"));
		
		s1 += "Match";
		System.out.println("03-> " + s1);
		
		//2. public int compareTo(String anotherString)
		System.out.println("04-> " + ("ABCDE".compareTo("ABC")));
		System.out.println("05-> " + ("ABC".compareTo("ABCDE")));
		System.out.println("06-> " + ("Abc".compareTo("ABC"))); 
		System.out.println("07-> " + ("ABC".compareTo("abc")));
		System.out.println("08-> " + ("ABC".compareTo("ABC")));
		
		char small = 'b';
		char cap = 'B';
		System.out.println("09-> " + (small - cap));
		
		//3. public int compareToIgnoreCase(String str)
		System.out.println("10-> " + ("ABC".compareToIgnoreCase("abc")));
		
		//4. public String replace(char old, char new)
		String s2 = "banana";
		System.out.println("11-> " + (s2.replace('a', 'A')));
		
		//5. 
		//public String substring(int begin) 
		//public String substring(int begin, int end)
		String s3 = "abcdefghijk";
		System.out.println("12-> " + (s3.substring(4)));
		System.out.println("13-> " + (s3.substring(4, 7)));
		
		//6. public boolean startsWith(String prefix)
		String s4 = "January";
		System.out.println("14-> " + (s4.startsWith("Jan")));
		System.out.println("15-> " + (s4.startsWith("Jana")));
		System.out.println("16-> " + (s4.startsWith("jan")));
		
		//7. public boolean endsWith(String suffix)
		System.out.println("17-> " + (s4.endsWith("ry")));
		System.out.println("18-> " + (s4.endsWith("RY")));

	}
}
