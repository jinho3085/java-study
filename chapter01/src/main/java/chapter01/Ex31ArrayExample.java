package chapter01;

public class Ex31ArrayExample {

	public static void main(String[] args) {
		int[] arr1 = null; 		// 선언, null로 초기화, 배열은 객체
		
		int[] arr2 = new int[3]; //  선언 + 생성, 기본값 0으로 초기화

		arr2[0] = 10;
		arr2[1] = 20;
		arr2[2] = 30;
		
		int[] arr3 = {10, 20, 30}; 			//  선언 + 생성 + 초기화
		int[] arr4 = new int[]{10, 20, 30}; //  선언 + 생성 + 초기화
		
		System.out.println(arr2[0]);
		System.out.println(arr3[1]);
		System.out.println(arr4[2]);
		
		System.out.println(arr4.length);
		// (주의) 예외발생: ArrayIndexOutOfBoundsException
		// System.out.println(arr2[3]);
		
		
	}

}
