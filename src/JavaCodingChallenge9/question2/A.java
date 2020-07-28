package JavaCodingChallenge9.question2;

public class A {
	public String str = "JAVA";
	public double val = 0.0;
	
	public A() {
	}
	
	public A(String text) {
		this.str = text;
	}
	
	public A(double doublePointNumber) {
		this.val = doublePointNumber;
	}
	
	public A(String text, double doublePointNumber) {
		this.str = text;
		this.val = doublePointNumber;
	}
	
	public void print() {
		System.out.println("str: " + str + ", val: " + val);
	}
}