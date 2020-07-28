/**
 * Nested for loops used with labeled break.
 * 
 * @author Udayan Khattry
 *
 */
public class Break2 {
	public static void main(String[] args) {
		//Stop the program after printing till the first appearance of this value.
		int stopAt = 24;
		
		outer:
		for(int row = 1; row <= 100; row++) {
			inner:
			for(int col = 1; col <= 10; col++) {
				int num = row * col;
				System.out.print(num + "\t"); // \t is tab space, this adds tab space after each value.
				if(num == stopAt) {
					break outer; // break out of outer loop.
				}
			} //inner for ends
			System.out.println();
		} //outer for ends
	}
}
