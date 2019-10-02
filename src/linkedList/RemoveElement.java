/**
19-Aug-2019
Anuj Pachauri

 * 
 */
package linkedList;

import java.util.NoSuchElementException;

/**
 * @author Anuj Pachauri
 *
 *         1:25:32 am
 */
public class RemoveElement {

	ListNode head;

	public int removeElements(int val) {

		if (head == null)
			throw new NoSuchElementException();
		ListNode temp = head;
		ListNode prev = null;

		while (temp != null && !(temp.num == val)) {

			prev = temp;
			temp = temp.next;

		}
		int res = temp.num;
		prev.next = temp.next;
		return res;

	}

	public static void main(String[] args) {

		RemoveElement obj = new RemoveElement();
		ListNode head = ListDriver.createRemoveElementList();
		System.out.println("aFTER Remove Element : ");
		int headNew = obj.removeElements(6);

		System.out.println("Deleted Element from list" + headNew);
		// ListDriver.traverseList(headNew);

	}
}
