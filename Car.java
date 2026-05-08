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
		if(doors == 2 || doors == 4) {
			this.doors = doors;
		} else {
			System.out.println("Kapı sayısı sadece 2 veya 4 olabilir");
		}
	}

	@Override
	public void showInfos() {
		super.showInfos();
		System.out.println("Kapı sayısı: " + doors);
	}
}