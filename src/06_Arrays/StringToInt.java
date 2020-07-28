/**
 * Example to convert String to int in Java.
 * We used parseInt method of Integer class, which takes 
 * String as a parameter and returns int result.
 * If passed String cannot be converted to int type, then parseInt
 * method throws NumberFormatException.
 * 
 * @author Udayan Khattry
 */
public class StringToInt {
	public static void main(String[] args) {
		int number = Integer.parseInt("27");
		System.out.println(number);
	}
}
