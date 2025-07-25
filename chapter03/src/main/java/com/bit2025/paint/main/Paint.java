package com.bit2025.paint.main;

import java.io.Serializable;

import com.bit2025.paint.canvas.Canvas;
import com.bit2025.paint.point.ColorPoint;
import com.bit2025.paint.point.Point;
import com.bit2025.paint.shape.Circle;
import com.bit2025.paint.shape.Rectnagle;
import com.bit2025.paint.shape.Triangle;
import com.bit2025.paint.shape.shape;
import com.bit2025.paint.text.GraphicText;

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
		
		/* instanceof 연산자 */
		
		Circle c = new Circle();
		System.out.println(c instanceof Object);
		System.out.println(c instanceof shape);
		System.out.println(c instanceof Circle);
		
		// 오류: 컴파일 타임에 타입 검사도 하기 떄문에 상속 하이어라키(hierachy) 전혀 없으면 에러 발생
		// System.out.println(c instanceof Point);
		
		// 다운캐스팅 전에 타입 검사
		Object o = new Circle(); 
		if(o instanceof String) {
			String s = (String)o;
		}
		
		// 우측항이 인터페이스인 경우	
		// 상속 hierachy 상관없이 사용할 수 있다.
		System.out.println(c instanceof Drawable);
		System.out.println(c instanceof Serializable);
	}
}
