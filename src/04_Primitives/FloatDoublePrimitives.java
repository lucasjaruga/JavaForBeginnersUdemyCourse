/**
 * Class to show examples of float/double primitive. 
 * 
 * @author Udayan Khattry
 */
public class FloatDoublePrimitives {
	public static void main(String [] args) {
		float f1 = 2.718f; //f is compulsory
		System.out.println("f1 = " + f1);
		
		float f2 = (float) 2.718; //Explicit casting needed if suffix F/f is absent
		System.out.println("f2 = " + f2);
		
		float f3 = 2718e-3F; //scientific notation, f is compulsory
		System.out.println("f3 = " + f3);
		
		double d1 = 123.4E306; //D is optional
		System.out.println("d1 = " + d1);
		
		double d2 = 3.14876546636363; //D is optional
		System.out.println("d2 = " + d2);
		
		double d3 = (double) 3.14876546636363; //Explicit casting not required
		System.out.println("d3 = " + d3);
	}
}
