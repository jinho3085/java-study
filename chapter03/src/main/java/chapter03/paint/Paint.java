package chapter03.paint;

public class Paint {

	public static void main(String[] args) {
		Canvas canvas = new Canvas();

		Point point1 = new Point();
		point1.setX(10);
		point1.setY(20);
		
		canvas.drawPoint(point1);

		Point point2 = new Point();
		point2.setX(100);
		point2.setY(200);
		
		canvas.drawPoint(point2);

	}

}
