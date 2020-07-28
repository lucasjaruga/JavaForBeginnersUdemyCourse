package JavaCodingChallenge15.Question5;

import java.io.IOException;

public class Question5 {
	public static void main(String[] args) {
		Question5 obj = new Question5();
		try {
			obj.test1();
		} catch(RuntimeException ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	private void test1() {
		test2();
	}
	
	private void test2() {
		test3();
	}
	
	private void test3() {
		IOException ex = new IOException("Java Exception Framework");
		NullPointerException e = null;
		e = new NullPointerException(ex.getMessage());
		throw e;
	}
}