package drill04.prob05;

/**
 * 문제 5. 3의 배수 건너뛰기 - for + continue 사용
 * 
 * for문을 사용하여 1부터 20까지 숫자 중 3의 배수는 건너뛰고 출력하세요.
 * 
 * 
 */

public class Sol {

	public static void main(String[] args) {
			for(int i = 1; i <= 20; i++) {
				
				if(i % 3 == 0) {
					continue;
				}
				
				System.out.println(i);
		}
	}

}
