package exercise03.prob07;

import java.util.Scanner;

public class BookShop {
	public static void main(String[] args) {
		Book[] books = new Book[10];
		
		books[0] = new Book(1, "트와일라잇", "스테파니메이어");
		books[1] = new Book(3,"이클립스","스테파니메이어");
		books[2] = new Book(2,"뉴문", "스테파니메이어");
		books[3] = new Book(10,"브레이킹던","스테파니메이어");
		books[4] = new Book(4,"아리랑","조정래");
		books[5] = new Book(6,"젊은그들","김동인");
		books[6] = new Book(9,"아프니깐 청춘이다","김난도");
		books[7] = new Book(8,"귀천","천상병");
		books[8] = new Book(7,"태백산맥","조정래");
		books[9] = new Book(5,"풀하우스","원수연");
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("책번호: ");
		int num = scanner.nextInt();
		scanner.close();
		
		// (1)입력된 번호에 맞는 책을 찾아서 대여(상태코드=0)을 체크 합니다.

		
		// (2)Book 객체의 정보를 출력
		System.out.println("*****도서 정보 출력하기******");
		displayBooks(books);
	}
}