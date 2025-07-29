package chapter03.generic;

public class Box03Test {

	public static void main(String[] args) {
		Box03<String> genericBox = new Box03<>("10");
		System.out.print(genericBox.getValue());
		
		// 컴파일 오류!
		// Integer value = genericBox.getValue();
		String value = genericBox.getValue();
		System.out.print(value);
		
		
	}

}
