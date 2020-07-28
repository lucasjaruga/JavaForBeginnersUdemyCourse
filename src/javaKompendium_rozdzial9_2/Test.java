package javaKompendium_rozdzial9_2;

class Test implements IntStack{
	public void push(int item) {
	}
	public int pop() {
		return 1;
	}
	
	public void clear() {
		IntStack.super.clear();
	}
	
	
	public static void main(String[] args) {
		Test a = new Test();
		
		a.clear();
	}
}
