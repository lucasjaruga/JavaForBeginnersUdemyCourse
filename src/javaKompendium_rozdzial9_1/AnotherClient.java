package javaKompendium_rozdzial9_1;

class AnotherClient implements Callback {

	@Override
	public void callback(int p) {
		System.out.println("Inna wersja metody callback()");
		System.out.println("p podniesione do kwadratu to " + (p*p));
	}
}