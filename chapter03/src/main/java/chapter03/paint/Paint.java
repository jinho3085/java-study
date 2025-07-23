package chapter03.paint;

public class Paint {

	public static void main(String[] args) {
		Canvas canvas = new Canvas();

		Point point1 = new Point();
		point1.setX(10);
		point1.setY(20);
		canvas.drawPoint(point1);
		
//		point1.disappear();
		point1.show(false);
		
		Point point2 = new Point(100, 200);
		canvas.drawPoint(point2);

	}

}
