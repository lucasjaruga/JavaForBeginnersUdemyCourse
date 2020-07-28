package JavaCodingChallenge7.question2;

public class Question {
	public static void main(String[] args) {
		int tableOf = 7;
		int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for(int x : arr) {
			System.out.println(tableOf + " * " + x + " = " + tableOf*x);
		}
	}
}
