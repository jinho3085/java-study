package drill06.prob03;

import java.util.Scanner;

public class ProbMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String name = null;
		int score = 0;

		// 학생1
		System.out.print("학생1: ");
		name = scanner.next();
		score = scanner.nextInt();

		// 학생2
		System.out.print("학생2: ");
		name = scanner.next();
		score = scanner.nextInt();

		scanner.close();
	}

}
