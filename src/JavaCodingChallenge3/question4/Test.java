package JavaCodingChallenge3.question4;

public class Test {
	public static void main(String[] args) {
		for(int i = 200; i >= 5; i--) {
			if((i/5)*5 == i) {
				System.out.println(i);
			}
		}
	}
}

// 200 ---> 0
/*
 * 6/5 = 1,2
 *	5/5 = 1
 * 10/5 = 2
 * 15/5 = 3 
 */
