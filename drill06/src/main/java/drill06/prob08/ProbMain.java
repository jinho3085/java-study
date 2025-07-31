package drill06.prob08;

import java.util.Scanner;

public class ProbMain {

	public static void main(String[] args) {
		Score[] scores = new Score[5];
		
		
		Scanner scanner = new Scanner(System.in);

		/* 코드 작성 */

		
		for(int i = 0; i < scores.length; i++) {
			scores[i]= new Score();
			System.out.print("점수 " + (i + 1) + ": ");
			int input = scanner.nextInt();
			scores[i].setValue(input);
		}
		
		int sum = 0;
		for (int i =0; i < scores.length; i++) {
			sum += scores[i].getValue();
		}
		double average = (double) sum / scores.length;
		System.out.println("평균 점수: " + average);
		
		scanner.close();
	}

}
