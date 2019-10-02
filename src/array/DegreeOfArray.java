package array;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Anuj Pachauri
 *
 *         12:46:40 am
 */
public class DegreeOfArray {

	public static int findShortestSubArray(int nums[]) {

		Map<Integer, Integer> left = new HashMap<>();
		Map<Integer, Integer> right = new HashMap<>();
		Map<Integer, Integer> count = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			int x = nums[i];
			if (left.get(x) == null)
				left.put(x, i);
			right.put(x, i);

			count.put(x, count.getOrDefault(x, 0) + 1);
		}

		int ans = nums.length;
		int max = Collections.max(count.values());

		for (int x : count.keySet()) {

			if (count.get(x) == max) {

				ans = Math.min(ans, right.get(x) - left.get(x) + 1);
			}

		}

		return ans;
	}

	public static void main(String[] args) {

		int nums[] = { 1, 2, 2, 3, 1 };
		int nums1[] = { 1, 2, 2, 3, 1, 4, 2 };
		System.out.println("Max Degree Of Array.. " + findShortestSubArray(nums));
		System.out.println("Max Degree Of Array.. " + findShortestSubArray(nums1));
	}
}
