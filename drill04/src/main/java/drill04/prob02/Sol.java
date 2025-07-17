package drill04.prob02;

/**
 * 
 * 문제 2. 짝수 출력 - for 사용
 * 
 * for문을 사용하여 1부터 20까지의 수 중 짝수만 출력하세요.
 * 
 * 
 */

public class Sol {

	public static void main(String[] args) {
		for(int i = 1; i <= 20; i++) {
			if(i % 2 ==0) {
				System.out.print(i + " ");
			}
		}
		
//		System.out.print("1");
//		System.out.print("\n");
//		System.out.print("2");
//		System.out.print("\n");
	}

}

