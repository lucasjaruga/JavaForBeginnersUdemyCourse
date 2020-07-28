/**
 * Class to show examples of Assignment operators.
 * 
 * @author Udayan Khattry
 */
public class _11AssignmentOperators {
	public static void main(String[] args) {
		int i1 = 100;
		System.out.println(i1);
		
		i1 += 1; //i1 = i1 + 1 = 100 + 1 = 101
		System.out.println(i1);
		
		i1 -= 2; //i1 = i1 - 2 = 101 - 2 = 99
		System.out.println(i1);
		
		i1 *= 3; //i1 = i1 * 3 = 99 * 3 = 297
		System.out.println(i1);
		
		i1 /= 4; //i1 = i1 / 4 = 297 / 4 = 74
		System.out.println(i1);
		
		i1 %= 5; //i1 = i1 % 5 = 74 % 5 = 4
		System.out.println(i1);
	}
}
