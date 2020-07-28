/**
 * Example to show case values must evaluate to the same type / compatible type 
 * as the switch expression can use
 * and
 * case values should be compile-time constant.
 *
 * @author Udayan Khattry
 * 
 */
public class _03Example {
	public static void main(String[] args) {
		byte var = 65;
		final byte a = 10;
		final byte b;
		b = 20;
		switch (var) { //switch expression is of byte type
			case a: //Value 10, compile-time constant, within byte range
				System.out.println(1);
				break;
			case a * 5: //Value 50, compile-time constant, within byte range
				System.out.println(2);
				break;
			/*case a * 50: //Value 500, compile-time constant but outside byte range
				System.out.println(3);
				break;*/
			/*case b: //Not compile-time constant
				System.out.println(4);
				break;*/
			case '\u0041': //Character literal 'A' (compile-time constant) 
						   //decimal value 65 is within byte range
				System.out.println(5);
				break;
			/*case '\u20B9': //Indian rupee symbol '₹' (compile-time constant)
			 				 //decimal value 8377 is outside byte range
				System.out.println(6);
				break;*/
			default:
				System.out.println(7);
				break;
		}
	}
}
