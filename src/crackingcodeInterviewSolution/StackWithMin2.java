/**
16-Apr-2019
anuj

 * 
 */
package crackingcodeInterviewSolution;

import java.util.Stack;

/**
 * @author anuj
 *
 *         12:16:50 AM
 */
public class StackWithMin2 extends Stack<Integer> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Stack<Integer> s2;

	StackWithMin2() {
		s2 = new Stack<>();
	}

	public void push(int value) {

		if (value <= min()) {
			s2.push(value);
		}
		super.push(value);

	}

	@Override
	public Integer pop() {
		int value = super.pop();
		if (value == min()) {
			s2.pop();
		}
		return value;

	}

	/**
	 * @return
	 */
	private int min() {

		if (s2.isEmpty()) {
			return Integer.MAX_VALUE;
		} else {
			return s2.peek();
		}

	}

	public static void main(String[] args) {

		StackWithMin2 custom = new StackWithMin2();
		custom.push(12);
		custom.push(19);
		custom.push(1);
		custom.push(15);
		custom.push(17);
		System.out.println("Min Element is :" + custom.min());
	}

}
