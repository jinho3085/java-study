package drill06.prob02;

import java.util.Scanner;

public class ProbMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("제목: ");
		String name = scanner.nextLine();
		
		System.out.println("가격: ");
		int price = scanner.nextInt();
		
		scanner.close();

		/* 코드 작성 */
		Book book = new Book();
		book.setTitle(name);
		book.setPrice(price);
		
		System.out.println(
				"제목:" + book.getTitle() +
				", 가격: " + book.getPrice());
		book.show();
	}
}
