package JavaCodingChallenge2.question3;

public class Test {
	public static void main(String[] args) {
		int i = 1;
		
		while(i <= 100) {
			while((i%2 == 0)) {
				System.out.println(i);
				i++;
			}
			i++;
		}
	}
}