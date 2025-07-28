package chapter04.string;

public class MethodsExample {

	public static void main(String[] args) {
		// 1. length()
		String s1 = "Hello";
		System.out.println("length(): " + s1.length()); // 5
		
		// 2. charAt()
		String s2 = "Java";
		System.out.println("charAt(2): " + s2.charAt(2)); // v
		
		// 3. substring()
		String s3 = "Hello World";
		System.out.println("substaring(0, 5):" + s3.substring(0, 5)); // Hello
	
		// 4. equals() / equalsIgnoreCase()
		String a = "apple";
		String b = "Apple";
		System.out.println("equals():" + a.equals(b)); // false
		System.out.println("equalsIgnoreCase():" + a.equalsIgnoreCase(b)); // true
	
		// 5. indexof() / Contains()
		String s4 = "banana";
		System.out.println("indexOf(\"na\"):" + s4.indexOf("na")); // 2
		System.out.println("contains(\"ba\"):" + s4.contains("ba")); // true
		
		// 6. trim
		String s5 = "   h e l l o   ";
		System.out.println("trim(): --" + s5.trim() + "--"); // "h e l l o"
		
		// 7. replace
		String s6 = "a-b-c-d";
		System.out.println("replace(): " + s6.replace("-", ":")); // "a:b:c:d"
		
		// 8. toLowerCase() / toUpperCase()
		String s7 = "JaVa";
		System.out.println("toLowerCase(): " + s7.toLowerCase()); // "java"
		System.out.println("toUpperCase(): " + s7.toUpperCase()); // "JAVA"
		
		// 9. split()
		String s8 = "red,green,blue";
		String[] colors = s8.split(",");
		System.out.println("split():");
		for(String color : colors) {
			System.out.println("- " + color);
		}
		
		// 10. isEmpty()
		String emptyStr = "";
		String nonEmptyStr = "test";
		System.out.println("isEmpty() on emptyStr: " + emptyStr.isEmpty()); // true
		System.out.println("isEmpty() on nonEmptyStr: " + nonEmptyStr.isEmpty()); // false
		
		// 11. valueOf
		int num = 10;
		boolean flag = true;
		System.out.println("valueOf(int): " + String.valueOf(num)); // "10"
		System.out.println("valueOf(boolean): " + String.valueOf(flag)); // "true"
		
	}

}
