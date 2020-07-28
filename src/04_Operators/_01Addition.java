/**
 * Class to show examples of Addition.
 * 
 * @author Udayan Khattry
 */
public class _01Addition {
	public static void main(String [] args) {
		int i1 = 5;
		int i2 = 10;
		float f1 = 15.5f;
		double d1 = 20.5;
		String msg = "HELLO ";
		int res1 = i1 + i2; //Addition, result of expression is int
		float res2 = i1 + f1; //Addition, result of expression is float
		double res3 = i2 + d1; //Addition, result of expression is double
		String res4 = msg + f1; //Concatenation, result of expression is String
		
		System.out.println("res1 = " + res1);
		System.out.println("res2 = " + res2);
		System.out.println("res3 = " + res3);
		System.out.println("res4 = " + res4);
		
		System.out.println("----------------------------------------");
		
		byte b1 = 12; //Implicit casting
		byte b2 = 20; //Implicit casting
		/*
		 The result of an expression involving anything int-sized or smaller variable
		 is always an int. If you add two bytes together, you will get an int.
		 And in case of arithmetic addition, multiplication, subtraction and division of
		 integral variables (byte and short) compiler processes the values as int, 
		 so you need to cast it.		 
		 */
		byte res5 = (byte) (b1 + b2); // Casting is required
		byte res6 = (byte) (b1 + 0); // Casting is required
		byte res7 = 126 + 1; //No casting required as result (127) of expression is within byte range
		byte res8 = (byte) (126 + 19); //Casting is needed as result (145) is out of byte range
		// Whenever you do explicit casting, there is a chance of losing some data.
		
		System.out.println("res5 = " + res5);
		System.out.println("res6 = " + res6);
		System.out.println("res7 = " + res7);
		System.out.println("res8 = " + res8);
	}
}
