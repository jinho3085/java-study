package exercise01.prob10;

public class Sol {

	public static void main(String[] args) {
		int data[] = {5, 9, 3, 8, 60, 20, 1};
		int count = data.length;

		System.out.println("Before Sort.");

		for (int i = 0; i < count; i++) {
			System.out.print(data[i] + " ");
		}

		//
		// 정렬 알고리즘이 적용된 코드를 여기에 작성합니다.
		//

		System.out.println("\nAfter Sort.");

		for (int i = 0; i < count; i++) {
			System.out.print(data[i] + " ");
		}		
	}	
}
