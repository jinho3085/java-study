package drill05.prob08;

import java.util.Scanner;

public class Sol {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		/* 코드 작성 */
		int[] numbers = new int[6];

		System.out.println("정수을 입력하세요");
		for (int i = 0; i < 6; i++) {
			numbers[i] = scanner.nextInt();
		}

		// 중복 제거 후 출력
		System.out.println("중복제거 후 결과:");
		for (int i = 0; i < 6; i++) {
			boolean isSame = false; // 중복 여부 저장하는 변수, boolean은 true 혹은 false 판별

			// j는 i보다 앞에 있는 값들과 비교하는 용도
			for (int j = 0; j < i; j++) {
				if (numbers[i] == numbers[j]) {
					isSame = true; // 같은 숫자가 이미 있다면 true
					break;
				}
			}

			if (!isSame) {
				System.out.print(numbers[i] + " ");
			}

		}

		scanner.close();
	}

}
