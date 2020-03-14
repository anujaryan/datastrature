package array2;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author Anuj Pachauri
 *
 *         11:11:53 pm
 */
public class NextGreaterElement {

	public static int[] nextGreater(int nums[]) {

		int[] res = new int[nums.length];

		Stack<Integer> stack = new Stack<>();

		for (int i = 2 * nums.length - 1; i >= 0; i--) {

			while (!stack.isEmpty() && nums[stack.peek()] <= nums[i % nums.length]) {
				stack.pop();
			}

			res[i % nums.length] = stack.empty() ? -1 : nums[stack.peek()];
			stack.push(i % nums.length);

		}
		return res;
	}

	public static void main(String[] args) {

		int nums[] = { 1, 2, 1 };
		Arrays.stream(nextGreater(nums)).forEach(x -> System.out.print(x));
	}
}
