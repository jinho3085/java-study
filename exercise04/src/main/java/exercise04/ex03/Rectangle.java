package exercise04.ex03;

public class Rectangle extends Shape {
	private double width;
	private double height;
	
	public Rectangle(double width, double height) {
		this.height = height;
		this.width = width;
	}

	@Override
	public double area() {
		return width * height; // 사각형 넓이
	}

}
