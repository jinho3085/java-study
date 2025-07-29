package chapter03.generic;

public class Box01Test {

	public static void main(String[] args) {
		Box01 stringBox = new Box01("hello");
		System.out.print(stringBox.getValue());
		
		stringBox.setValue(" ");
		System.out.print(stringBox.getValue());

		stringBox.setValue("world");
		System.out.print(stringBox.getValue());
	}

}
