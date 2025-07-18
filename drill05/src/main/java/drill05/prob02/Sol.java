package drill05.prob02;

import java.util.Scanner;

public class Sol {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		/* 코드 작성 */
		int[] numbers = new int[6]; // 정수 6개를 저장할 배열
		
		for (int i = 0; i < 6; i++) {
			numbers[i] = scanner.nextInt(); // 키보드 입력 후 배열 저장
		} 
		for (int i = 0; i < 6; i++) {
			if (numbers[i] % 2 == 0) // 2로 나눈 나머지값이 0
			System.out.print(numbers[i] + " ");
		}
		
		
		
		
		
		scanner.close();
		
	}

}
