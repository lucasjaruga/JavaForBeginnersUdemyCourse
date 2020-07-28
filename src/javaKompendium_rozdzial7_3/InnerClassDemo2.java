package javaKompendium_rozdzial7_3;

class Outer {
	int outer_x = 100;
	
	void test() {
		Inner inner = new Inner();
		inner.display();
	}
	
	class Inner {
		void display() {
			int y = 10; // only visible in Inner class
			System.out.println("Display: outer_x = " + outer_x);
		}
	}
	
//	void showY() {
//		System.out.println(y);
//	}
}

class InnerClassDemo2 {
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.test();
		
	}
}