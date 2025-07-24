package exercise04.ex03;

import java.util.Scanner;

public class ProbMain {
	public static void main(String[] args) {
        Shape circle = new Circle(5);
        System.out.println("원 넓이: " + circle.area());
        
        Shape rect = new Rectangle(10, 2);
        System.out.println("사각형 넓이: " + rect.area());
	}
}