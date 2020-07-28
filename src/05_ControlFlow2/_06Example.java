/**
 * Example to show meaningful use of fall-through.
 * Refined version of _05Example.java
 *
 * This program displays traffic light colors using following logic.
 * if code (R/r) -> "RED"
 * if code (O/o) -> "ORANGE"
 * if code (G/g) -> "GREEN"
 * 
 * @author Udayan Khattry
 * 
 */
public class _06Example {
	public static void main(String[] args) {
		String colorCode = "R";
		switch (colorCode) {
			case "R":
			case "r": 
				System.out.println("Traffic light is RED.");
				break;
			case "O":
			case "o":
				System.out.println("Traffic light is ORANGE.");
				break;
			case "G":
			case "g":
				System.out.println("Traffic light is GREEN.");
				break;
			default:
				System.out.println("Invalid color code.");
				break;
		}
	}
}
