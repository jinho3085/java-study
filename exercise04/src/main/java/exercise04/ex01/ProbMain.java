package exercise04.ex01;

import java.util.Scanner;

public class ProbMain {
	public static void main(String[] args) {
		Employee staff1 = new PartTimeEmployee();
        System.out.println("파트타임 급여: " + staff1.getSalary());

		Employee staff2 = new FullTimeEmployee();
        System.out.println("풀타임 급여: " + staff2.getSalary());
	}
}