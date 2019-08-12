/**
14-Apr-2019
anuj

 * 
 */
package crackingcodeInterviewSolution;

/**
 * @author anuj
 *
 *         11:10:02 AM
 */
public class StackAsLinkedList {

	StackNode root;

	static class StackNode {
		int data;
		StackNode next;

		StackNode(int data) {
			this.data = data;
		}

	}

	public boolean isEmpty() {
		if (root == null)
			return true;
		else
			return false;
	}

	public void push(int data) {
		StackNode newNode = new StackNode(data);
		if (root == null) {
			root = newNode;
		} else {
			StackNode tempNode = root;
			root = newNode;
			newNode.next = tempNode;

		}
		System.out.println(data + "  \t pushed into stack... ");
	}

	public int pop() {
		int popped = Integer.MIN_VALUE;
		if (root == null)
			System.out.println("Stack is empty...");
		else {
			popped = root.data;
			root = root.next;
		}
		return popped;
	}

	public int peek() {
		if (root == null) {
			System.out.println("Stack is empty..");
			return Integer.MIN_VALUE;
		} else {
			return root.data;
		}
	}

	// driver program ...
	public static void main(String[] args) {

		StackAsLinkedList list = new StackAsLinkedList();
		System.out.println(list.isEmpty());

		list.push(14);
		list.push(16);

		list.push(18);
		list.push(20);

		System.out.println(list.peek() + " top element of stack.  Before popped \n ");

		System.out.println(list.pop() + " popped from stack.. \n ");

		System.out.println(list.peek() + " top element of stack. After popped ");

	}

}
