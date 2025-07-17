package chapter01;

//	0 ~ 100 사이의 점수가 있을 때,
//
//	90 이상이면 A,
//	90 미만 80 이상이면 B,
//	80 미만 70 이상이면 C,
//	70 미만 60 이상이면 D,
//	60 미만은 F
//
//	를 판별하는 로직(알고리즘)

public class Ex14IfElseIfElseExample {

	public static void main(String[] args) {
		int score = 82;
		
		if(score >= 90) {
			System.out.println("A");
		} else if(80 <= score) {
			System.out.println("B");
		} else if(70 <= score) {
			System.out.println("c");
		} else if(60 <= score) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}

	}

}
