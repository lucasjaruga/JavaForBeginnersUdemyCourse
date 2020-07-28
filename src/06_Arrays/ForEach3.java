/**
 * This class shows the limitation of enhanced for loop; it should not be 
 * used to modify array elements.
 * 
 * @author Udayan Khattry
 */
public class ForEach3 {
	public static void main(String[] args) {
		int [] arr = new int [3];

		// Loop to assign 50 to all the array elements.
		/*for(int i = 0; i < arr.length; i++){
			arr[i] = 50;
		}*/
		
		//We are trying to assign 50 to all the array elements using for-each loop.
		//But it doesn't work, as the value is assigned to x and not to array element.
		for(int x : arr){
			x = 50;
		}
		
		//Enhanced for loop to print all the array elements
		for(int x : arr) {
			System.out.println(x);
		}
		
	}
}
