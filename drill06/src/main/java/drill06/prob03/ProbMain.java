package drill06.prob03;

import java.util.Scanner;

public class ProbMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String name = null;
		int score = 0;

		// 학생1
		System.out.print("학생1: ");
		String name1 = scanner.next();
		int score1 = scanner.nextInt();

		// 학생2
		System.out.print("학생2: ");
		String name2 = scanner.next();
		int score2 = scanner.nextInt();

		scanner.close();
		
		// 객체 생성
		Student student1 = new Student();
		student1.setName(name1);
		student1.setScore(score1);
		
		Student student2 = new Student();
		student2.setName(name2);
		student2.setScore(score2);
		
		student1.show();
		student2.show();
		
		// 점수 비교
		System.out.println(student1.compareScore(student2));
	}

}
