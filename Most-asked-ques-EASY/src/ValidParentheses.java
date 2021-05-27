/*

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
An input string is valid if:
1. Open brackets must be closed by the same type of brackets.
2. /Open brackets must be closed in the correct order.

*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class ValidParenthesesSolution {
	public static boolean parenthesesChecker(String str) {
		Stack<Character> st = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '{' || str.charAt(i) == '(' || str.charAt(i) == '[') {
				st.push(str.charAt(i));
			}
			if (st.isEmpty()) {
				return false;
			} else if (str.charAt(i) == '}' || str.charAt(i) == ')' || str.charAt(i) == ']') {
				char ch = st.pop();
				if (ch == '(' && str.charAt(i) != ')')
					return false;
				if (ch == '{' && str.charAt(i) != '}')
					return false;
				if (ch == '[' && str.charAt(i) != ']')
					return false;
			}
		}
		return st.isEmpty();
	}
}

public class ValidParentheses {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the input string : ");
		String str = br.readLine();
		boolean value = ValidParenthesesSolution.parenthesesChecker(str);
		if (value) {
			System.out.println("The string is valid");
		} else {
			System.out.println("The string is invalid");
		}

	}

}
