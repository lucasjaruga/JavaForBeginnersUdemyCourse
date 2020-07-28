/**
 * Write a Java program to print all the numbers between 1 and 100 (including 1 and 100)
 * which are divisible by 5. 
 * 
 * @author Udayan Khattry
 */
public class Continue1 {
	public static void main(String[] args) {
		//Check all the numbers between 1 and 100.
		for(int i = 1; i <= 100; i++) {
			/*if(i % 5 == 0){ //For numbers divisible by 5, i % 5 == 0.
				System.out.println(i);
			}*/
			
			if(i % 5 != 0) { //if number is not divisible by 5
				continue; // Skip remaining statements and go to the step expression 
			}
			
			System.out.println(i);
		}
	}
}
