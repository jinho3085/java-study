package exercise03.prob01;

import java.util.Scanner;

public class ProbMain {
	private static final int COUNT_GOODS = 3; // 상품 총 3개 입력

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Goods[] goods = new Goods[COUNT_GOODS]; // 총 3개의 상품의 정보를 저장하는 배열

		// 상품 입력 for(Goods g : goods) { 향상된 for문
		//		g.printInfo();
		//	}
		
		for (int i = 0; i < COUNT_GOODS; i++) {
			String name = scanner.next();
			int price = scanner.nextInt();
			int stock = scanner.nextInt();
			
			goods[i] = new Goods(name, price, stock); // 상품 하나의 정보
		}
		
		// 상품 출력
		for (int i = 0; i < COUNT_GOODS; i++) {
			goods[i].printInfo();
		}
		
		scanner.close();
	}
}