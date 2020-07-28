package JavaCodingChallenge14.question1;

import java.util.Scanner;

class OpenTheDoor2 {
	public static void main(String[] args) {
		Electronics [] electronics = new Electronics[3];
		
		electronics[0] = new Camera();
		electronics[1] = new Television("Discovery");
		electronics[2] = new SmartPhone();
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Welcome in to \"Open the door\" game!\n"  
				+ "Provide a door number 1, 2 or 3 - which you wanna open: ");
		int userAnswer = scanner.nextInt() - 1;
		if(userAnswer < 3 & userAnswer > -1) {
			electronics[userAnswer].powerOn();
			electronics[userAnswer].operate();
			electronics[userAnswer].powerOff();
		} else {
			System.out.print("You've provided wrong door number so you did not win anything :(");
		}
		scanner.close();
		
		
		
	}
}