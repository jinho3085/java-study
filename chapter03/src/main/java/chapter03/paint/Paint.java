package chapter03.paint;

public class Paint {

	public static void main(String[] args) {
		Canvas canvas = new Canvas();

		Point point1 = new Point();
		point1.setX(10);
		point1.setY(20);
//		canvas.drawPoint(point1);
		canvas.draw(point1);
		
//		point1.disappear();
		point1.show(false);
		
		Point point2 = new Point(100, 200);
//		canvas.drawPoint(point2);
		canvas.draw(point2);
		
		ColorPoint point3 = new ColorPoint(50, 60, "red");
		// canvas.drawColorPoint(point3);
//		canvas.drawPoint(point3);
		canvas.draw(point3);
		
//		canvas.drawTriangle(new Triangle());
//		canvas.drawShape(new Triangle());
		canvas.draw(new Triangle());
		
//		canvas.drawRectngale(new Rectngale());
//		canvas.drawShape(new Rectnagle());
		canvas.draw(new Rectnagle());
		
//		canvas.drawCircle(new Circle());
//		canvas.drawShape(new Circle());
		canvas.draw(new Circle());
		
		canvas.draw(new GraphicText("Hello, World"));
	}
}
