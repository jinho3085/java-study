package chapter01;

public class Ex33ArraySumAvg {

	public static void main(String[] args) {
		int[] scores = {90, 84, 94, 80, 100};

		int sum = 0;
		for(int score : scores) {
			sum += score;
		}
		
		int average = sum / scores.length;
		System.out.println("총합:" + sum);
		System.out.println("평균:" + average);
	}

}
