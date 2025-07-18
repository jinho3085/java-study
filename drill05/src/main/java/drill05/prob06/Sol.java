package drill05.prob06;

import java.util.Scanner;

public class Sol {

	public static void main(String[] args) {
		int[] numbers = new int[5];
		Scanner scanner = new Scanner(System.in);

		/* 코드 작성 */
		System.out.println("정수 5개를 입력하세요");
		
		for (int i = 0; i < 5; i++) {
			numbers[i] = scanner.nextInt();
		}
		int min = numbers[0];
		for (int i = 1; i < 5; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
			}
		}
		
		System.out.println("최솟값:" + min);
		
		scanner.close();
	}

}
