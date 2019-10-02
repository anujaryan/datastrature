package array3;

import java.util.Arrays;

/**
 * @author Anuj Pachauri
 *
12:03:06 am
 */
public class RelativeRanks {

	public String[] relativeRanks(int[] nums) {

		Integer[] index = new Integer[nums.length];

		for (int i = 0; i < index.length; i++) {
			index[i] = i;
		}
		Arrays.sort(index, (a, b) -> (nums[b] - nums[a]));
		String[] res = new String[nums.length];
		for (int i = 0; i < nums.length; i++) {
			if (i == 0) {
				res[index[i]] = "Gold Medal";
			} else if (i == 1) {
				res[index[i]] = "Silver Medal";
			} else if (i == 2) {
				res[index[i]] = "Bronze Medal";
			} else {
				res[index[i]] = (i + 1) + "";
			}
		}
		return res;
	}
}
