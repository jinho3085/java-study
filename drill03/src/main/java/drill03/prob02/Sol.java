package drill03.prob02;

/**
 * 
 * 문제 2. 윤년(leap year) 판별
 * 
 * 연도가 다음 조건을 만족하면 윤년입니다:
 * 
 * 4의 배수이면서, 100의 배수가 아니거나,
 * 400의 배수일 때
 * 
 * 
 */

public class Sol {

	public static void main(String[] args) {
		int year = 2024;
		// "윤년입니다" 또는 "윤년이 아닙니다" 출력
		
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println("윤년입니다");
		} else {
			System.out.println("윤년이 아닙니다");
		}
		
		
	}

}
