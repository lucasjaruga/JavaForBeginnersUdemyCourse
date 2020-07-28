/**
 * This class expects user to provide exactly one command-line argument 
 * for the no. of elements in Fibonacci series. User can provide following: 
 * 1. If user provides 0 or more than 1 arguments, then this program displays
 * message to the user and ends.
 * 
 * 2. If user provides exactly one command-line argument of integral type, 
 * then this program displays Fibonacci series up to passed argument.
 * 
 * 3. If user provides exactly one command-line argument of non-integral type,
 * then this program throws NumberFormatException and ends abruptly.
 * 
 * @author Udayan Khattry
 */
public class Fibonacci {
	public static void main(String args[]) {
		if(args.length != 1) { //If user has not provided exactly one command-line argument
			System.out.println("Please provide one argument for the no. of elements in Fibonacci series");
			return; //End the program, don't proceed.
		}
		System.out.println("Count is: " + args[0]);
		int count = Integer.parseInt(args[0]); 
		
		int[] fib = new int[count]; //Array to store the series
		fib[0] = 0; //First member of the series is always 0
		fib[1] = 1; //Second member of the series is always 1

		// Store the values in fib array
		for (int i = 2; i < count; i++) { // Array index starting with 2 as values are already assigned to elements at 0th and 1st indexes.
			fib[i] = fib[i - 1] + fib[i - 2]; //next number is always the sum of previous two numbers
		}

		// Print the values from fib array
		for (int i = 0; i < fib.length; i++) {
			System.out.print(fib[i] + " ");
		}
	}
}
