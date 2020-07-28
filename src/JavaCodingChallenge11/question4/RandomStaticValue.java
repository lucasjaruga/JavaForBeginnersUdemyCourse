package JavaCodingChallenge11.question4;

// import java.security.SecureRandom;

public class RandomStaticValue {
	public static int value = new java.security.SecureRandom().nextInt(6) + 1;
	
	/*
	 * static { SecureRandom generateNumber = new SecureRandom(); value =
	 * generateNumber.nextInt(6) + 1; }
	 */
	
	public static void main(String[] args) {
		System.out.println("Random value between 1 and 6 is: " + value);
	}
}