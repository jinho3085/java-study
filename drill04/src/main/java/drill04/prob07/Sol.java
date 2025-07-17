package drill04.prob07;

/**
 * 
 * 문제 7. 조건 반복 종료 - while + break 사용
 * 
 * while문을 사용하여 1부터 숫자를 출력하다가 7이 되면 반복을 종료하세요.
 * 
 */
public class Sol {

	public static void main(String[] args) {
		
		int i = 1;
		
		while(i < 10) {
			System.out.println(i);
			if(i == 7) {
				break;
			}
			i++;
			
		}
		
		System.out.println();

	}

}
