/**
24-Aug-2019
Anuj Pachauri

 * 
 */
package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Anuj Pachauri
 *
 *         7:09:18 pm
 */
public class MisMatch {

	public static int[] MisMatchErrorData(int nums[]) {
		int n = nums.length;
		int nsum = n * (n + 1) / 2;
		Set<Integer> set = new HashSet<Integer>();
		int dup = 0;
		for (int i : nums) {
			if (!set.add(i)) {
				dup = i;
				break;
			}
		}

		int arrsum = 0;
		for (int i : nums) {
			arrsum += i;
		}
		arrsum -= dup;
		int misnum = nsum - arrsum;
		int num[] = { dup, misnum };
		return num;

	}

	public static void main(String[] args) {

		int nums[] = { 1, 2, 2, 4 };
		nums = MisMatchErrorData(nums);
		Arrays.stream(nums).forEach(num -> System.out.println(num));

	}
}
