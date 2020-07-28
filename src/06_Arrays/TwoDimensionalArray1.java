/**
 * This class shows how to declare, instantiate and initialize 2-dimensional array.
 * 
 * @author Udayan Khattry
 */
public class TwoDimensionalArray1 {
	public static void main(String[] args) {
		//Below statement instantiate only 1st dimension.
		//arr Refers to array object, whose elements are of int [] type
		//Each element of this array is of int [] type, so null is assigned.
		int [][] arr = new int [3] [];
		
		System.out.println(arr); //Prints the address of above object
		System.out.println(arr[0]); //Prints null
		System.out.println(arr[1]); //Prints null
		System.out.println(arr[2]); //Prints null
		
		//create 1-D array object of 2 elements and assign its address to arr[0]
		//Each element of this array is of int type, so 0 is assigned.
		arr[0] = new int [2];
		System.out.println(arr[0]); //Prints address of 1-D array object
		System.out.println(arr[0][0]); //Prints 0
		
		//create 1-D array object of 3 elements and assign its address to arr[1]
		//Each element of this array is of int type, so 0 is assigned.
		arr[1] = new int [3];
		System.out.println(arr[1]); //Prints address of 1-D array object
		System.out.println(arr[1][2]); //Prints 0
		
		arr[0][0] = 20; //Assign 20 to arr[0][0]
		arr[1][2] = 30; //Assign 30 to arr[1][2]
		
		System.out.println(arr[0][0]); //Prints 20
		System.out.println(arr[1][2]); //Prints 30
		
		//arr[2] is null, any reference on null gives NullPointerException.
		//arr[2][1] = 50; 
	}
}
