/**
28-Aug-2019
Anuj Pachauri

 * 
 */
package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Anuj Pachauri
 *
 *         10:51:46 pm
 */
public class AddArrayFormInteger {

	public static List<Integer> addToArrayForm(int[] A, int k) {

//		if (A.length == 0) {
//			sum = k;
//			return sum;
//		}
		int j = 0;
		int sum = 0;
		for (int i = A.length - 1; i >= 0; i--) {
			sum += Math.pow(10, j++) * A[i];

		}
		List<Integer> list = new ArrayList<>();
		Stack<Integer> stack = new Stack<>();

		sum = sum + k;

		while (sum > 0) {
			stack.push(sum % 10);
			sum /= 10;
		}
		while (!stack.isEmpty()) {
			list.add(stack.pop());
		}

		return list;

	}

	public static void main(String[] args) {

		int[] A = { 1, 2, 3 };
		int[] A1 = {};
		int k = 2;
		List<Integer> list = addToArrayForm(A, k);
		list.stream().forEach(x -> System.out.println(x));
		list = addToArrayForm1(A, k);
		list.stream().forEach(x -> System.out.println(x));
		// System.out.println("Sum of Array Form : " + addToArrayForm(A1, k));

		List<Integer> orderlist = new ArrayList<>();
		for (int i = 0; i < 4; i++) {
			orderlist.add(0, i);
		}
		orderlist.stream().forEach(x -> System.out.println(x));

	}

	public static List<Integer> addToArrayForm1(int A[], int K) {
		List<Integer> list = new ArrayList<Integer>();
		int i = A.length - 1;
		int carry = 0;
		int value;
		while (i >= 0) {
			value = K % 10 + carry + A[i];
			list.add(0, value % 10);
			carry = value / 10;
			K /= 10;
			i--;
		}
		while (K > 0) {
			value = K % 10 + carry;
			list.add(0, value % 10);
			carry = value / 10;
			K /= 10;
		}
		if (carry == 1)
			list.add(0, carry);
		return list;
	}
}
