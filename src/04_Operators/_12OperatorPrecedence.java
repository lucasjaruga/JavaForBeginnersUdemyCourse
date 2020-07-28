/**
 * Class to show examples of operator precedence.
 * 
 * @author Udayan Khattry
 */
public class _12OperatorPrecedence {
	public static void main(String [] args) {
		System.out.println(10 - 5 - 5); //0
		
		int a = 100;
		a = --a + a++ + a-- + a++;
		System.out.println("a = " + a); //397
		
		a = 1;
		a = -a-- + a++ / -a-- * --a;
		System.out.println("a = " + a); //-1
		
		a = 2;
		boolean res = a++ == 2 || --a == 2 && --a == 2;
		System.out.println("res = " + res); //true
		System.out.println(a); //3
	}
}
