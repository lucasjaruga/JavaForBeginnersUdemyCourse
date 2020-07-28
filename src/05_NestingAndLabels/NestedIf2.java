/**
 * A confusing example on nested if. 
 * After creating if-else pair, it becomes very easy to predict the output.
 * Trick is to start from inner else. 
 * 
 * @author Udayan Khattry
 */
public class NestedIf2 {
	public static void main(String[] args) {
		int duration = 3;
		if(duration > 2) //1
			if (duration > 4) //2
				if(duration < 7) //3
					System.out.println("A");
			else //3
				System.out.println("B");
		else //2
			System.out.println("C");
	}
}
