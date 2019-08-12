/**
22-Apr-2019
anuj

 * 
 */
package crackingcodeInterviewSolution;

import java.util.Stack;

/**
 * @author anuj
 *
 *         9:50:06 PM
 */
public class SortStack {

	public static Stack<Integer> sort(Stack<Integer> s) {

		Stack<Integer> r = new Stack<Integer>();

		while (!s.isEmpty()) {

			int temp = s.pop();
			while (!r.isEmpty() && r.peek() > temp) {
				s.push(r.pop());
			}
			r.push(temp);

		}

		return r;
	}

	public static void main(String[] args) {

		Stack<Integer> unstack = new Stack<Integer>();
		unstack.push(16);
		unstack.push(1);
		unstack.push(7);

		System.out.println(unstack);
		System.out.println("After Sorting .........");
		System.out.println(sort(unstack));
	}

}
