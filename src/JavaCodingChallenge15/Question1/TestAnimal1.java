package JavaCodingChallenge15.Question1;

public class TestAnimal1 {
	public static void main(String[] args) {
		Animal [] animals = null;
		test(animals);
		animals = new Animal[2];
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