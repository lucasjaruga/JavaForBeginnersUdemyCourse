/**
 * Class to show examples of long primitive.
 *  
 * @author Udayan Khattry
 */
public class LongPrimitive {
	public static void main(String [] args) {
		long l1 = 5000L; //Suffix L is optional, literal 5000 is of int type
		//And long type can accommodate int range without any issues.
		System.out.println("l1 = " + l1);
		
		long l2 = -5000; //Suffix L is optional
		System.out.println("l2 = " + l2);
		
		long l3 = -2147483649l; //Suffix L is compulsory, this number is out of int range.
		System.out.println("l3 = " + l3);
		
		long l4 = 2147483648L; //Suffix L is compulsory, this number is out of int range.
		System.out.println("l4 = " + l4);
		
		long creditCardNumber = 5876_1234_3452_9832L; //Suffix L is compulsory, 
		//but you can have underscore to improve readability.
		//above statement is same as: long creditCardNumber = 5876123434529832L
		System.out.println("creditCardNumber = " + creditCardNumber);
	}
}
