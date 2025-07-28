package chapter04.string;

public class StringBuilderExample01 {

	public static void main(String[] args) {
		// String s = "Hello " + "World " + "Java" + 21;
		
		String s = new StringBuilder("Hello ")
		.append("World")
		.append(" Java")
		.append(12)
		.toString();
		
		System.out.println(s);
		
	}

}
