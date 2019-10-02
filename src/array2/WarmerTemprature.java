package array2;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author Anuj Pachauri
 *
 *         12:04:11 am
 */
public class WarmerTemprature {

	public static int[] dailyTemperatures(int[] temperatures) {

		int m = temperatures.length;
		int ans[] = new int[m];
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < m; i++) {

			while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
				ans[stack.peek()] = i - stack.pop();
			}
			stack.push(i);
		}
		return ans;

	}

	public static void main(String[] args) {

		int[] T = { 73, 74, 75, 71, 69, 72, 76, 73 };
		Arrays.stream(dailyTemperatures(T)).forEach(x -> System.out.println(x));
		;

	}
}
