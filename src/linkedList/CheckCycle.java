/**
19-Aug-2019
Anuj Pachauri

 * 
 */
package linkedList;

/**
 * @author Anuj Pachauri
 *
 *         12:19:33 am
 */
public class CheckCycle {

	public static boolean hasCycle(ListNode head) {
// time complexity is o(n) and space complexity o(1)
		if (head == null || head.next == null)
			return false;

		ListNode slow = head;
		ListNode fast = head.next;

		while (fast != null && fast.next != null) {

			if (slow == fast) {

				return true;
			}
			slow = slow.next;
			fast = fast.next.next;

		}

		return false;
	}

	public static void main(String[] args) {

		ListNode head = ListDriver.createList();
		System.out.println("List has cycle :" + hasCycle(head));
	}
}
