package JavaCodingChallenge2.question2;

public class Test {
	public static void main(String[] args) {
		int i = 1;
		final int upperBound = 100;
		int result = 0;
		
		while(i <= upperBound) {
			result += i++;
		}
		System.out.println(result);
	}
}