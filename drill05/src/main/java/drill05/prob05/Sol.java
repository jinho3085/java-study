package drill05.prob05;

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
		int max = numbers[0];
		for (int i = 1; i < 5; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		
		
	//System.out.println("int의 최대값: " + Integer.MAX_VALUE);
	
		System.out.println("최댓값:" + max);
		
		scanner.close();		
	}

}
