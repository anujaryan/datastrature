package stack;

/**
 * @author Anuj Pachauri
 *
 *         11:29:40 am
 */
public class MinStack implements StackInterface {

	private static final Integer DEFAULT_SIZE = 16;
	Integer A[];
	int TOP;

	MinStack() {
		A = new Integer[DEFAULT_SIZE];
		TOP = -1;
	}

	public static void main(String[] args) {

		MinStack obj = new MinStack();
		obj.push(-2);
		obj.push(0);
		obj.push(-3);
		System.out.println("Top Element : " + obj.top());
		obj.pop();
		int param_3 = obj.top();
		int param_4 = obj.getMin();
		System.out.println("Top Element :  " + param_3 + " Min " + param_4);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see stack.Stack#push(int)
	 */
	@Override
	public void push(int x) {

		TOP++;
		A[TOP] = x;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see stack.Stack#top()
	 */
	@Override
	public int top() {

		return A[TOP];
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see stack.Stack#pop()
	 */
	@Override
	public void pop() {
		A[TOP] = null;
		TOP--;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see stack.Stack#getMin()
	 */
	@Override
	public int getMin() {

		int min = Integer.MAX_VALUE;
		while (TOP != -1) {
			if (A[TOP] < min) {
				min = A[TOP];
				TOP--;

			}
		}
		return min;
	}

}

interface StackInterface {
	public void push(int x);

	public int top();

	public void pop();

	public int getMin();
}
