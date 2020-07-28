/**
 * This class shows how to read all 1-D array elements using enhanced for loop.
 * 
 * @author Udayan Khattry
 */
public class ForEach1 {
	public static void main(String[] args) {
		//Primitive 1-D array
		int [] arr = {10, 20, 30};
		for(int x : arr) { //Declaration expression is int as each array element is of int type.
			System.out.println(x);
		}
		
		//Object 1-D array
		String [] names = {"Jack", "Joe", "John"};
		for(String name : names) { //Declaration expression is String as each array element is of String type.
			System.out.println(name);
		}

	}
}
