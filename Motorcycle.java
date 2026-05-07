package oopPractice;

public class Motorcycle extends Vehicle {
	private boolean hasSidecar;

	public Motorcycle(String plate, String brand, String model, boolean hasSidecar) {
		super(plate, brand, model);
		this.hasSidecar = hasSidecar;
	}

	public boolean isHasSidecar() {
		return hasSidecar;
	}

	public void setHasSidecar(boolean hasSidecar) {
		this.hasSidecar = hasSidecar;
	}

	@Override
	public void showInfos() {
		super.showInfos();
		System.out.println("Sepet Var mı?: " + (hasSidecar ? "Evet" : "Hayır"));
	}
}