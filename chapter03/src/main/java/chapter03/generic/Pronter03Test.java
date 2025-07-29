package chapter03.generic;

public class Pronter03Test {

	public static void main(String[] args) {
		Printer03 printer = new Printer03();
		
		System.out.println(printer.sum(1));
		System.out.println(printer.sum(1, 2));
		System.out.println(printer.sum(1, 2, 3, 4, 5));
		System.out.println(printer.sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		
		printer.println(10, 3.14, true, "hello");
	}
}
