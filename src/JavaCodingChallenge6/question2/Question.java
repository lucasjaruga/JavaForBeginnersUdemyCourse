package JavaCodingChallenge6.question2;

public class Question {
	public static void main(String[] args) {
		char [][] chessBoard = {
				{'W','B', 'W', 'B','W', 'B', 'W', 'B'},
				{'B','W', 'B', 'W','B', 'W', 'B', 'W'},
				{'W','B', 'W', 'B','W', 'B', 'W', 'B'},
				{'B','W', 'B', 'W','B', 'W', 'B', 'W'},
				{'W','B', 'W', 'B','W', 'B', 'W', 'B'},
				{'B','W', 'B', 'W','B', 'W', 'B', 'W'},
				{'W','B', 'W', 'B','W', 'B', 'W', 'B'},
				{'B','W', 'B', 'W','B', 'W', 'B', 'W'},
		};
		
		
		
		for(int i = 0; i < chessBoard.length; i++) {
			for(int j = 0; j < chessBoard[i].length; j++) {
				System.out.print(chessBoard[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}