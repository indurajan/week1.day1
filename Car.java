package week1.day1;

public class Car {
	public void driveCar() {
		System.out.println("Car Started successfully");
	}
	
	public void applyBrake() {
		System.out.println("Brake Applied successfully");
	}
	public void soundHorn() {
		System.out.println("It is a Sound Horn");
	}
	public void isPuncture() {
		System.out.println("Tyre is Puncture");
	}
	public static void main(String[] args) {
		Car c = new Car();
		c.driveCar();
		c.applyBrake();
		c.soundHorn();
		c.isPuncture();
	}
}
