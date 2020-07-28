/**
 * This example calculates the average of Java Certification scores.
 * Several int variables are used to store the scores.
 * Adding new scores or removing existing scores invites changes at 4 places.
 * 
 * @author Udayan Khattry
 */
public class FindAverage {
	public static void main(String[] args) {
		//Primitive way of finding average.
		int score1 = 85;
		int score2 = 70;
		int score3 = 95;
		int score4 = 90;
		int score5 = 75;
		
		int avgScore = (score1 + score2 + score3 + score4 + score5) / 5;
		System.out.println("Average Score of 5 students: " + avgScore);
	}
}
