package JavaCodingChallenge2.question4;

public class Question {
	public static void main(String[] args) {
		int start = 1;
		int end = 11;		

		while(start <= end) {
			if(start%2 != 0) { // if number is odd then print it
				System.out.print(start);
			} else { // at this point it means that number is even
				if(start < end) { // if it's not last number then print comma
					System.out.print(", ");
				}
			}
		start++;
		}
	}
}