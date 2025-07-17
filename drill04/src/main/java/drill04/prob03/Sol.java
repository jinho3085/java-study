package drill04.prob03;

/**
 * 
 * 문제 3. 역순 출력 - while 사용
 * 
 *  while문을 사용하여 10부터 1까지 거꾸로 출력하세요.
 * 
 * 
 */

public class Sol {

	public static void main(String[] args) {
		
		int i = 10;
		
		while(i >= 1) {
			System.out.print(i + " ");
			i--;
		}
		
//		for(int i = 10 ; i >= 1; i--) {
//			System.out.print(i);	
//		}
	}

}
