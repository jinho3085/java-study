package chapter03.exception;

public class UncheckedExceptionExample {

	public static void main(String[] args) {
//		try {
		int[] a = { 10, 20, 30, 40, 50 };

		for (int i = 0; i <= a.length; i++) {
			System.out.println(a[i]);
		}
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("erro:r" + e);
//		}
	}
}
