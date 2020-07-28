package JavaCodingChallenge16.Question7;

public class Ques07 {
	public static void main(String[] args) {
		String [] arr1 = {"A", "B", "C", "D"};
		String [] arr2 = {"One", null, "Two"};
		String [] arr3 = {"Hello"};
		String [] arr4 = {};
		String [] arr5 = null;
		
		System.out.println(arrayToString(arr1));
		System.out.println(arrayToString(arr2));
		System.out.println(arrayToString(arr3));
		System.out.println(arrayToString(arr4));
		System.out.println(arrayToString(arr5));
	}
	
	private static String arrayToString(String [] arr) {
		return arr.toString();
	}
}
