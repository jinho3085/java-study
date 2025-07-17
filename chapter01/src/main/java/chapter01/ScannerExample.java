package chapter01;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
//		System.out.print("이름을 입력하세요: ");
//		String name = scanner.nextLine();
//		System.out.println(name);
		
		System.out.println("이름, 생년, 월을 순서대로 입력해 주세요");
		String name = scanner.next();
		int year = scanner.nextInt();
		int month = scanner.nextInt();
		
		System.out.println(name + "님");
		System.out.println("태어난 년도는 " + year + "년 입니다.");
		System.out.println("태어난 월은 " + month + "월 입니다.");
		
		scanner.close();
		
	}

}
