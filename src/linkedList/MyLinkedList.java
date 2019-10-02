package linkedList;

/**
 * @author Anuj Pachauri
 *
 *         3:56:15 pm
 */
public class MyLinkedList {

	Node head;

	/** Initialize your data structure here. */
	public MyLinkedList() {
		this.head = null;

	}

	/**
	 * Get the value of the index-th node in the linked list. If the index is
	 * invalid, return -1.
	 */
	public int get(int index) {

		Node temp = head;
		int previousIndex = 0;
		while (previousIndex < index) {
			temp = temp.next;
			if (temp == null) {
				break;
			}
			previousIndex++;
		}

		if (temp == null) {
			return -1;
		} else {
			return temp.val;
		}

	}

	/**
	 * Add a node of value val before the first element of the linked list. After
	 * the insertion, the new node will be the first node of the linked list.
	 */
	public void addAtHead(int val) {
		Node newNode = new Node(val);
		if (this.head == null) {
			this.head = newNode;
		} else {
			Node temp = head;
			head = newNode;
			head.next = temp;
		}

	}

	/** Append a node of value val to the last element of the linked list. */
	public void addAtTail(int val) {
		Node node = new Node(val);
		if (head == null) {
			head = node;
			return;

		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = node;

	}

	/**
	 * Add a node of value val before the index-th node in the linked list. If index
	 * equals to the length of linked list, the node will be appended to the end of
	 * linked list. If index is greater than the length, the node will not be
	 * inserted.
	 */
	public void addAtIndex(int index, int val) {

		Node current = this.head;
		Node prev = null;

		int nodeIndex = 0;
		while (nodeIndex < index) {
			prev = current;
			current = current.next;
			if (current == null) {
				break;
			}
			nodeIndex++;

		}
		if (current == null) {
			this.addAtTail(val);
		} else {
			Node node = new Node(val);
			node.next = current;
			prev.next = node;
		}

	}

	/** Delete the index-th node in the linked list, if the index is valid. */
	public void deleteAtIndex(int index) {

		int nodeIndex = 0;
		Node current = head;
		Node prev = null;
		while (nodeIndex < index) {

			prev = current;
			current = current.next;
			if (current == null) {
				break;
			}

			nodeIndex++;
		}

		if (current == null)
			return;
		else {
			prev.next = current.next;
			current = null;
		}
	}
}

class Node {

	int val;
	Node next;

	Node(int val) {
		this.val = val;
		this.next = null;
	}
}