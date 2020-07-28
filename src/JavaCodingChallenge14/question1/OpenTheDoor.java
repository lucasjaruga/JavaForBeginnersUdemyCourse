package JavaCodingChallenge14.question1;

import java.util.Scanner;

class OpenTheDoor {
	public static void main(String[] args) {
		Electronics [] electronics = new Electronics[3];
		
		electronics[0] = new Camera();
		electronics[1] = new Television("Discovery");
		electronics[2] = new SmartPhone();
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Welcome in to \"Open the door\" game!\n"  
				+ "Provide a door number 1, 2 or 3 - which you wanna open: ");
		int userAnswer = scanner.nextInt();
		scanner.close();
		
		switch(userAnswer) {
			case 1:
				electronics[0].powerOn();
				electronics[0].operate();
				electronics[0].powerOff();
				break;
			case 2:
				electronics[1].powerOn();
				electronics[1].operate();
				electronics[1].powerOff();
				break;
			case 3:
				electronics[2].powerOn();
				electronics[2].operate();
				electronics[2].powerOff();
				break;
		}
	}
}