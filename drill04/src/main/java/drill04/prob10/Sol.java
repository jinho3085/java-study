package drill04.prob10;

/**
 * 
 * 문제 10. 별 피라미드 출력 - for 중첩 사용
 * 
 * 다음과 같이 for문을 중첩 사용하여 5줄의 별을 피라미드처럼 출력하세요.
 * 
 * 출력 예시:
 * 
 * *
 * **
 * ***
 * ****
 * *****
 * 
 * 
 */

public class Sol {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) { // j <= i
				System.out.print("*"); // ("*")
			}
			System.out.println();
		}
	}

}
