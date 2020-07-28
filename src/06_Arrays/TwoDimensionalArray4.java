/**
 * This class shows examples of how 2-D array object can be instantiated with data.
 * 
 * @author Udayan Khattry
 */
public class TwoDimensionalArray4 {
	public static void main(String[] args) {
		//1-D array instantiated with Data
		String [] days1 = {
				"Monday",
				"Tuesday",
				"Wednesday",
				"Thursday",
				"Friday",
				"Saturday",
				"Sunday"
		};
		
		//2-D array instantiated with Data
		String [][] days2 = {
						{"1", "Monday"},
						{"2", "Tuesday"},
						{"3", "Wednesday"},
						{"4", "Thursday"},
						{"5", "Friday"},
						{"6", "Saturday", "Weekend"},
						{"7", "Sunday", "Weekend"}
		};
		
		//for loop to print 1-D array
		for(int i = 0; i < days1.length; i++){
			System.out.println(days1[i]);
		}
		
		System.out.println("-------------------");
		
		//for loop to print 2-D array
		for(int i = 0; i < days2.length; i++){
			for(int j = 0; j < days2[i].length; j++) {
				System.out.print(days2[i][j]+ " "); //Print all the elements on the same line
			}
			System.out.println(); //Print a new line after inner loop finishes its execution.
		}
		
	}
}
