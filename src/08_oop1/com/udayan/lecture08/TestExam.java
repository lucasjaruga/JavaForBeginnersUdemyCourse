/**
 * This class invokes the static and non-static methods of com.udayan.lecture08.Exam class.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lecture08;

public class TestExam {
	public static void main(String[] args) {
		Exam e1 = new Exam("Jack", 84, 75, 90);
		e1.displayGreeting();
		System.out.println("---------------------------");
		
		int res1 = e1.getTotalScore();
		System.out.println(res1);
		System.out.println("---------------------------");
		
		int res2 = Exam.calculateTotal(10, 20, 30);
		System.out.println(res2);
		System.out.println("---------------------------");
		
		int res3 = Exam.calculateTotal(e1.score1, e1.score2, e1.score3);
		System.out.println(res3);
		System.out.println("---------------------------");
		
		String [] arr = Exam.convertToArray("one", "two");
		for(String str : arr) {
			System.out.println(str);
		}
		
	}
}
