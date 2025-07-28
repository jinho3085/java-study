package chapter04.wrapper;

public class StaticMethodExample {

	public static void main(String[] args) {
		// Integer 
		int parseInt = Integer.parseInt("123"); 	// 문자열 -> int
		String intTOString = Integer.toString(123); // int -> 문자열
		int maxInt = Integer.max(10, 20); 			// 최대값
		int compareInt = Integer.compare(30, 20);	// 1, 0, -1
		
		// Double
		double parseDouble = Double.parseDouble("3.14"); // 문자열 -> double
		boolean isNaN = Double.isNaN(0.0 / 0.0);		 // NaN 여부
		
		// Boolean
		boolean parseBoolean = Boolean.parseBoolean("true"); // 문자열 -> boolean
		String boolToString = Boolean.toString(false); 		 // boolean -> 문자열
		
		// Character
		boolean isDigit = Character.isDigit('5');    // 숫자인가?
		boolean isLetter = Character.isLetter('A');  // 문자인가?
		char toLower = Character.toLowerCase('A'); // 소문자 변환
	
		// long
		long decodeLong = Long.decode("0x1F"); // 다양한 진수 문자열 -> long
		
		// 출력
		System.out.println("parseInt:" + parseInt);
		System.out.println("intTOString:" + intTOString );
		System.out.println("maxInt:" + maxInt);
		System.out.println("compareInt:" + compareInt);
		System.out.println("parseDouble:" + parseDouble);
		System.out.println("isNaN:" + isNaN);
		System.out.println("parseBoolean:" + parseBoolean);
		System.out.println("boolToString:" + boolToString);
		System.out.println("isDigit:" + isDigit);
		System.out.println("isLetter:" + isLetter);
		System.out.println("toLower:" + toLower);
		System.out.println("decodeLong:" + decodeLong);
		
	}

}
