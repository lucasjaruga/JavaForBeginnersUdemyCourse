/**
 * Class to show examples of int primitive.
 * 
 * @author Udayan Khattry
 */
public class IntPrimitive {
	public static void main(String[] args) {
		int i1 = -2147483648;
		System.out.println(i1);
		i1 = 2147483647;
		System.out.println(i1);
		i1 = 100_000; //_ is for grouping of digits
		System.out.println(i1);
		
		// i1 = -2147483649; //Out of range, int's range is -2147483648 to 2147483647
		// i1 = 2147483648; //Out of range, int's range is -2147483648 to 2147483647
	}
}
