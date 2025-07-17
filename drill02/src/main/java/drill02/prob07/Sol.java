package drill02.prob07;

/**
 * 
 * 문제 7. 간단한 계산기
 * 
 * 문제:
 * 두 정수형 변수 x=10, y=3을 선언하고, 사칙연산 결과를 출력하는 프로그램 작성
 * 
 * 
 * 출력 예시:
 * 
 * 10 + 3 = 13
 * 10 - 3 = 7
 * 10 * 3 = 30
 * 10 / 3 = 3
 * 
 */
public class Sol {

	public static void main(String[] args) {
		int x = 10;
		int y = 3;
		
		System.out.println("덧셈" + (x + y));
		System.out.println("뺏셈" + (x - y));
		System.out.println("곱셈" + (x * y));
		System.out.println("나눗셈" + (x / y));
	}

}
