/**
11-Aug-2019
Anuj Pachauri

 * 
 */
package array;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Anuj Pachauri
 *
 *         6:05:11 pm
 */
public class UniqueElements {
	public static boolean containsDuplicate(int[] nums) {
		boolean isdisntict = false;
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {

			if (set.add(nums[i])) {
				continue;
			} else {
				isdisntict = true;
			}
		}
		return isdisntict;
	}

	public static void main(String[] args) {
		int nums[] = { 3, 3 };

		System.out.println(containsDuplicate(nums));
	}
}
