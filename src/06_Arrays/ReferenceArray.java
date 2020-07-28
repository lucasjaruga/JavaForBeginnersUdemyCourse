/**
 * This class shows how to declare, instantiate and initialize Reference Type array.
 * 
 * @author Udayan Khattry
 */
public class ReferenceArray {
	public static void main(String[] args) {
		String [] names = new String [5]; //Declare and instantiate a String array object of 5 elements
		//All the array elements are initialized to default values, in this case null
		
		//Print all the array elements before assigning the values
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[3]);
		System.out.println(names[4]);
		
		//Assign String objects to array elements
		names[0] = "Jack";
		names[1] = "Lucy";
		names[2] = "Joe";
		names[3] = "John";
		names[4] = "Kate";
		
		//Print all the array elements after assigning the values
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[3]);
		System.out.println(names[4]);
		
		/* Following statement causes Runtime error (Exception) as array index -1
		is outside array boundary, which is from 0 to 4. */
		//System.out.println(names[-1]);
		
		/* Below statement causes compilation error as 9999999999 is outside int range. */
		//System.out.println(names[9999999999]);
		
		/* Below statement causes compilation error as 100L is long literal which is not
		implicitly casted to int. And we can only specify int values within square brackets [] */
		//System.out.println(names[100L]);
		
		/* No compilation error, as char literal 'A' is compatible with int type. And it's decimal
		value 65 is within int range. But this statement causes runtime error as 65
		is outside index range of 0 to 4. */
		//System.out.println(names['A']);
	}
}
