package JavaCodingChallenge9.question3;
public class B {
	public String msg1;
	public String msg2;
	
	public B() {
		this("Hello", "World");
	}
	
	public B(String s1, String s2) {
		msg1 = s1;
		msg2 = s2;
	}
	
	public void print() {
		System.out.println(msg1 + " " + msg2);
	}
}