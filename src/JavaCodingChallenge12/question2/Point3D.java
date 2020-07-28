package JavaCodingChallenge12.question2;

public class Point3D extends Point2D {
	private int z;
	
	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	public int getZ() {
		return z;
	}
	
	@Override
	public String toString() {
		String res = "(" + getX() + ", " + getY() + ", " + getZ() + ")";
		return res;
	}

}