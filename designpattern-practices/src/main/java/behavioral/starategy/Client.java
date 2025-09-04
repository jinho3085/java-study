package behavioral.starategy;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
//		add();
//		subtract();
//		multiply();
//		divide();
		
		CalculateContext cc = new CalculateContext();
		
		cc.operation(new AddStrategy());
		
		// anonymous class
		cc.operation(new CalculateStrategy() {
			@Override
			public int calculate(int val1, int val2) {
				return val1 - val2;
			}
		});

		cc.operation((val1, val2) -> val1 * val2);		
		cc.operation((val1, val2) -> val1 / val2);		
	}
	
	/*
	public static void add() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("(val1, val2) > ");
		int val1 = scanner.nextInt();
		int val2 = scanner.nextInt();
		int result = val1 + val2;
		System.out.println(result);
	}
	
	public static void subtract() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("(val1, val2) > ");
		int val1 = scanner.nextInt();
		int val2 = scanner.nextInt();
		int result = val1 - val2;
		System.out.println(result);
	}
	
	public static void multiply() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("(val1, val2) > ");
		int val1 = scanner.nextInt();
		int val2 = scanner.nextInt();
		int result = val1 * val2;
		System.out.println(result);
	}
	
	public static void divide() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("(val1, val2) > ");
		int val1 = scanner.nextInt();
		int val2 = scanner.nextInt();
		int result = val1 / val2;
		System.out.println(result);
	}
	*/
}