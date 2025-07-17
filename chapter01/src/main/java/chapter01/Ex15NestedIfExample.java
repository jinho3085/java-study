package chapter01;

//	0 ~ 100 사이의 점수가 있을 때,
//	80점 이상의 점수에서 90점 이상이면 A, 아니면 B를 판별하는 로직(알고리즘)  

public class Ex15NestedIfExample {

	public static void main(String[] args) {
		int score = 92;
		if(score >= 80) {
			if(score >= 90) {
				System.out.println("A");
			} else {
				System.out.println("B");
			}
		}
	}

}
