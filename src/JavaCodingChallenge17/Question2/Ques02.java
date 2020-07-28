package JavaCodingChallenge17.Question2;

public class Ques02 {
	enum Direction {
		NORTH, EAST, WEST, SOUTH
	}
	
	public static void main(String[] args) {
		Direction [] arr = Direction.values();
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i].name().toUpperCase().charAt(0));
		}
	}
}