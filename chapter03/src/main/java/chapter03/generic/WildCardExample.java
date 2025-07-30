package chapter03.generic;

import java.util.ArrayList;
import java.util.List;

import com.bit2025.paint.shape.Circle;
import com.bit2025.paint.shape.Triangle;
import com.bit2025.paint.shape.Shape;
import com.bit2025.paint.shape.Rectangle;

public class WildCardExample {

	public static void main(String[] args) {
		// List<Point> points = new ArrayList<>();
		// draw(points);
		
		List<Circle> circles = new ArrayList<>();
		draw(circles);
		
		List<Shape> shapes = new ArrayList<>();
		shapes.add(new Circle());
		shapes.add(new Rectangle());
		draw(shapes);
		
		System.out.println("=======================");
		draw(new Circle(), new Triangle(), new Circle(), new Rectangle());
		
	}
	
	public static void draw(List<? extends Shape> shapes) {
		for(Shape shape : shapes) {
			shape.draw();
		}
	}

	public static <T extends Shape> void draw(T...shapes) {
		for(Shape shape : shapes) {
			shape.draw();
		}
	}

}
