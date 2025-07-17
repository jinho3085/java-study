package chapter01;

public class Ex28BreakContinue {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i == 3) {
				continue;
			}

			if (i == 4) {
				break;
			}

			System.out.println(i);
		}

	}

}
