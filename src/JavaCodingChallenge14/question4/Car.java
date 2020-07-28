package JavaCodingChallenge14.question4;

public class Car {
	private Engine engine;
	
	public Car(Engine engine) {
		this.engine = engine;
	}
	
	public void startCar(){
		engine.start();
		System.out.println("Car has started.");
	}
	
	public void stopCar() {
		engine.stop();
		System.out.println("Car has stopped.");
	}
}