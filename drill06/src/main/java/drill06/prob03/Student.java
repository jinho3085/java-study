package drill06.prob03;

public class Student {
	private String name;
	private int score;
	
	public void show( ) {
		System.out.println(
				"학생: " + name +
				", 점수: " + score
				);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setScore(int score) {
		if(score < 0) {
			score = 0;
		}
		this.score = score;
	}
	public int getScore() {
		return score;
	}
	
	// 점수 비교 메소드 추가
	public String compareScore(Student other) {
		if (this.score > other.score) {
			return this.name + "의 점수가 더 높습니다.";
		} else if (this.score < other.score) {
			return other.name + "의 점수가 더 높습니다.";
		} else {
			return "두 학생의 점수가 같습니다.";
		}
	}
}
