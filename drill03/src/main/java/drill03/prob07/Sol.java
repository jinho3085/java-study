package drill03.prob07;

/**
 * 
 * 문제 7. switch – 계절 출력
 * 
 * 월(month)에 따라 계절을 출력하세요:
 * 
 * 
 * 출력 예시:
 * 
 * 3~5 → 봄
 * 6~8 → 여름
 * 9~11 → 가을
 * 12,1,2 → 겨울
 * 
 */
public class Sol {

	public static void main(String[] args) {
		int month = 7;
		// switch + case 여러 개 묶기 활용
		
		switch(month) {
		case 3 :
		case 4 :
		case 5 : 
			System.out.println("봄");
			break;
		case 6 :
		case 7 :
		case 8 :
			System.out.println("여름");
			break;
		case 9 :
		case 10 :
		case 11 :
			System.out.println("가을");
			break;
		case 12 :
		case 1 :
		case 2 :
			System.out.println("겨울");
			break;
		default :
			System.out.println("잘못된 입력입니다.");
		}

	}

}
