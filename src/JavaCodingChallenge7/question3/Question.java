package JavaCodingChallenge7.question3;

public class Question {
	public static void main(String[] args) {
		if(args.length != 2) {
			System.out.println("Please enter both your first name and last name.");
		} else {
			System.out.println("Hello " + args[0] + " " + args[1] + ", Wlecome to Core Java Development Course For Beginners!");
		}
	}
}
