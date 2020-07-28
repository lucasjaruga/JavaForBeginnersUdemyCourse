/**
 * This class shows that in Java, array object of Size Zero is possible.
 * int [] arr = new int[0];
 * 
 * arr.length returns 0.
 * 
 * But if we try to access any element of this array, such as arr[0], we get
 * ArrayIndexOutOfBounds Exception.
 * 
 * @author Udayan Khattry
 */
public class ArrayZeroSize {
	public static void main(String[] args) {
		int [] arr = new int[0];
		System.out.println("Array size is: " + arr.length);
		System.out.println(arr[0]); //Throws ArrayIndexOutOfBoundsException
	}
}
