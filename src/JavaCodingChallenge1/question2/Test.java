package JavaCodingChallenge1.question2;

public class Test {
	public static void main(String[] args) {
		int a = 16;
		
		switch(a % 2) {
			default:
				System.out.println("ODD");
				break;
			case 0:
				System.out.println("EVEN");
				break;
		}
	}
}