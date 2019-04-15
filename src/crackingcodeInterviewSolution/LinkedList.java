/**
31-Mar-2019
anuj
2019
 * 
 */
package crackingcodeInterviewSolution;

import java.util.HashMap;
import java.util.Map;

/**
 * @author anuj
 *
 *         7:41:30 PM
 */
public class LinkedList {
	Node head;

	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		list.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node four = new Node(3);
		Node five = new Node(3);

		list.head.next = second;
		second.next = third;
		third.next = four;
		four.next = five;
		System.out.println("\n \n \n \n ");
		System.out.println(" Created Linked List is \n ##################################### \n \n \n ");
		list.printList();
		System.out.println("After duplicate Element Remove From Linked List is \n \n ");
		list.removeDuplicateNode();
		list.printList();

	}

	public void printList() {

		Node n = head;
		int count = 1;
		while (n != null) {
			System.out.println("Node " + count++ + "  data is " + n.data);
			n = n.next;
		}

	}

	public void removeDuplicateNode() {
		Node n = head;
		Map<Integer, Boolean> table = new HashMap<>();
		Node previous = null;
		while (n != null) {

			if (table.containsKey(n.data)) {
				previous.next = n.next;
			} else {
				table.put(n.data, true);
				previous = n;
			}
			n = n.next;

		}

	}

}

class Node {
	int data;
	Node next = null;

	public Node(int data) {
		super();
		this.data = data;
		next = null;

	}

	public void appendToTail(int d) {

		Node end = new Node(d);
		Node n = this;
		while (n.next != null) {
			n = n.next;
		}
		n.next = end;
	}
}