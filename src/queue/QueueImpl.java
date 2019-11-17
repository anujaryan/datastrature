package queue;

import java.util.Stack;

/**
 * @author Anuj Pachauri
 *
 *         10:20:15 pm
 */
public class QueueImpl {

	private Stack<Integer> s1 = new Stack<>();

	private Stack<Integer> s2 = new Stack<>();

	private int front;

	public void push(int x) {

		if (s1.isEmpty()) {
			front = x;
		}
		s1.push(x);
	}

	public int pop() {

		if (s2.isEmpty()) {
			while (!s1.isEmpty()) {
				s2.push(s1.pop());
			}
		}
		return s2.pop();
	}

	public boolean isEmpty() {
		return s1.isEmpty() && s2.isEmpty();
	}

	public int peek() {

		if (!s2.isEmpty()) {
			return s2.peek();
		}
		return front;
	}

	public static void main(String[] args) {

	}
}
