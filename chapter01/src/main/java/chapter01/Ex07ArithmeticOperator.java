package chapter01;

public class Ex07ArithmeticOperator {

	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		
		// 산술 연산자
		System.out.println("덧셈:" + (a + b)); // 13
		System.out.println("뻇셈:" + (a - b)); // 7
		System.out.println("곱셈:" + (a * b)); // 30
		System.out.println("나눗셈:" + (a / b)); // 3
		
		// 증강 연산자
		a++; // a = a + 1, a += 1;
		System.out.println(a); // 11
		
		++a; // a = a + 1, a += 1;
		System.out.println(a); // 12
		
		a--; // a = a - 1, a -= 1;
		System.out.println(a); // 11
		
		--a; // a = a - 1, a -= 1;
		System.out.println(a); // 10
		
		// 예상 해보기
		System.out.println(a++); // 10, a = 11
		// System.out.println(a);
		// a = a + 1;
		
		System.out.println(++a); // 12, a = 12
		// System.out.println(a);
		// a = a + 1;
		
		System.out.println(a--); // 12, a = 11
		System.out.println(--a); // 10, a = 10
		
		// 명시적 형변환
		System.out.println((double)10 / 3); // double / int = double
		System.out.println(10 / (double)3);
		System.out.println((double)(10/3));
		
		// 나머지 연산 %
		// 몫: 나누어지는 수(피제수)와 부호가 같다
		// 나머지: 나누는 수(제수)의 절대값 보다 작다
		System.out.println("나머지:" + (a % b)); // 1
		System.out.println("나머지:" + (-7 % 3)); // 몫: -2, 나머지는 -1
		System.out.println("나머지:" + (7 % 3)); // 몫: 2, 나머지는 1
		
	}

}
