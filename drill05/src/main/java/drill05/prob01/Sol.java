package drill05.prob01;

import java.util.Arrays;
import java.util.Scanner;

public class Sol {

	public static void main(String[] args) {
//		final int ARRAY_LENGTH = 5;
//
//		Scanner scanner = new Scanner(System.in);
//
//		/* 코드 작성 */
//		int[] numbers = new int[ARRAY_LENGTH];
//		for (int i = 0; i < ARRAY_LENGTH; i++) {
//			numbers[i] = scanner.nextInt();
//		}
//
//		System.out.println(Arrays.toString(numbers));
//
//		scanner.close();
		
		int[] numbers = new int [5]; // 정수 5개
		
		Scanner scanner = new Scanner(System.in); // 입력 도구의 자료형(클래스), 변수, (키보드로부터 입력 받는 스캐너)
		
		// 정수를 입력 받아서 배열에 저장
		System.out.println("정수 5개를 입력하세요");
		for (int i = 0; i < 5; i++) {
			numbers[i] = scanner.nextInt(); // 입력받은 숫자를 배열에 저장
		}
		
		System.out.println("입력한 숫자:");
		for (int i = 0; i < 5; i++) {
			System.out.print(numbers[i] + " ");
		}
		
		scanner.close();
	}
}
