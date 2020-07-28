/**
 * Class to show examples of short primitive.
 * 
 * @author Udayan Khattry
 */
public class ShortPrimitive {
	public static void main(String [] args) {
		short s1 = -32768;
		short s2 = 32767;
		short s3 = 500;
		
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
		System.out.println("s3 = " + s3);
		
		//short s4 = -35000; //Out of range, short's range is -32768 to 32767
		//short s5 = 32768; //Out of range, short's range is -32768 to 32767
	}
}
