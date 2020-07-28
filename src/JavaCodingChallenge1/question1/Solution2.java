package JavaCodingChallenge1.question1;

public class Solution2 {
	public static void main(String[] args) {
		int marks = 90;
		
		if(marks >= 60 && marks < 90) {
			System.out.println("Pass");
		} else if (marks >= 90) {
			System.out.println("Passed with Distinction");
		} else {
			System.out.println("Fail");
		}
	}
}