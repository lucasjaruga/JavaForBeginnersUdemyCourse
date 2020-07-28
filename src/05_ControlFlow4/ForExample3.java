/**
 * This example does some experiments with Step expression. 
 * 1. We have used full expression i = i + 1 instead of i++.
 * 2. Step expression is missing.
 * 3. Step expression is used for increment as well as printing the output.
 * 
 * @author Udayan Khattry
 */
public class ForExample3 {
	public static void main(String[] args) {
		//1. for loop using all the 3 expression, step expression is i = i + 1
		for(int i = 0; i < 2; i = i + 1) {
			System.out.println("i = " + i);
		}
		
		System.out.println("---------------------");
		
		//2. Step expression is missing and i is incremented within loop body.
		for(int i = 0; i < 2; ) {
			System.out.println("i = " + i++);
		}
		
		System.out.println("---------------------");
		
		//3. Step expression is used to increment i as well as print output to the console.
		for(int i = 0; i < 2; System.out.println("i = " + i++)) {
			
		}
	}
}
