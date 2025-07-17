package drill04.prob11;

/**
 * 
 * 문제 11. 중첩 반복문을 이용한 구구단 전체 출력
 * 
 * 중첩된 반복문을 사용하여 다음과 같은 형식으로 구구단 전체(1단 ~ 9단)를 출력하는 프로그램을 작성하세요.
 * 출력은 세로로 단이 증가하고 가로로 곱하는 수(1~9)가 증가해야 합니다.
 * 
 */

public class Sol {

	public static void main(String[] args) {
		for (int i= 1; i <=9; i++) { // 곱해지는 수(1~9)
			for (int dan =1; dan <=9; dan++) { // 단의수 (1~9)
				System.out.print(dan + " X " + i + " = " + (dan * i) + "\t");
			}
			System.out.println();
		}
		

//		int i = 1;
//		
//		int dan = 1;
//		System.out.print(dan + " x " + i + " = " + (dan * i) + "\t");
//		
//		dan = 2;
//		System.out.print(dan + " x " + i + " = " + (dan * i) + "\t");
//		
//		dan = 3;
//		System.out.print(dan + " x " + i + " = " + (dan * i) + "\t");
//		
//		dan = 4;
//		System.out.print(dan + " x " + i + " = " + (dan * i) + "\t");
//		
//		System.out.println("");
//		
//		dan = 5;
//		System.out.print(dan + " x " + i + " = " + (dan * i) + "\t");
//		
//		dan = 6;
//		System.out.print(dan + " x " + i + " = " + (dan * i) + "\t");
//		
//		dan = 7;
//		System.out.print(dan + " x " + i + " = " + (dan * i) + "\t");
//		
//		dan = 8;
//		System.out.print(dan + " x " + i + " = " + (dan * i) + "\t");
//		
//		dan = 9;
//		System.out.print(dan + " x " + i + " = " + (dan * i) + "\t");
		
	}

}
