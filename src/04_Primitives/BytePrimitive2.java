/**
 * Class to show examples of negative byte primitive.
 * 
 * @author Udayan Khattry
 */
public class BytePrimitive2 {
	public static void main(String [] args) {
		byte b1 = -25; //Decimal
		byte b2 = -0b11001; //Binary
		byte b3 = -0x19; //Hexadecimal
		byte b4 = -031; //Octal
		
		System.out.println("b1 = " + b1);
		System.out.println("b2 = " + b2);
		System.out.println("b3 = " + b3);
		System.out.println("b4 = " + b4);
		
		//byte b5 = 128; //Out of range, byte's range is -128 to 127
		//byte b5 = -129; //Out of range, byte's range is -128 to 127
	}
}
