package bitmanipulation;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Anuj Pachauri
 *
 *         1:00:11 am
 */
public class MaxXor {

	public static int maxXor(int[] nums) {

		int max = 0, mask = 0;
		for (int i = 31; i >= 0; i--) {
			mask = mask | (1 << i);
			Set<Integer> set = new HashSet<>();
			for (int num : nums) {
				set.add(num & mask);
			}
			int tmp = max | (1 << i);
			for (int prefix : set) {
				if (set.contains(tmp ^ prefix)) {
					max = tmp;
					break;
				}
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int nums[] = { 3, 10, 5, 25, 2, 8 };
		System.out.println(maxXor(nums));

	}
}
