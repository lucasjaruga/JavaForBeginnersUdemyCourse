package JavaCodingChallenge7.question1;

public class question {
	public static void main(String[] args) {
		char [][] arr = {   
				{'*'},
				{'*', '*'},
				{'*', '*', '*'},
				{'*', '*', '*', '*'}, 
				{'*', '*', '*', '*', '*'},  
				{'*', '*', '*', '*', '*', '*'}, 
				{'*', '*', '*', '*', '*', '*', '*'},
		}; 
		
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("----------------------------");
		System.out.println();
		
		for(char [] x : arr) {
			for(char y : x) {
				System.out.print(y);
			}
			System.out.println();
		}
	}
}