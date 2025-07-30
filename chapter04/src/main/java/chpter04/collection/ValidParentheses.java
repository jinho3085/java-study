package chpter04.collection;

// import java.util.EmptyStackException;
import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		System.out.println((isValidParentheses("(())(()()())") ? "Valid" : "InValid") + " Parentheses");
		System.out.println((isValidParentheses("(())(()()())()") ? "Valid" : "InValid") + " Parentheses");
		System.out.println((isValidParentheses("((())((()())())") ? "Valid" : "InValid") + " Parentheses");
//		System.out.println((isValidParentheses("())") ? "Valid" : "InValid") + " Parentheses");
	}

	private static boolean isValidParentheses(String expr) {
		Stack<Character> s = new Stack<>();

//		try {
			for (char c : expr.toCharArray()) {
				if (c == '(') {
					s.push(c);
					continue;
				} 

				if(s.isEmpty()) {
					return false;
				}
				
				s.pop();
			}
//		} catch (EmptyStackException e) {
//			return false;
//		}

		return s.isEmpty();
	}

}
