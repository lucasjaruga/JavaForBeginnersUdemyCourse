/**
 * Example of instance (non-static) methods and static methods.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lecture08;

public class Exam {
	public String name;
	public int score1;
	public int score2;
	public int score3;
	
	public Exam(String n, int s1, int s2, int s3) {
		name = n;
		score1 = s1;
		score2 = s2;
		score3 = s3;
	}
	
	//Write an instance method to display following message.
	//Welcome <name>!
	//<name> will be replaced with name provided during instantiation.
	public void displayGreeting() {
		System.out.println("Welcome " + this.name + "!");
	}
	
	//Write an instance method, which returns the sum of the scores.
	public int getTotalScore() {
		int totalScore = this.score1 + this.score2 + this.score3;
		return totalScore;
	}
	
	//Write a method which accepts 3 int parameters and returns their sum.
	static public int calculateTotal(int s1, int s2, int s3) {
		int total = s1 + s2 + s3;
		return total;
	}
	
	//Write a static method which accepts two String and returns and array object
	//containing the passed Strings
	public static String[] convertToArray(String s1, String s2) {
		String [] arr = {s1, s2};
		return arr;
	}
}
