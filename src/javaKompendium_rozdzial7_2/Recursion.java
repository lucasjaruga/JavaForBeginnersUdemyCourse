package javaKompendium_rozdzial7_2;

class Factorial {
	int fact(int n) {
		int result;
		
		if(n == 1) return 1;
		result = fact(n-1) * n;
		return result;
	}
}




class Recursion {
	public static void main(String[] args) {
		Factorial f = new Factorial();
		
		System.out.println("3! wynosi " + f.fact(3));
		System.out.println("4! wynosi " + f.fact(4));
		System.out.println("5! wynosi " + f.fact(5));
	}
}