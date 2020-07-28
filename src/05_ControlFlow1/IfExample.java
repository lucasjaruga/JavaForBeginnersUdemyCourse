/**
 * Class to explain if statement.
 * 
 * @author Udayan Khattry
 *
 */
public class IfExample {
	public static void main(String[] args) {
		int score = 75;
		
		if (score > 80) 
			System.out.println("Excellent");
			System.out.println("You passed with grade A");
			
		if (score > 80) {
			System.out.println("Excellent");
		}
		System.out.println("You passed with grade A");
		
		if (score > 80) 
			System.out.println("Excellent");System.out.println("You passed with grade A");
	}
}
