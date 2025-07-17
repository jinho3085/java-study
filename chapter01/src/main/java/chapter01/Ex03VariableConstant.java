package chapter01;

public class Ex03VariableConstant {

	public static void main(String[] args) {
		// 원시타입(기본타입, primitive type)
		short i= 10;
		int age = 30;
		long l = 1234567890L;
		
		float pi = 3.14f;
		double height = 174.5;
		
		boolean isStudent = true;
		
		byte b = 20;
		char grade = 'A';
		
		System.out.print(i);
		System.out.println(age);
		System.out.print(l);
		System.out.print(pi);
		System.out.println(height);
		System.out.println(isStudent);
		System.out.print(grade);
		System.out.println(b);
		
		// Class 
		String name = "정진호";
		System.out.println(name);
		
		// 상수
		final double PI = 3.141592;
		final int MAX_USER = 100;
		
		// 에러: 한 번 이상 대입을 못한다.
		// MAX_USER = 1000;
		System.out.println(PI);
		System.out.println(MAX_USER);
		
		int radius = 10;
		System.out.println(radius * radius * PI);
	}
}
