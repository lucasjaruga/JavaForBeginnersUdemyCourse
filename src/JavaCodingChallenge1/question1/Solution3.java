package JavaCodingChallenge1.question1;

public class Solution3 {
	public static void main(String[] args) {
		int marks = 90;
		
		if(marks >= 90) {
			System.out.println("Passed with Distinction");
		} else {
			if(marks >= 60) {
				System.out.println("Pass");
			} else {
				System.out.println("Fail");
			}
		}
	}
}