package JavaCodingChallenge16.Question1;

public class Ques01 {
	public static void main(String[] args) {
		//Below array contains full names in the format: "<Family_name/Surname>, <First_name>"
		String [] fullNames = {
				"Khattry, Udayan",
				"Schildt, Herbert",
				"Pitt, Brad",
				"Hanks, Tom",
		};
		
		System.out.println("Printing Family names: ");
		printFamilyNames(fullNames);
		
		System.out.println("*********************");
		
		System.out.println("Printing First names: ");
		printFirstNames(fullNames);
	}
	
	//Extracts and prints all the family names.
	private static void printFamilyNames(final String [] names) {
		//TODO 1: Type the code.
		for(String x : names) {
			int y = x.indexOf(",");
			System.out.println(x.substring(0, y));
		}
	}
	
	//Extracts and prints all the first names.
	private static void printFirstNames(final String [] names) {
		//TODO 2: Type the code.
		for(String x : names) {
			int y = x.indexOf(" ");
			int z = x.length();
			System.out.println(x.substring(++y, z));
		}
	}
}
