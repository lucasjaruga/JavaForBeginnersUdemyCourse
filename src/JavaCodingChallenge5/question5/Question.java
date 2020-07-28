package JavaCodingChallenge5.question5;

public class Question {
	public static void main(String[] args) {
		int x = 15; // number of numbers in Fibonacci sequence
		
		int [] Fib = new int[x];
		Fib[0] = 0;
		Fib[1] = 1;
		
		for(int i = 2; i < Fib.length; i++) {
			Fib[i] = Fib[i-2] + Fib[i-1]; 
		}
		
		for(int a : Fib) {
			System.out.print(a + " ");
		}
		
	}
}