package drill06.prob10;

import java.util.Scanner;

public class ProbMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자입력: ");
		int number = scanner.nextInt();
		
		scanner.close();
		
		System.out.println("제곱: " + MathTool.square(number));
		System.out.println("2배: " + MathTool.doubleIt(number));		
	}

}
