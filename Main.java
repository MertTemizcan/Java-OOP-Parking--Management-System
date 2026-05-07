package oopPractice;

public class Main {
	public static void main(String[] args) {

		Car araba1 = new Car("34 BJL 1934", "Mercedes", "CLA", 4);
		araba1.setMotorRunning(true);
		araba1.move(15);
		araba1.showInfos();

		System.out.println("---------------------------------");

		Motorcycle motor1 = new Motorcycle("34 MOT 99", "Yamaha", "R6", false);
		motor1.showInfos();
		motor1.move(5);
	}
}