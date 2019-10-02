package stack;

import java.util.Stack;

/**
 * @author Anuj Pachauri
 *
 *         12:10:08 pm
 */
public class BackSpaceStringCompare {

	Stack<Character> ss = new Stack<>();

	Stack<Character> ts = new Stack<>();

	public boolean backspaceCompare(String s, String t) {

		for (int i = 0; i < s.length(); i++) {
			char schar = s.charAt(i);
			if (schar == '#') {
				if (!ss.isEmpty()) {
					ss.pop();
				}

			} else {
				ss.push(schar);
			}
		}

		for (int i = 0; i < t.length(); i++) {
			char tchar = t.charAt(i);
			if (tchar == '#') {
				if (!ts.isEmpty()) {
					ts.pop();
				}

			} else {
				ts.push(tchar);
			}
		}

		if (ss.size() != ts.size()) {
			return false;
		}
		while (ss.size() > 0) {
			if (ss.peek().equals(ts.peek())) {
				ss.pop();
				ts.pop();
			}
		}
		if (ss.size() != ts.size()) {
			return false;
		}

		return true;
	}

	public static void main(String[] args) {

		// String s = "ab#c", t = "ad#c";
		// String S = "ab##", T = "c#d#";
		String S = "a##c", T = "#a#c";

		BackSpaceStringCompare back = new BackSpaceStringCompare();
		System.out.println(back.backspaceCompare(S, T));

		System.out.println(back.backSpaceCompare(S, T));

	}

	public boolean backSpaceCompare(String s, String t) {
		return checkString(s).equals(checkString(t));
	}

	/**
	 * @param s
	 * @return
	 */
	private String checkString(String a) {

		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < a.length(); i++) {

			char c = a.charAt(i);

			if (c == '#') {

				if (!stack.isEmpty()) {
					stack.pop();
				}

			} else {
				stack.push(c);
			}

		}

		return String.valueOf(stack);
	}
}
