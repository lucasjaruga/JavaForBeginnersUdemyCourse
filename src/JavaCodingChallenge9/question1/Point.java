package JavaCodingChallenge9.question1;

public class Point {
	public int x;
	public int y;
	
	public Point(int xLocation, int yLocation) {
		this.x = xLocation;
		this.y = yLocation;
	}
	
	public Point() {
		this.x = 0;
		this.y = 0;
	}
	
	public void printPoint() {
		System.out.println("Point: (" + this.x + ", " + this.y + ")");
	}
}