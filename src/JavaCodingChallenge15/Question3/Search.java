package JavaCodingChallenge15.Question3;

public class Search {
	public static void searchNames(String [] names, String nameToFind) {
		if(names == null) {
			System.out.println("Name list cannot be null.");
			return;
		}
		
		if(nameToFind == null) {
			System.out.println("Search String should not be null.");
			return;
		}
		
		for(String name : names) {
				if(name != null && name.equalsIgnoreCase(nameToFind)) {
					System.out.println(nameToFind + " found in the list.");
					return;
				}
		}
		
		throw new NameNotFoundException(nameToFind);
		
	}
}