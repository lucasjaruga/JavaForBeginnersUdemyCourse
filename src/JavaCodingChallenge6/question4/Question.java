package JavaCodingChallenge6.question4;

public class Question {
	public static void main(String[] args) {
		int [][] arr = {
				{9, 76, 17, 39},
				{8, 87}, 
				{16, 99, 231},    
				{187}
		};
		int lengthArr = 0;
		
		for(int i = 0; i < arr.length; i++) {
			lengthArr += arr[i].length;
		}
		
		int [] oneDimensionalArr = new int[lengthArr];
		int posisionInArray = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				oneDimensionalArr[posisionInArray] = arr[i][j];
				posisionInArray++;
			}
		}
		
		for(int i = 0; i < oneDimensionalArr.length; i++) {
			System.out.print(oneDimensionalArr[i] + " ");
		}
	}
}