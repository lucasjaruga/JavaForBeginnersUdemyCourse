package javaKompendium_rozdzial7_4;

class Outer {
	int outer_x = 100;
	
	void test() {
		while(outer_x == 100) {
			class Inner {
				void display() {
					System.out.println("display: outer_x: " + outer_x);
				}
			}
			Inner inner = new Inner();
			inner.display();
		}
	}
}

class InnerClassDemo {
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.test();
		
	}
}