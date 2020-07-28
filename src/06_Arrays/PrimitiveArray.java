/**
 * This class shows how to declare, instantiate and initialize primitive array.
 * 
 * @author Udayan Khattry
 */
public class PrimitiveArray {
	public static void main(String[] args) {
		int [] scores; //Declare an int array
		scores = new int[4]; //Instantiate an int array object of 4 elements
		//All the array elements are initialized to default values, in this case 0
		
		//Print all the array elements before assigning the values
		System.out.println(scores[0]); //Prints 1st array element
		System.out.println(scores[1]); //Prints 2nd array element
		System.out.println(scores[2]); //Prints 3rd array element
		System.out.println(scores[3]); //Prints 4th array element.
		
		//Assign values to array elements.
		scores[0] = 85; //Assigns 85 to 1st element
		scores[1] = 70; //Assigns 70 to 2nd element
		scores[2] = 95; //Assigns 95 to 3rd element
		scores[3] = 90; //Assigns 90 to 4th element
		
		//Print all the array elements after assigning the values
		System.out.println(scores[0]); //Prints 1st array element
		System.out.println(scores[1]); //Prints 2nd array element
		System.out.println(scores[2]); //Prints 3rd array element
		System.out.println(scores[3]); //Prints 4th array element.
		
		/* Following statement causes Runtime error (Exception) as array index 4
		is outside array boundary, which is from 0 to 3. */
		//scores[4] = 100;
						
	}
}
