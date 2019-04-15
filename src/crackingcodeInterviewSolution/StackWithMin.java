/**
15-Apr-2019
anuj

 * 
 */
package crackingcodeInterviewSolution;

import java.util.Stack;

/**
 * @author anuj
 *
 *         11:55:16 PM
 */
public class StackWithMin extends Stack<NodeWithMin> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void push(int v) {

		int newMin = Math.min(v, min());
		super.push(new NodeWithMin(v, newMin));

	}

	private int min() {

		if (this.isEmpty()) {
			return Integer.MAX_VALUE;
		} else {
			return peek().min;
		}

	}

	public static void main(String[] args) {

		StackWithMin customstack = new StackWithMin();
		customstack.push(12);
		customstack.push(16);
		customstack.push(11);
		customstack.push(19);
		System.out.println(" Min element in stack ..." + customstack.min());

	}
}

class NodeWithMin {
	int value;
	int min;

	NodeWithMin(int v, int min) {
		this.value = v;
		this.min = min;
	}
}