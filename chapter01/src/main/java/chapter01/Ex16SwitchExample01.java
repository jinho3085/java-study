package chapter01;

//	등급(학점)이 있을 때,
//
//	'A', 'B' 이면 "잘했습니다." 출력,
//	'C', 'D' 이면 "노력했습니다." 출력,
//	'F' 이면, "다음 학기에 수강하세요." 출력,
//	이외의 값이면 "잘못된 입력입니다." 출력
//
//	하는 로직(알고리즘)

public class Ex16SwitchExample01 {

	public static void main(String[] args) {
		char grade = 'A';
		
		switch(grade) {
		case 'A' :
		case 'B' :
			System.out.println("잘했습니다");
			break;
		case 'C' :
		case 'D' :
			System.out.println("노력했습니다");
			break;
		case 'F' :
			System.out.println("다음 학기에 수강하세요");
			break;
		default :
			System.out.println("잘못된 입력입니다.");
		}
	}

}
