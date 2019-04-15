/**
06-Apr-2019
anuj
2019
 * 
 */
package crackingcodeInterviewSolution;

/**
 * @author anuj
 *
 *         6:55:24 PM
 */
public class LinkedListProgram {

	static Block head = null;

	public static Block createIntLinkedList(int size) {
		int value = 0;
		Block node = null;

		for (int i = 1; i < size; i++) {
			value += 10;
			Block block = new Block(value);
			if (head == null) {
				head = block;
				node = block;
			} else {
				node.next = block;
				node = block;
			}

		}

		return head;

	}

	public static Block createCharLinkedList() {

		Block b1 = new Block('a');
		Block b2 = new Block('b');
		Block b3 = new Block('c');
		Block b4 = new Block('d');
		Block b5 = new Block('e');
		head = b1;
		head.next = b2;
		b2.next = b3;
		b3.next = b4;
		b4.next = b5;
		return head;
	}

	public static void main(String[] args) {

		Block block1 = new Block(10);
		Block block2 = new Block(20);
		Block block3 = new Block(30);
		Block block4 = new Block(40);
		Block block5 = new Block(50);
		head = block1;
		head.next = block2;
		block2.next = block3;
		block3.next = block4;
		block4.next = block5;
		printList();
		System.out.println("after deleted 20 from node.....\n \n");
		deleteNode(head, 20);
		printList();
	}

	public static void printList() {

		Block node = head;
		int count = 0;
		while (node != null) {
			System.out.println(" List Node  " + count++ + " Value is " + node.data);
			node = node.next;
		}

	}

	public static Block deleteNode(Block head, int data) {
		if (head.data == data)
			return head.next;
		while (head.next != null) {

			if (head.next.data == data) {
				head.next = head.next.next;
				return head;
			}
			head = head.next;
		}
		return head;

	}

}

class Block {
	int data;
	Block next;
	char cdata;

	Block(int data) {
		this.data = data;
		this.next = null;
	}

	Block(char cdata) {
		this.cdata = cdata;
		this.next = null;
	}
}