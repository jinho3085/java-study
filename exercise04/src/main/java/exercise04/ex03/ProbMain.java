package exercise04.ex03;

import java.util.Scanner;

public class ProbMain {
	public static void main(String[] args) {
        Shape shape1 = new Circle(5);
        System.out.println("원 넓이: " + shape1.area());
        
        Shape shape2 = new Rectangle(10, 2);
        System.out.println("사각형 넓이: " + shape2.area());
	}
}