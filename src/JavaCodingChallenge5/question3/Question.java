package JavaCodingChallenge5.question3;

public class Question {
	public static void main(String[] args) {
		
		char x = 'W'; // char which I'm looking for
		
		char [] arr = new char[] {'A', 'Z', 'B', 'N', 'P', 'T', 'X', 'C'};
		for(int i = 0; i < arr.length; i++) {
			if(x == arr[i]) {
				System.out.println(x + " found!");
				break;
			}
		}
		System.out.println(x + " not found!");
	}
}