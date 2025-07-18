package drill05.prob09;

import java.util.Arrays;
import java.util.Scanner;

public class Sol {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] numbers = new int[5];

		/* 코드 작성 */

		System.out.println("정수를 입력");
		for (int i = 0; i < 5; i++) {
			numbers[i] = scanner.nextInt();
		}

		int temp = numbers[0];
		numbers[0] = numbers[4];
		numbers[4] = temp;

		System.out.println(Arrays.toString(numbers)); 
		// Arrays: 배열, toString(numbers): 읽기 쉽게 문자열로 바꿔주는 함수
		scanner.close();
	}

}
