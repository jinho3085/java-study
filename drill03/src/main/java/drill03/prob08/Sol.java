package drill03.prob08;

/**
 * 
 * 문제 8. 점수에 따른 Pass/Fail 출력
 * 
 * 평균 점수가 60점 이상이면서, 과락(과목 하나가 40점 미만)이 없으면 "Pass", 아니면 "Fail" 출력
 * 
 * 
 */
public class Sol {

	public static void main(String[] args) {
		int kor = 80, eng = 75, math = 35;
		int avg = (kor  + eng + math) / 3;
		
		if (avg >= 60 && kor >= 40 && eng >= 40 && math >= 40) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		
		
		// 평균 구하기
		// 조건식 복합 사용

	}

}
