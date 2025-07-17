package drill03.prob01;

/**
 * 
 * 문제 1. 숫자의 부호 판별
 * 
 * 정수 num이 양수면 "양수", 음수면 "음수", 0이면 "0입니다"를 출력하세요.
 * 
 */

public class Sol {

	public static void main(String[] args) {
		int num = -12;
		// if ~ else if ~ else로 구현
		if(num > 0) {
			System.out.println("양수");
		} else if(num < 0) {
			System.out.println("음수");
		} else {
			System.out.println("0입니다");
		}
	}

}
