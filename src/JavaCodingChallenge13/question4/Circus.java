package JavaCodingChallenge13.question4;

public class Circus {
	public static void doTrick(Animal animal) {
		animal.walk();
		if(animal instanceof Dog) {
			((Dog) animal).wagTail();
		}
		
		if(animal instanceof Cat) {
			((Cat) animal).jump();
		}
		
	}
	
	
	public static void main(String[] args) {
		Animal a1 = new Animal();
		Circus.doTrick(a1);
		
		Animal a2 = new Dog();
		Circus.doTrick(a2);
		
		Animal a3 = new Cat();
		Circus.doTrick(a3);
		
	byte x = 50;
	x = (byte)(x * 2);
	
	System.out.println(x);
	
	
	System.out.println("----------------");
	System.out.println();
	
	for(int i = 0; i < 10; i++) {
		System.out.print(i + " ");
		System.out.print(i%2 == 0);
		if(i%2 == 0) continue;
		System.out.println("");
	}
	
	
	
	
	
	}
}