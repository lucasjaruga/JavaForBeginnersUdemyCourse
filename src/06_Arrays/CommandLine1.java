/**
 * We used this class to show how to pass command-line arguments to a Java program
 * using command prompt and Eclipse IDE.
 * 
 * @author Udayan Khattry
 */
public class CommandLine1 {
	public static void main(String[] args) {
		System.out.println(args.length);
		
		for(String val : args) {
			System.out.println(val);
		}
	}
}


