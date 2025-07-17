package drill02.prob06;

/**
 * 
 * 문제 6: 변수 타입 오류 찾기
 * 
 * 문제: 오류 발생 줄에 그 이유를 주석으로 달고 바르게 고쳐 컴파일 및 실행하기
 * 
 */
public class Sol {

	public static void main(String[] args) {
		int count = 3;
		// 에러:int count = "three"; : "three" -> 3 으로 정수값 교체
		boolean isOn = true;
		// 에러:boolean isOn = 1; : boolean 값은 참, 거짓으로 사용 
		char c = 'A';
		// char c = "A"; : char 타입은 작은 따음표 사용
		float f = 3.14f;
		//float f = 3.14; : 수가 끊임없이 나오기에 숫자뒤에 f을 넣어야함
		String name = "Alice";
		
		System.out.println(count);
		System.out.println(isOn);
		System.out.println(c);
		System.out.println(f);
		System.out.println(name);		
	}

}
