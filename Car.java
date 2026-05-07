package oopPractice;

public class Car extends Vehicle {
	private int doors;

	public Car(String plate, String brand, String model, int doors) {
		super(plate, brand, model);
		this.doors = doors;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	@Override
	public void showInfos() {
		super.showInfos();
		System.out.println("Kapı Sayısı: " + doors);
	}
}