package exercise02.prob01;

import java.util.Scanner;

public class Sol {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("시작 섭씨: ");
		int startC = scanner.nextInt();

		System.out.print("끝 섭씨: ");
		int endC = scanner.nextInt();

		System.out.print("증가 간: ");
		int step = scanner.nextInt();

		scanner.close();

		
		/* 코드 작성 */
				
		
		/* 출력 예시 */
		System.out.println("C\tF");
		System.out.println("0\t32.0");
		System.out.println("5\t41.0");
		System.out.println("10\t41.0");		
	}

}
