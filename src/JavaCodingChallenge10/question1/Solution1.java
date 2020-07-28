package JavaCodingChallenge10.question1;
public class Solution1 {
	
	public static void main(String[] args) {
		int [] array = {8, 1000, -10, 76, 276};

		array = sortArrayAscending(array);
		printArray(array);
	}
	
	public static int [] sortArrayAscending(int[] arrayToSort) {
		int [] arr = arrayToSort;
		int numbersSwappedCouter = 0;
		do {
			numbersSwappedCouter = 0;
			for(int i = 0; i < arr.length - 1; i++) {
				if(arr[i] > arr[i+1]) {
					int temporaryX = arr[i];
					int temporaryY = arr[i+1];
					arr[i] = temporaryY;
					arr[i+1] = temporaryX;
					numbersSwappedCouter++;
				}
			}
		} while (numbersSwappedCouter != 0);
		
		return arr;
	}
	
	public static void printArray(int [] arraytoPrint) {
		System.out.print("Array after sort method: ");
		for(int arrayElement : arraytoPrint) {
			 System.out.print(arrayElement + " ");
		}
	}
}