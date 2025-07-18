package drill05.prob07;

import java.util.Arrays;
import java.util.Scanner;

public class Sol {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		
		
		int[] numbers = new int[5];
		
		System.out.println("배열:");
		for(int i = 0; i < 5; i++) { 
			numbers[i] = scanner.nextInt();
		}	
		
		System.out.println("찾을값:");
		int target = scanner.nextInt();
		
		scanner.close();
		
		/* 코드 작성 */
		System.out.println(Arrays.toString(numbers));
		System.out.println(target);
	}

}
