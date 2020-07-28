package JavaCodingChallenge14.question1;

public abstract class Electronics{
	private boolean power = false;

	public final void powerOn() {
		System.out.println("Turning on... ");
		power = true;
	}

	public final void powerOff() {
		System.out.println("Turning off...");
		power = false;
	}

	public final boolean isOn() {
		return power;
	}

	public abstract void operate();
}

