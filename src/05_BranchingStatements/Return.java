/**
 * This class shows example of return statement.
 * 
 * @author Udayan Khattry
 *
 */
public class Return {
	public static void main(String[] args) {
		System.out.println("Loop starts.");
		for(int i = 1; i <= 10; i++){
			System.out.println(i);
			if(i == 2) {
				return; //Return the call to JVM, which terminates the program.
				        //Hence no more loop iterations and no statement outside for loop executes.
			}
		}
		System.out.println("Loop ends.");
	}
}
