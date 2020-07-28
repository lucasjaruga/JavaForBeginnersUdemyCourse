package JavaCodingChallenge6.question1;

public class Question {
	public static void main(String[] args) {
		int [][] chessBoard = new int[8][8];
		int x = 1;
		
		for(int i = 0; i < chessBoard.length; i++) {
			for(int j = 0; j < chessBoard[i].length; j++) {
				chessBoard[i][j] = x++;
			}
		}
		
		for(int i = 0; i < chessBoard.length; i++) {
			for(int j = 0; j < chessBoard[i].length; j++) {
				System.out.print(chessBoard[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
}