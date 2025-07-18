package drill05.prob10;

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
		
		System.out.println("역순:");
		for (int i = 4; i >= 0; i--) {
			System.out.print(numbers[i] + " ");
		}
		
		int temp = numbers[0];
		numbers[0] = numbers[4];
		numbers[1] = numbers[3];
		numbers[4] = temp;
		
		System.out.println(Arrays.toString(numbers));
		scanner.close();		
	}

}
