package exercise04.ex08;

import java.util.ArrayList;
import java.util.List;

public class ProbMain {

	public static void main(String[] args) {
		Shape[] shapes = { new Rectangle(5, 6), new RectTriangle(6, 2) };

		for (Shape shape : shapes) {
			System.out.println("area:" + shape.getArea());
			System.out.println("perimeter:" + shape.getPerimeter());

			if (shape instanceof Resizable) {
				Resizable resizable = (Resizable) shape;
				resizable.resize(0.5);
				System.out.println("new area:" + shape.getArea());
				System.out.println("new perimeter:" + shape.getPerimeter());
			}
		}
	}
}