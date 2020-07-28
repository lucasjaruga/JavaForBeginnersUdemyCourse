/**
 * Print Hello ten times using do - while loop.
 * Infinite do - while loop.
 * Use of false in boolean expression of do - while and while loop.
 * 
 * @author Udayan Khattry
 */
public class _04Example {
	public static void main(String[] args) {
		// Logic to print Hello 10 times on to the console. 
		int ctr = 0;
		do {
			System.out.println("Hello");
			ctr = ctr + 1;
		} while(ctr < 10);
		
		/*
		 * Logic to print Hello 10 times on to the console. 
		 * Note boolean expression includes pre-increment operator as well. 
		 */
		/*int ctr = 0;
		do {
			System.out.println("Hello");
		} while(++ctr < 10);*/
		
		
		// Infinite loop
		/*do {
			System.out.println("Hello");
		} while(true);*/
		
		
		// Prints Hello only Once.
		/*do {
			System.out.println("Hello");
		} while(false);*/
		
		
		// Unreachable code error.
		/*while(false) {
			System.out.println("Hello");
		}*/
	}
}
