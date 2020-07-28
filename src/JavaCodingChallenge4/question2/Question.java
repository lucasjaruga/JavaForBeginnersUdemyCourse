package JavaCodingChallenge4.question2;

public class Question {
	public static void main(String[] args) {
		int i = 1;
		
		while(i <= 7) {
			int j = 1;
			
			while(j <= i) {
				System.out.print(i);
				++j;
			}
			++i;
			System.out.println();
		}
	}
}
