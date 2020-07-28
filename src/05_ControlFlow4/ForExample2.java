/**
 * This example checks infinite for loop and unreachable code compilation error. 
 * 1. infinite for loop
 * 2. infinite for loop
 * 3. infinite for loop and unreachable code error
 * 4. unreachable code error
 * 
 * @author Udayan Khattry
 */
public class ForExample2 {
	public static void main(String[] args) {
		//1. no boolean condition and hence an infinite loop
		/*for(;;) {
			System.out.println("WELCOME");
		}*/

		//2. Infinite for loop, as boolean expression is always true.
		/*for(;true;) {
			System.out.println("WELCOME");
		}*/
		
		//3. Infinite for loop, literal true is compile-time constant, 
		//   hence compiler knows that once control enters the loop, it will not come
		//   out of the loop. It marks all the statements after loop as unreachable.
		/*for(;true;) {
			System.out.println("WELCOME");
		}
		System.out.println(1); //This statement gives unreachable code error.
		*/
		
		//4. Literal false is a compile-time constant,
		//   hence compiler knows that control will never enter this loop, so it gives
		//   unreachable code error for the loop body.
		/*for(;false;) {
			System.out.println("WELCOME");
		}*/
	}
}
