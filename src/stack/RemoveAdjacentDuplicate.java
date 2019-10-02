package stack;

import java.util.Stack;

/**
 * @author Anuj Pachauri
 *
 *         1:11:31 pm
 */
public class RemoveAdjacentDuplicate {

	public static String removeDuplicate(String s) {

		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (!stack.isEmpty()) {

				if (stack.peek() == c) {
					stack.pop();
				} else {
					stack.push(c);
				}

			} else {
				stack.push(c);
			}
		}
		System.out.println(String.valueOf(stack));

		StringBuilder sb = new StringBuilder();
		while (stack.size() > 0) {
			sb.append(stack.pop());
		}
		sb = sb.reverse();
		return sb.toString();

	}

	public static void main(String[] args) {

		String s = "abbaca"; // Input: "abbaca"
		// Output: "ca"
		System.out.println(removeDuplicate(s));
	}
}
