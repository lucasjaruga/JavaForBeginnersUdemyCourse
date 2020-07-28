package JavaCodingChallenge11.question2;

public class A {
	public int n1;
	public int n2;
	
	public A(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	
	static {
		System.out.println("Loaded A class template...");
	}
	
	public void getDetails() {
		System.out.println("(" + this.n1 + ", " + this.n2 + ")");
	}
}