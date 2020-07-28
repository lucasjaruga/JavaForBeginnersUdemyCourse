package JavaCodingChallenge13.question4;

public class Animal {
	public void walk() {
		System.out.println("Animal is walking.");
	}
}

class Dog extends Animal {
	public void walk() {
		System.out.println("Dog is walking.");
	}
	
	public void wagTail() {
		System.out.println("Dog is wagging it's tail.");
	}
}

class Cat extends Animal {
	public void walk() {
		System.out.println("Cat is walking.");
	}
	
	public void jump() {
		System.out.println("Cat is jumping.");
	}
}