package array2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Anuj Pachauri
 *
 *         1:53:09 am
 */
public class MiniAbsoluteDifferent {

	public static List<List<Integer>> absoluteDiff(int nums[]) {

		Arrays.sort(nums);
		List<List<Integer>> list = new ArrayList<>();
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < nums.length - 1; i++) {
			List<Integer> list1 = new ArrayList<>();
			int mindi = Math.abs(nums[i] - nums[i + 1]);
			min = Math.min(min, mindi);
		}

		for (int i = 0; i < nums.length - 1; i++) {
			List<Integer> list1 = new ArrayList<>();
			int mindi = Math.abs(nums[i] - nums[i + 1]);
			if (min == mindi) {
				list1.add(nums[i]);
				list1.add(nums[i + 1]);
				list.add(list1);
			}
		}
		System.out.println(" Minimum Difference : " + min);
		return list;
	}

	public static void main(String[] args) {
		int nums[] = { 4, 2, 1, 3 };
		int nums1[] = { 1, 3, 6, 10, 15 };

		absoluteDiff(nums);

		absoluteDiff(nums1);
	}
}
