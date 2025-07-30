package chpter04.collection;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		
		stack.push("둘리");
		stack.push("마이콜");
		stack.push("또치");
		
		while(!stack.isEmpty()) {
			String s = stack.pop();
			System.out.println(s);
		}
		
		// 비어있는 경우 예외
		// stack.pop();
		
		stack.push("둘리");
		stack.push("마이콜");
		stack.push("또치");
		
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
	}

}
