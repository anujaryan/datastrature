/**
19-Aug-2019
Anuj Pachauri

 * 
 */
package linkedList;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Anuj Pachauri
 *
 *         12:46:53 am
 */
public class ListIntersection {

	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

		if (headA == null || headB == null) {

			return null;
		}
		Set<ListNode> set = new HashSet<>();

		while (headA != null) {
			set.add(headA);
			headA = headA.next;
		}

		while (headB != null) {
			if (set.contains(headB))
				return headB;
			headB = headB.next;
		}

		return null;
	}

	public static void main(String[] args) {
		ListNode headA = ListDriver.createAList();

		ListNode headB = ListDriver.createBList();
		System.out.println("Intersected Node : " + getIntersectionNode(headA, headB));
	}
}
