package JavaCodingChallenge15.Question2;

public class TestAnimal2 {
	public static void main(String[] args) {
		Animal [] animals = new Animal[2];
		animals[0] = new Dog();
		animals[1] = new Cat();
		test(animals);
	}
	
	private static void test(Animal [] animals) {
		if(animals != null) {
			for(Animal obj : animals) {
				if(obj != null) {
					obj.eat();
					obj.sleep();
				}
			}
		}
	}
}