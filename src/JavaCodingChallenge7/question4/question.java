package JavaCodingChallenge7.question4;

import java.util.Scanner;

public class question {
	public static void main(String[] args) {
		if(args.length < 2) {
			System.out.println("Please provide more then two digits");
		} else {
				int [] numbers = new int[args.length];
				
				int i = 0;
				for(String x : args) {
					numbers[i] = Integer.parseInt(x);
					i++;
					}
				
				int highestDigit = numbers[0];
				
				for(int x : numbers) {
					if(x > highestDigit){
						 highestDigit = x;
					}
				}
				System.out.println("The highest digit is: " + highestDigit);
		}
		
		
		String str = "Udayan";
		
		for(int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Provide char: ");
		String abc = scanner.nextLine();
		scanner.close();
		
		char value = abc.charAt(0);
		System.out.println("Value char: " + value);
		
	}
}
