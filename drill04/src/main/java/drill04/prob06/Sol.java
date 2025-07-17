package drill04.prob06;

/**
 * 
 * 문제 6. 홀수의 곱 - while 사용
 * 
 * 문제: 1부터 9까지의 홀수(1,3,5,7,9)를 곱한 결과를 출력하세요.
 * 
 */
public class Sol {

	public static void main(String[] args) {
	
		
			int i = 1;
			int result = 1;
			
			while(i <= 9) {
				if(i % 2 == 1) { // 홀수(1)일 때만 곱하기
					result *= i; // 1*1,3*1,5*1
				}
				i++;
			}
			
			System.out.println(result);
		
	}

}
