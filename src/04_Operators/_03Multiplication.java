/**
 * Class to show examples of Multiplication.
 * 
 * @author Udayan Khattry
 */
public class _03Multiplication {
	public static void main(String [] args) {
		int i1 = 5;
		int i2 = 10;
		float f1 = 15.5f;
		double d1 = 20.5;
		
		int res1 = i1 * i2;
		float res2 = i1 * f1;
		double res3 = i2 * d1;
		
		System.out.println("res1 = " + res1); //50
		System.out.println("res2 = " + res2); //77.5
		System.out.println("res3 = " + res3); //205.0
		
		byte b1 = 20;
		byte b2 = 2;
		
		byte res4 = (byte) (b1 * b2); //Casting is required.
		System.out.println("res4 = " + res4);
		
		i1 = 1000000; //Re-assignment
		i2 = 5000; //Re-assignment
		res1 = i1 * i2; //Result is out of int range, but compiler tries to fit the value
						//to int container and hence stored value is different.
		System.out.println("res1 = " + res1);
	}
}
