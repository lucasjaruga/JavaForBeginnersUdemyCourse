package JavaCodingChallenge15.Question2;

public class Dog extends Animal{
	@Override
	public void eat() {
		System.out.println("Dog is eating.");
	}
	
	@Override
	public void sleep() {
		System.out.println("Dog is sleeping.");
	}
}