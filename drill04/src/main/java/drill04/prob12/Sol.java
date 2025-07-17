package drill04.prob12;

import java.util.Scanner;

/**
 * 
 * 문제 12. 소수(Prime Number) 판별
 * 
 * 사용자로부터 정수 하나를 입력받아, 그 수가 소수(prime number)인지 여부를 출력하는 프로그램을 작성하세요.
 * 
 * - 소수란, 1과 자기 자신으로만 나누어 떨어지는 수를 의미합니다.
 * - 예: 2, 3, 5, 7, 11, 13, 17, ...
 * 
 */

public class Sol {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요[2 - ]: 13");
		int number = scanner.nextInt();
		
		System.out.println(number);
		
		scanner.close();
	}

}
