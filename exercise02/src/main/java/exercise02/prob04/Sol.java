package exercise02.prob04;

import java.util.Scanner;

public class Sol {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("문자열: ");
		String text = scanner.nextLine();
		scanner.close();

		/* 코드 작성 */
		System.out.println(text);
		
//		for(int i = 0; i < text.length(); i++) {
//			char c = text.charAt(i);
//			System.out.println(c);
//		}

	char[] arr = text.toCharArray();
	for(int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
	}
	
	}

}
