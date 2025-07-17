package drill04.prob08;

/**
 * 
 * 문제 8. 알파벳 A~Z 출력 - for 사용
 * 
 * for문을 사용하여 알파벳 'A'부터 'Z'까지 한 줄로 출력하세요.
 * 
 * 
 */

// char는 문자형(a,b,c 같은 문자)
public class Sol {

	public static void main(String[] args) {
		for(char c = 'A'; c <= 'Z'; c++) {
			System.out.print(c);
	 }
	}

}
