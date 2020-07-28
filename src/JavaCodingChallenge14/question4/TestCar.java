package JavaCodingChallenge14.question4;

public class TestCar {
	public static void main(String[] args) {
		Car car = new Car(new Engine());
		car.startCar();
		car.stopCar();
	}
}