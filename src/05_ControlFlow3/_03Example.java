/**
 * Program to show that boolean_expression can accept following:
 * A boolean variable. e.g. flag
 * A boolean literal: true
 * A boolean assignment. e.g. flag = true
 * 
 * Uncomment one set of block once to check the output.
 * 
 * @author Udayan Khattry
 */
public class _03Example {
	public static void main(String[] args) {
		
		//Infinite loop
		/*boolean flag = true;
		while(flag) {
			System.out.println("WELCOME");
		}*/
				
		//No output
		/*boolean flag = false;
		while(flag) {
			System.out.println("WELCOME");
		}*/
		
		//No output
		/*boolean flag = false;
		while(flag == true) { //Same as while(flag)
			System.out.println("WELCOME");
		}*/
		
		//Infinite loop
		/*boolean flag = false;
		while(flag = true) { //Note assignment operator
			System.out.println("WELCOME");
		}*/
		
		//Infinite loop
		/*while(true) {
			System.out.println("WELCOME");
		}*/
		
		//Compilation error, unreachable code
		/*while(false) {
			System.out.println("WELCOME");
		}*/
		
		//Warning (No compilation error), dead code
		/*if(false) {
			System.out.println("WELCOME");
		}*/
		
		// Check the below link for unreachable code and dead code:
		// http://docs.oracle.com/javase/specs/jls/se8/html/jls-14.html#jls-14.21
	}
}
