/**
 * Program to display days using if - else if - else
 * 1 -> MONDAY
 * 2 -> TUESDAY
 * 3 -> WEDNESDAY
 * 4 -> THURSDAY
 * 5 -> FRIDAY
 * 6 -> SATURDAY
 * 7 -> SUNDAY
 * 
 * @author Udayan Khattry
 *
 */
public class _01Example {
	public static void main(String[] args) {
		int day = 1;
		
		if( day == 1) {
			System.out.println("MONDAY");
		} else if (day == 2) {
			System.out.println("TUESDAY");
		} else if (day == 3) {
			System.out.println("WEDNESDAY");
		} else if (day == 4) {
			System.out.println("THURSDAY");
		} else if (day == 5) {
			System.out.println("FRIDAY");
		} else if (day == 6){
			System.out.println("SATURDAY");
		} else if (day == 7) {
			System.out.println("SUNDAY");
		} else {
			System.out.println("Not a valid day");
		}
	}
}
