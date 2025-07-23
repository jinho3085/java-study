package exercise03.prob02;

public class CurrencyConverter {
	private static double rate; // 1. 환율을 저장하는 정적 필드
	
	public static void setRate(double r) {
		rate = r; // 2. 환율 설정 메서드 (환율 세팅 후 계산 적용)
	}
	
	public static double toDollar(double won) {
		return won / rate; // 3. 원화를 달러로 바꾸는 메서드
	}
	
	public static double toKRW(double dollar) {
		return dollar * rate; // 4. 달러를 원화로 바꾸는 메서드
	}
	
}