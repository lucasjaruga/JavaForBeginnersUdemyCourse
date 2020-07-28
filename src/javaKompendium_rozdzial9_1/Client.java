package javaKompendium_rozdzial9_1;

class Client implements Callback {

	@Override
	public void callback(int p) {
		System.out.println("wywolanie callback() z wartoscia " + p);
	}
	
	void nonIfaceMeth() {
		System.out.println("Klasa implementujaca interfejs " +
							"moze zawierac takze wlasne metody.");
	}
	
	interface NestedIf {
		void nestedInterfaceMethod();
	};
}