package javaKompendium_rozdzial10_1;

class Exc2 {
	  public static void main(String args[]) {
	    int d, a;

	    try { // monitorowanie bloku kodu
	      d = 0;
	      a = 42 / d;
	      System.out.println("To nie zostanie wyświetlone.");
	    } catch (ArithmeticException e) { // złapanie błędu dzielenia przez zero
	      System.out.println("Dzielenie przez zero.");
	    }
	    System.out.println("Po instukcji catch.");
	  }
	}