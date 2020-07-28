/**
 * Find average scores using array.
 * 
 * Commented code uses 1-D array to solve this problem.
 * Adding new scores or removing existing scores invites changes at 5 places.
 * 
 * Un-commented code uses 1-D array, array.length property along with for loop
 * to provide the solution in such a way that adding / removing scores is very easy.
 * You just need to make the change at one place.
 * 
 * @author Udayan Khattry
 *
 */
public class FindAverage1 {
	public static void main(String[] args) {
		/*
		 Below code declares and initializes an int array of 5 elements.
		 Each elements or the array is assigned value at separate statement.
		 */
//		int [] scores = new int[5];
//		scores[0] = 85;
//		scores[1] = 70;
//		scores[2] = 95;
//		scores[3] = 90;
//		scores[4] = 75;
		
		/*
		 Below statement instantiated and int array of 5 elements 
		 directly by initializing it with data.
		 To add more scores, just add as comma separated values.
		 */
		int [] scores = {85, 70 , 95, 90, 75};
		
		/*
		 Old way of calculating average. Add all the elements and divide it by number of elements.
		 To include one more score in average, make changes in this expression.
		 */
//		int avgScore = (scores[0] + scores[1] + scores[2] + scores[3] + scores[4]) / 5;
		
		/*
		 Print the result on to the console.
		 Change the number of students, if you want to add/remove scores.
		 */
//		System.out.println("Average Score of 5 students: " + avgScore);
		
		
		/*
		 Calculate average using loops.
		 No need to change the code to include more scores.
		 */
		int sum = 0;
		for(int i = 0; i < scores.length; i++){
			sum = sum + scores[i];//Same as sum += scores[i];
		}
		int avgScore = sum / scores.length;
		
		/*
		 Print the result on to the console. No need to change as scores.length
		 is replaced at runtime with the size of the array.
		 */
		System.out.println("Average Score of " + scores.length + " students: " + avgScore);
	}
}
