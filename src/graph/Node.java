/**
07-Sep-2019
Anuj Pachauri

 * 
 */
package graph;

/**
 * @author Anuj Pachauri
 *
 *         2:30:19 pm
 */
public class Node {

	int val;
	Node next;

	public Node(int val, Node next) {
		super();
		this.val = val;
		this.next = next;
	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}
