package chapter03.ex09;

import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("> ");
			String inputs = scanner.nextLine();

			if ("quit".equals(inputs)) {
				break;
			}

			String[] tokens = inputs.split(" ");
			int lValue = Integer.parseInt(tokens[0]);
			int rValue = Integer.parseInt(tokens[2]);

			switch (tokens[1]) {
			case "+":
				System.out.println(Calculator.add(lValue, rValue));
				break;
			case "-":
				System.out.println(Calculator.subtract(lValue, rValue));
				break;
			case "*":
				System.out.println(Calculator.multiply(lValue, rValue));
				break;
			case "/":
				System.out.println(Calculator.divide(lValue, rValue));
				break;
			default:
				System.out.println("Unkown Operator");
			}
		}
		
		scanner.close();
	}

}
