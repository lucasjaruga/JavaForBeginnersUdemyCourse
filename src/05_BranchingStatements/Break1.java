/**
 * This example shows use of for loop with break.
 * 
 * @author Udayan Khattry
 */
public class Break1 {
	public static void main(String[] args) {
		//change the upper bound of printed numbers
		int upperBound = 100;
		
		for(int i = 1; i <= 100000; i++) {
			System.out.println(i);
			if(i == upperBound) {
				break;
			}
		}//for loop ends
	}
}
