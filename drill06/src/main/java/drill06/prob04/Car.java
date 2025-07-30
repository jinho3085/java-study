package drill06.prob04;

public class Car {
	private String model;
	private int speed;

	public void show() {
		System.out.println("자동차: " + model + ", speed" + speed);
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void setName(String model) {
		this.model = model;
	}

	public String getModel1() {
		return model;
	}

	@Override
	public String toString() {
		return "Car[model" + model + ", speed=" + speed + "]";
	}

}
