package behavioral.starategy;

import java.util.Scanner;

public class CalculateContext {
	public void operation(CalculateStrategy caculateStrategy) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("(val1, val2) > ");
		int val1 = scanner.nextInt();
		int val2 = scanner.nextInt();
		int result = caculateStrategy.calculate(val1, val2);
		System.out.println(result);		
	}
}