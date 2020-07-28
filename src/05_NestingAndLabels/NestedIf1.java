/**
 * Program to check if you are eligible for "Indiana Jones Adventure ride" at
 * disneyland or not. If a person is 10 years or older and is 46 inches or taller,
 * then he/she should get a message "Enjoy Indiana Jones Adventure ride"
 * 
 * But if his/her age is less than 10 years, then he/she should get below message:
 * "Sorry, Your age is less than 10."
 * 
 * The solution uses nested if statements.
 * This example shows how removing one of the curly bracket pair can change the whole logic.
 * 
 * @author Udayan Khattry
 */
public class NestedIf1 {
	public static void main(String[] args) {
		int age = 15;
		double height = 45; //height in inches
		
		if(age >= 10){ //outer if
			if(height >= 46) //inner if
				System.out.println("Enjoy Indiana Jones Adventure ride");
		} else //corresponding to outer if, when age is less than 10
			System.out.println("Sorry, Your age is less than 10.");
		
		System.out.println("-----------------------------------------------");
		
		//Curly brackets are missing for outer if.
		if (age >= 10) // outer if
			if (height >= 46) // inner if
				System.out.println("Enjoy Indiana Jones Adventure ride");
			else // corresponding to inner if, when height is less than 46.
				System.out.println("Sorry, Your age is less than 10.");
		
	}
}
