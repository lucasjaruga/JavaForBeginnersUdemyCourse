package JavaCodingChallenge11.question2;

public class TestA {
	public static void main(String[] args) {
		A a1 = new A(0,0);
		A a2 = new A(1,1);
		A a3 = new A(2,2);
		
		System.out.println("(" + a1.n1 + ", " + a1.n2 + ")");
		System.out.println("(" + a2.n1 + ", " + a2.n2 + ")");
		System.out.println("(" + a3.n1 + ", " + a3.n2 + ")");
		
		System.out.println("------------------------");
		
		a1.getDetails();
		a2.getDetails();
		a3.getDetails();
	}
}