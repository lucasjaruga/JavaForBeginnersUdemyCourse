/**
 * Print following output using nested for loop:
 * +
 * ++
 * +++
 * ++++
 * +++++
 * 
 * @author Udayan Khattry
 */
public class NestedFor2 {
	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) { //outer loop
			for(int j = 1; j <=i ; j++) { //inner loop
				System.out.print("+");
			}
			System.out.println(); //Print new line after inner loop completes all its iterations.
		}
	}
}
