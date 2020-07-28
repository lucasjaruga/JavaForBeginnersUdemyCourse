/**
 * Example to show fall-through (not using break statements).
 *
 * This program displays traffic light colors using following logic.
 * if code (R/r) -> "RED"
 * if code (O/o) -> "ORANGE"
 * if code (G/g) -> "GREEN"
 * 
 * @author Udayan Khattry
 * 
 */
public class _05Example {
	public static void main(String[] args) {
		String colorCode = "r";
		switch (colorCode) {
			case "R":
				System.out.println("Traffic light is RED.");
			case "r":
				System.out.println("Traffic light is RED.");
			case "O":
				System.out.println("Traffic light is ORANGE.");
			case "o":
				System.out.println("Traffic light is ORANGE.");
			case "G":
				System.out.println("Traffic light is GREEN.");
			case "g":
				System.out.println("Traffic light is GREEN.");
			default:
				System.out.println("Invalid color code.");
		}
	}
}
