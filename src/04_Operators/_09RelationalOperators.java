/**
 * Class to show examples of Relational operators.
 * 
 * @author Udayan Khattry
 */
public class _09RelationalOperators {
	public static void main(String [] args) {
		byte b1 = 5;
		short s1 = 5;
		int i1 = 5;
		int i2 = 10;
		long l1 = 5;
		float f1 = (float) 5.0;
		double d1 = 5.0;
		char c1 = 5;
		
		
		System.out.println("b1 == s1 : " + (b1 == s1));
		System.out.println("i1 == l1 : " + (i1 == l1));
		System.out.println("i1 == f1 : " + (i1 == f1));
		System.out.println("i1 == d1 : " + (i1 == d1));
		System.out.println("f1 == d1 : " + (f1 == d1));
		System.out.println("i1 == c1 : " + (i1 == c1));
		
		System.out.println("i1 == i2 : " + (i1 == i2));
		System.out.println("i1 != i2 : " + (i1 != i2));
		System.out.println("i1 >= i2 : " + (i1 >= i2));
		System.out.println("i1 <= i2 : " + (i1 <= i2));
	}
}
