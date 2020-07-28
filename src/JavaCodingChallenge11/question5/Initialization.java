package JavaCodingChallenge11.question5;

public class Initialization {
	{
		System.out.println(5);
	}
	
	static {
		System.out.println(4);
	}
	
	public static void main(String[] args) {
		new Initialization();
	}
}