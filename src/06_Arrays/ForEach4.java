/**
 * This class shows regular for loop can be used to iterate through an array in both
 * the directions: first to last and last to first. But enhanced for loop can traverse 
 * an array in only one direction: first to last.
 * 
 * @author Udayan Khattry
 */
public class ForEach4 {
	public static void main(String[] args) {
		String [] arr = {"A", "B", "C", "D"};
		//Regular for loop to print array elements from first to last.
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("----");
		
		//Regular for loop to print array elements from last to first.
		for(int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
		
		System.out.println("----");
		
		//Enhanced for loop can only print array elements from first to last.
		for(String str : arr) {
			System.out.println(str);
		}
	}
}
