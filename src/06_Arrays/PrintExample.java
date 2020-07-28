/**
 * This class shows examples on how primitive type and reference types
 * behave when passed in System.out.println(); statement.
 * 
 * @author Udayan Khattry
 */
public class PrintExample {
	public static void main(String[] args) {
		int score1 = 85;
		String name = "Udayan";
		int [] scores = new int[4];
		String [] names = new String[5];
		
		System.out.println(score1); //85
		System.out.println(name); //Udayan
		System.out.println(scores); //[I@15db9742
		System.out.println(names); //[Ljava.lang.String;@6d06d69c
	}
}
