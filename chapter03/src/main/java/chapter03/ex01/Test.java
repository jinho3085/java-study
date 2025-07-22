package chapter03.ex01;

import java.util.ArrayList;
import java.util.Stack;

public class Test {

	public static void main(String[] args) {
		Stack s = new Stack();
		
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		
		System.out.println(s.pop());
		System.out.println(s.pop());
	}

}
