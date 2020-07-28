package JavaCodingChallenge13.question3;

public class Point {
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Point) {
			Point p = (Point)obj;
			if(p.x == this.x && p.y == this.y) {
				return true;
			}
		}
		return false;
	}
}