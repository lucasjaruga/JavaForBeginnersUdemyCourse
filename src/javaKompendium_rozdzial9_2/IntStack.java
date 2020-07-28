package javaKompendium_rozdzial9_2;

interface IntStack {
	void push(int item); // zapamiętanie elementu
	int pop(); // pobranie elementu
	
	default void clear() {
		System.out.println("Metoda clear() nie zostala zaimplementowana.");
	}
}