package JavaCodingChallenge3.question3;

public class Test {
	public static void main(String[] args) {
		int start = 0;
		int end = 100;
		
		for(int i = start; i <= end ; i++) {
			if(i%5 == 0) {
				System.out.print(i + " ");
			}
		}
	}
}