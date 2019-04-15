/**
14-Apr-2019
anuj

 * 
 */
package crackingcodeInterviewSolution;

/**
 * @author anuj
 *
 *         10:20:30 AM
 */
public class StackArrImplMain {

	static final int max = 1000;
	static int stack[] = new int[max];
	static int top = -1;

	public static boolean push(int element) {

		if (top >= (max - 1)) {
			System.out.println("Stack overflow..");
			return false;
		} else {
			stack[++top] = element;
			System.out.println(element + " Pushing element into Stack ");
			return true;
		}

	}

	public static void pop() {
		if (top < 0) {
			System.out.println("Stack underflow..");
			return;
		} else {

			System.out.println(stack[top--]);
		}

	}

	public static boolean isEmpty() {

		return (top < 0);
	}

	public static void main(String[] args) {
		System.out.println("Pushing element into Arrays ...");
		push(10);
		push(5);
		push(9);
		push(18);
		System.out.println("Poping element from stack..............");
		pop();
		pop();
		pop();
		pop();
		pop();

	}
}
