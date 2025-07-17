package chapter01;

public class Ex06TypeCasting {

	public static void main(String[] args) {
		// 자동 형변환(암시적) 작은 -> 큰
		int X = 100;
		long y = X; //ok
		
		System.out.println(X + ":" + y);
		
		// 강제 형병환(명시적) 큰 -> 작은
		double d = 3.14;
		int i =(int)d;
		
		System.out.println(d + ":" + i);
		
		// 데이터 손실 예시
		int large = 257; 
		byte b = (byte)large; // 출력: 1 (256 손실)
		System.out.println("b=" + b);
		
		byte b2 = -128;
		System.out.println(b2);
	}

}
