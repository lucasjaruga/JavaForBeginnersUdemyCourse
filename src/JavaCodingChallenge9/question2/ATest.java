package JavaCodingChallenge9.question2;

public class ATest {
	public static void main(String[] args) {
		A a1 = new A();
		a1.print();
		
		A a2 = new A("test");
		a2.print();
		
		A a3 = new A(9876.000873);
		a3.print();
		
		A a4 = new A("test", 5.6);
		a4.print();
	}
}