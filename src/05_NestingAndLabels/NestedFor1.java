/**
 * Example to show nested for loop.
 * 
 * @author Udayan Khattry
 */
public class NestedFor1 {
	public static void main(String[] args) {
		
		for(int i = 1; i <= 3; i++) {//outer for loop
			
			for(int j = 1; j <= 2; j++) {//inner for loop
				System.out.println(i + " " + j);
			} //inner for ends
			
		} //outer for ends
		
	} //main method ends
}
