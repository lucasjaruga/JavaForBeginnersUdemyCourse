/**
 * This example converts while loop to for loop and shows you how to access
 * loop counter's variable outside loop's body.
 * 
 * @author Udayan Khattry
 */
public class ForExample {
	public static void main(String[] args) {
		//while loop printing Hello 5 times
		/*
		int ctr = 0;
		while (ctr < 5) {
			System.out.println("Hello");
			ctr++;
		}
		*/
		
		//for loop syntax
		/*
		for ( initialization_exprn; boolean_exprn; step_exprn ) {
			statement1;
			statement2;
			. . .
		}
		*/
		
		//Convert above while loop to for loop
		for(int ctr = 0; ctr < 2; ctr++) {
			System.out.println("Hello");
		}
		//System.out.println(ctr); //Compilation error as ctr is not accessible here.
		
		System.out.println("-------------------");
		
		//Example to show, variable is declared outside for loop and initialized 
		//within the loop.
		int i;
		for(i = 0; i < 2; i++) {
			System.out.println("Hello");
		}
		System.out.println(i);
		
	}
}
