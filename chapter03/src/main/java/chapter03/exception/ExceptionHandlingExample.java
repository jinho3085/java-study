package chapter03.exception;

public class ExceptionHandlingExample {
	
	// 1번과 6번은 사용하지말것
	public static void main(String[] args) {
		int a = 10;
		int b = a - 10;
		
		System.out.println("some code 1...");
		
		try {
			System.out.println("some code 2...");
			
			int result = (1 + 2 + 3) / b;
			
			System.out.println("some code 3...");
			
		} catch(ArithmeticException e) {
			
//			System.out.println("some code 4...");
			
			/* 예외 처리 */ 
			// 1. 사용자에게 사과
			System.out.println("미안합니다.");
			
			// 2. 로그를 남기자
//			System.out.println("error:" + e);
			 e.printStackTrace();
			
			// 3. 정상종료
			//System.exit(0);
			return;
			
//	catch가 비워있으면 이거라도 써놓자	 e.printStackTrace();
			
		} finally {
			// 자원 정리: close file, socket,  db connection
			System.out.println("some code 5...");
		}
		
		System.out.println("some code 6...");
	}

}
