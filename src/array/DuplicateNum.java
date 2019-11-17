/**
24-Aug-2019
Anuj Pachauri

 * 
 */
package array;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Anuj Pachauri
 *
 *         6:53:41 pm
 */
public class DuplicateNum {

	public static int findDuplicate(int[] nums) {

		Set<Integer> set = new HashSet<Integer>();

		for (int i : nums) {

			if (!set.add(i)) {
				return i;
			}

		}

		return 0;
	}

	public static void main(String[] args) {
		int nums[] = { 1, 3, 4, 2, 2 };
		int[] nums1 = { 3, 1, 3, 4, 2 };

		System.out.println("Duplicate exist .." + findDuplicate(nums));
		System.out.println("Duplicate exist .." + findDuplicate(nums1));
	}
}
