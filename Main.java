package oopPractice;

public class Main {
	public static void main(String[] args) {

		Car car1 = new Car("34 BJL 1934", "Mercedes", "Cla", 4);
		car1.setMotorRunning(true);
		car1.move(15);
		car1.showInfos();

		System.out.println("---------------------------------");

		Motorcycle motorCycle1 = new Motorcycle("34 MOT 99", "Yamaha", "R6", false);
		motorCycle1.showInfos();
		motorCycle1.move(5);
	}
}