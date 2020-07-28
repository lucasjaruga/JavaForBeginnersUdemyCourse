/**
 * Program to display days using switch - case 
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
public class _02Example {
	public static void main(String[] args) {
		int day = 1;

		switch(day) {
			case 1:
				System.out.println("MONDAY");
				break;
			case 2:
				System.out.println("TUESDAY");
				break;
			case 3:
				System.out.println("WEDNESDAY");
				break;
			case 4:
				System.out.println("THURSDAY");
				break;
			case 5:
				System.out.println("FRIDAY");
				break;
			case 6:
				System.out.println("SATURDAY");
				break;
			case 7: {
				System.out.println("SUNDAY");
				break;
			}
			default:
				System.out.println("Not a valid day");
				break;
		}
	}
}
