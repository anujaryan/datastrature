/**
07-Apr-2019
anuj

 * 
 */
package crackingcodeInterviewSolution;

/**
 * @author anuj
 *
 *         10:15:55 AM
 */
public class TwoLinkedListAdd {

	static Block head1;
	static Block head2;

	public static Block createFirstList() {

		Block b1 = new Block(3);
		Block b2 = new Block(1);
		Block b3 = new Block(5);
		head1 = b1;
		b1.next = b2;
		b2.next = b3;
		return head1;

	}

	public static Block createSecondList() {

		Block b1 = new Block(5);
		Block b2 = new Block(9);
		Block b3 = new Block(2);
		head2 = b1;
		b1.next = b2;
		b2.next = b3;
		return head2;

	}

	public static Block addList(Block head1, Block head2, int carry) {

		Block result = new Block(carry);
		if (head1 == null && head2 == null) {
			return null;
		}
		int value = carry;

		if (head1 != null)
			value += head1.data;
		if (head2 != null)
			value += head2.data;

		result.data = value % 10;
		Block more = addList(head1 == null ? null : head1.next, head2 == null ? null : head2.next, value >= 10 ? 1 : 0);

		result.next = more;

		return result;
	}

	public static void main(String[] args) {

		Block head1 = createFirstList();
		Block head2 = createSecondList();

		Block head3 = addList(head1, head2, 0);
		while (head3.next != null) {
			System.out.print(head3.data + " ");
			head3 = head3.next;
		}

	}
}
