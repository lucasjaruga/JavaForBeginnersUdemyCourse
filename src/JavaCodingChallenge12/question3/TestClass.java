package JavaCodingChallenge12.question3;

public class TestClass extends MyClass {
	
	static {
		System.exit(-1);
	}
	
	// or
	
	public static void method() {
	}
	
	public static void main(String[] args) {
		
		new TestClass();
		
	}
}