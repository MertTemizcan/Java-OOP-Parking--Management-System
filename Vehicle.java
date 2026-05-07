package oopPractice;

public class Vehicle {
	protected String plate;
	protected String brand;
	protected String model;
	protected String status;
	protected boolean isMotorRunning;
	protected int kilometer;
	protected String entryTime;
	protected String location;

	public Vehicle(String plate, String brand, String model) {
		this.plate = plate;
		this.brand = brand;
		this.model = model;
		this.isMotorRunning = false;
		this.status = "Duruyor";
		this.kilometer = 0;
		this.location = "Giriş Kapısı";
	}


	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}

	public boolean isMotorRunning() {
		return isMotorRunning;
	}

	public void setMotorRunning(boolean motorRunning) {
		isMotorRunning = motorRunning;
	}

	public int getKilometer() {
		return kilometer;
	}

	public void setKilometer(int km) {
		if (km >= 0) {
			this.kilometer = km;
		} else {
			System.out.println("Kilometre negatif olamaz");
		}
	}

	public void move(int moveKm) {
		if (!isMotorRunning) {
			System.out.println("Motor kapalıyken araç ilerleyemez");
		} else {
			this.kilometer += moveKm;
			this.status = "Hareket Ediyor";
			System.out.println(plate + " plakalı araç " + moveKm + " km yol yaptı. Yeni KM: " + kilometer);
		}
	}

	public void showInfos() {
		System.out.println("--- Araç Bilgileri ---");
		System.out.println("Plaka: " + plate);
		System.out.println("Marka ve Model: " + brand + " " + model);
		System.out.println("Güncel Kilometre: " + kilometer);
		System.out.println("Motor Durumu: " + (isMotorRunning ? "Açık" : "Kapalı"));
	}
}