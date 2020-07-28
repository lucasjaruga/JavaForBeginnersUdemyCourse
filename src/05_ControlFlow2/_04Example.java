/**
 * Example to show default block can be placed anywhere within switch block.
 *
 * This program displays traffic light colors using following logic.
 * if code (R/r) -> "RED"
 * if code (O/o) -> "ORANGE"
 * if code (G/g) -> "GREEN"
 * otherwise -> "Invalid color code."
 * 
 * @author Udayan Khattry
 * 
 */
public class _04Example {
	public static void main(String[] args) {
		String colorCode = "a";
		switch (colorCode) { //Use of String in switch expression was allowed from Java 7 onwards
			case "R":
				System.out.println("Traffic light is RED.");
				break;
			case "r":
				System.out.println("Traffic light is RED.");
				break;
			case "O":
				System.out.println("Traffic light is ORANGE.");
				break;
			case "o":
				System.out.println("Traffic light is ORANGE.");
				break;
			default:
				System.out.println("Invalid color code.");
				break;
			case "G":
				System.out.println("Traffic light is GREEN.");
				break;
			case "g":
				System.out.println("Traffic light is GREEN.");
				break;
		}
	}
}
