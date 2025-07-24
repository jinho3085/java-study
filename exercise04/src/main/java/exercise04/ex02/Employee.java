package exercise04.ex02;
// 일반적인 직원
public class Employee {
	private String name;
	private int salary;
//	private String department; - 모든 직원이 반드시 부서를 가져야함

	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
		// this.department = department; (부서 정보 필요)
	}

	public void getInformation() {
		System.out.print("이름: " + name + "  연봉: " + salary);
	}
}
