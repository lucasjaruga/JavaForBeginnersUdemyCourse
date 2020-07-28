package JavaCodingChallenge1.question1;

public class Solution1 {
	
	public static void main(String[] args) {
		int marks = 90;
		
		if(marks < 60) {
			System.out.println("fail");
		}
		
		if(marks >= 60 && marks < 90) {
			System.out.println("Pass");
		}
		
		if(marks >= 90) {
			System.out.println("Pass with distintion");
		}
	}
}