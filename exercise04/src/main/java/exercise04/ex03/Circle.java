package exercise04.ex03;

public class Circle extends Shape {
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	@Override
	public double area() {
		return Math.PI * radius * radius; // 원 넓이
	}

}
