package JavaCodingChallenge5.question4;

public class Question {
	public static void main(String[] args) {
		short [] scores = {51, 85, 32, 0, 98, 157, 82, 101, 64, 249};
		
		int halfCenturies = 0;
		int centuries = 0;
		int doubleCenturies = 0;
		
		for(int i = 0; i < scores.length; i++) {
			if(scores[i] >= 50 && scores[i] < 100) {
				halfCenturies++;
			} else if (scores[i] >= 100 && scores[i] < 200) {
				centuries++;
			} else if (scores[i] >= 200){
				doubleCenturies++;
			}
		}
		
		System.out.println("Half-centuries: " + halfCenturies);
		System.out.println("Centuries: " + centuries);
		System.out.println("Double-centuries: " + doubleCenturies);
	}
}