package JavaCodingChallenge11.question3;

import java.util.Scanner;

public class Message {
	public static String msg;
	
	static {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Type today's message and press <ENTER>: ");
		msg = scanner.nextLine();
		scanner.close();
	}
}