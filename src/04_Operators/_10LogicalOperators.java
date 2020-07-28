/**
 * Class to show examples of Logical operators.
 * 
 * @author Udayan Khattry
 */
public class _10LogicalOperators {
	public static void main(String [] args) {
		char a1 = 'A'; //Decimal value of 'A' is 65
		char a2 = 65;
		int i1 = 5;
		int i2 = 10;
		
		boolean res1 = (i1 == i2) && (a1 == a2);
		boolean res2 = (i1 == i2) & (a1 == a2);
		System.out.println("res1 = " + res1);
		System.out.println("res2 = " + res2);
		
		boolean res3 = (a1 == a2) || (i1 == i2);
		boolean res4 = (a1 == a2) | (i1 == i2);
		System.out.println("res3 = " + res3);
		System.out.println("res4 = " + res4);
		
		boolean res5 = (a1 == a2) ^ (i1 == i2);
		boolean res6 = (a1 == a2) ^ (i1 != i2);
		System.out.println("res5 = " + res5);
		System.out.println("res6 = " + res6);
		
		
		int time = 14;
		String s = (time >= 12) ? "PM" : "AM";
		System.out.println("s = " + s);
	}
}
