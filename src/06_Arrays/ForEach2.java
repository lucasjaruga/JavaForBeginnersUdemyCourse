/**
 * This class shows the example of regular for loop and enhanced for loop to read an array.
 * 
 * @author Udayan Khattry
 */
public class ForEach2 {
	public static void main(String[] args) {
		int [] arr = new int [5];
		
		// Regular for loop to print all the array elements to the console.
		// Variable i can be declared outside for loop.
		/*for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}*/
		
		// Enhanced for loop to print all the array elements
		// Variable x can't be declared outside for-each loop
		for(int x : arr) {
			System.out.println(x);
		}

	}
}
