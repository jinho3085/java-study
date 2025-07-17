package drill03.prob06;

/**
 * 
 * 문제 6. 문자열 비교
 * 
 * 사용자 입력 이름이 "admin"이면 "관리자입니다", 아니면 "일반 사용자입니다" 출력.
 * 
 */
public class Sol {

	public static void main(String[] args) {
		String name = "admin";
		// 문자열 비교에는 equals() 사용
		
//		boolean result1 = name == "admin";
//		System.out.println(result1);
		
		boolean result2 = name.equals("admin");
		System.out.println(result2);
	}

}
