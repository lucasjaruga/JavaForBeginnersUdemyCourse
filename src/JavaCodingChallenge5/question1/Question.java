package JavaCodingChallenge5.question1;

public class Question {
	public static void main(String[] args) {
		int [] numbers = new int[100]; // 0 - 999
		
		for(int i = 0; i < numbers.length; i++) { // put numbers in array
			numbers[i] = i+1;
		}
		
		for(int i = 0; i < numbers.length; i++) { // read every element of array
			if((i%10 == 0) && (i != 0)){ // if row has 10 elements then move to new line
				System.out.println();	
			}
			System.out.print(numbers[i] + "\t"); // print current value of array
		}
	}
}
