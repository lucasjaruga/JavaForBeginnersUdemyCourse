package javaKompendium_rozdzial7_5;

class VarArgs {
	static void vaTest(int ... v) {
		System.out.print("Liczba argumentow: " + v.length + " Zawartosc: ");
		
		for(int x : v)
			System.out.print(x + " ");
		
		System.out.println();
	}
	
	static void vaTest(int v) {}
	static void vaTest(byte ... v) {}
	static void vaTest(char ... v) {}
	static void vaTest() {}
	
	
	
	public static void main(String[] args) {
		vaTest(10);
		vaTest(1, 2, 3);
		vaTest();
	}
}