package JavaCodingChallenge6.question3;

public class Question {
	public static void main(String[] args) {
		int [][] numbers = {   
				{90, 10, 231},
				{-20, 80, 100, 23, 54},
				{45, 22},
				{87, 98, -100, 49, 73, 35, 19}
		};
		
		int highest = 0;
		
		for(int i = 0; i < numbers.length; i++) {
			for(int j = 0; j < numbers[i].length; j++) {
				if(highest < numbers[i][j])
					highest = numbers[i][j];
			}
		}
		
		System.out.println("The highest number in array is: " + highest);
		
	}
}
