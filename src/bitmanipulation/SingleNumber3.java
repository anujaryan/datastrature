package bitmanipulation;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Anuj Pachauri
 *
 *         12:37:25 am
 */
public class SingleNumber3 {

	public static int[] singleNumber(int nums[]) {

		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < nums.length; i++) {
			if (set.contains(nums[i])) {
				set.remove(nums[i]);
			} else {
				set.add(nums[i]);
			}
		}
		int res[] = new int[set.size()];
		int k = 0;
		for (int i : set) {
			res[k++] = i;
		}
		return res;
	}

	public static void main(String[] args) {
		int nums[] = { 1, 2, 1, 3, 2, 5 };
		// singleNumber(nums);
		Arrays.stream(singleNumber(nums)).forEach(x -> System.out.println(x));
	}
}
