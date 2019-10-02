package queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Anuj Pachauri
 *
 *         10:34:32 pm
 */
public class StackImplUsingQueue {

	private Queue<Integer> q1;

	private Queue<Integer> q2;

	private int top;

	StackImplUsingQueue() {
		this.q1 = new LinkedList<>();

		this.q2 = new LinkedList<>();
	}

	/** Push element x onto stack. */
	public void push(int x) {

		q1.add(x);
		this.top = x;
		while (!q1.isEmpty()) {
			q2.add(q1.remove());
		}

	}

	/** Removes the element on top of the stack and returns that element. */
	public void pop() {

		q2.remove();
		if (!q2.isEmpty()) {
			this.top = q2.peek();
		}

	}

	/** Get the top element. */
	public int top() {
		return top;
	}

	/** Returns whether the stack is empty. */
	public boolean empty() {

		return q1.isEmpty();

	}

	public static void main(String[] args) {
		StackImplUsingQueue stack = new StackImplUsingQueue();
		stack.push(1);
		stack.push(2);

		System.out.println(" pop element : " + stack.top());
		stack.pop();
	}
}
