/**
06-Apr-2019
anuj

 * 
 */
package crackingcodeInterviewSolution;

/**
 * @author anuj
 *
 *         7:31:27 PM
 */
public class NthToLast {

	public static Block NthtoLast(Block head, int n) {

		if (head == null || n < 1)
			return null;

		Block p1 = head;
		Block p2 = head;

		for (int j = 0; j < n - 1; j++) {
			if (p2 == null) {
				return null;
			}
			p2 = p2.next;

		}

		while (p2.next != null) {
			p1 = p1.next;
			p2 = p2.next;
		}

		return p1;

	}

	public static void deleteCharFromList(Block head, char chr) {

		System.out.println("Before delete of char List is ....\n \n");
		printList(head);

		if (head.cdata == chr) {
			head = head.next;
			return;
		}

		while (head.next != null) {

			if (head.next.cdata == chr) {
				head.next = head.next.next;
			}

			head = head.next;

		}

	}

	public static void main(String[] args) {

		// Block head = LinkedListProgram.createIntLinkedList(10);
		// System.out.println("3 last node is :" + NthtoLast(head, 3).data);

		Block head = LinkedListProgram.createCharLinkedList();
		deleteCharFromList(head, 'c');
		System.out.println(" \n \n After delete of char List is ....\n \n");
		printList(head);

	}

	public static void printList(Block head) {
		while (head != null) {
			System.out.print(head.cdata + " -> ");
			head = head.next;
		}

	}

}
