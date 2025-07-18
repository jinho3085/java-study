package drill05.prob04;

import java.util.Scanner;

public class Sol {

	public static void main(String[] args) {

		int[] numbers = new int[4];
		Scanner scanner = new Scanner(System.in);

		/* 코드 작성 */
		System.out.println("정수 4개를 입력하세요");

		for (int i = 0; i < 4; i++) {
			numbers[i] = scanner.nextInt(); // 입력 저장
		}
		int sum = 0;
		for (int i = 0; i < 4; i++) {
			sum = sum + numbers[i]; // 합계(sum)에 numbers[i]번째 숫자를 더한 후 = sum저장
		}
		double average = (double) sum / 4; // (double)은 정수를 실수로 바꾸기 -> 정확한 평균값(소수점 포함)

		System.out.println("평균:" + average);

		scanner.close();
	}

}
