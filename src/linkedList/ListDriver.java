/**
19-Aug-2019
Anuj Pachauri

 * 
 */
package linkedList;

/**
 * @author Anuj Pachauri
 *
 *         12:09:29 am
 */
public class ListDriver {
	static ListNode head;

	static ListNode headA;
	static ListNode headB;

	public static ListNode createList() {

		ListNode node = new ListNode(10);

		ListNode node1 = new ListNode(12);

		ListNode node2 = new ListNode(14);

		ListNode node3 = new ListNode(16);
		node.next = node1;
		head = node;
		node1.next = node2;
		node2.next = node3;
		node3.next = node;

		return head;
	}

	public static ListNode createAList() {

		ListNode node = new ListNode(4);

		ListNode node1 = new ListNode(1);

		ListNode node2 = new ListNode(8);

		ListNode node3 = new ListNode(4);
		ListNode node4 = new ListNode(5);
		node.next = node1;
		headA = node;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;

		return headA;
	}

	public static ListNode createBList() {

		ListNode node = new ListNode(5);

		ListNode node1 = new ListNode(0);
		ListNode node2 = new ListNode(1);

		ListNode node3 = new ListNode(8);

		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		node.next = node1;
		headB = node;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;

		return headB;
	}

	public static ListNode createRemoveElementList() {

		ListNode node0 = new ListNode(1);

		ListNode node1 = new ListNode(2);

		ListNode node2 = new ListNode(6);

		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		ListNode node6 = new ListNode(6);
		node0.next = node1;
		head = node0;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;

		return head;
	}

	public static void traverseList(ListNode head) {

		while (head != null) {
			System.out.println(head.num);
			head = head.next;
		}

	}

	public static void main(String[] args) {
		ListNode head = createAList();
		traverseList(head);

	}
}

class ListNode {

	ListNode next;
	int num;

	ListNode(int num) {
		this.num = num;
		this.next = null;
	}
}