package JavaCodingChallenge11.question1;

public class Pen {
	public String inkColor;
	public static String brand;
	
	public Pen(String inkColor) {
		this.inkColor = inkColor;
	}
	
	static {
		brand = "Parker";
	}
	
	
	public void getDetails() {
		System.out.println(brand + " : " + inkColor);
	}
}
