package drill05.prob03;

import java.util.Scanner;

public class Sol {

	public static void main(String[] args) {
		
		int[] numbers = new int [4];
		
		Scanner scanner = new Scanner(System.in);

		/* 코드 작성 */
		
		System.out.print("정수 4개를 입력하세요");
		// 입력은 순서대로
		for (int i = 0; i < 4; i++) {
			numbers[i] = scanner.nextInt();
		}
		
		System.out.print("역순:");
		// 출력만 역순으로
		for (int i = 3; i >= 0; i--) {
			System.out.print(numbers[i] + " ");
		}
		
			scanner.close();
	}

}
