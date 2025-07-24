package chapter03.paint;

public class Circle extends shape {
	private int radius;

	@Override
	public void draw() {
		System.out.println("원을 그렸습니다.");
	}
	
}
