/**
 * This class shows the usage of for loop along with length property of the array.
 * for loop is used to read all the array elements as well as to assign values to all the array elements.
 * 
 * @author Udayan Khattry
 */
public class ArrayIteration1 {
	public static void main(String[] args) {
		int [] arr = new int [10];
		/*
		  Assign values to array elements using separate statements
		 */
//		arr[0] = 10;
//		arr[1] = 20;
//		arr[2] = 30;
//		arr[3] = 40;
//		arr[4] = 50;
//		arr[5] = 60;
//		arr[6] = 70;
		
		/*
		  Assign values to array elements using for loop.
		 */
		for(int i = 0, j = 10; i < arr.length; i++, j += 10) {
			arr[i] = j;
		}
 		
		/*
		  Print all the array elements using separate statements.
		 */
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
		
		/*
		  Print all the array elements using for loop.
		  boolean expression is i <= arr.length - 1
		 */
		/*for(int i = 0; i <= arr.length - 1; i++){
			System.out.println(arr[i]);
		}*/
		
		/*
		  Print all the array elements using for loop.
		  boolean expression is i < arr.length
		 */
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}
	}
}
