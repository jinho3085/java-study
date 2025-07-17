package chapter01;

public class Ex10OperatorExample {

	public static void main(String[] args) {
		final int TIME =  789500; // 총시간(초)
		
		int second = TIME % 60;
		int minute = TIME / 60 % 60;
		int hour = TIME / 60 / 60;
		
		
		System.out.print(TIME + "초는 ");
		System.out.print(hour + "시간, ");
		System.out.print(minute + "분, ");
		System.out.println(second + "초 입니다.");

	}

}
