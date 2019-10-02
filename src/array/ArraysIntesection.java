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
 *         7:29:07 pm
 */
public class ArraysIntesection {

	public static int[] intersection(int nums1[], int nums2[]) {

		if (nums1.length == 0 || nums2.length == 0) {
			int emp[] = new int[0];
			return emp;
		}
		Set<Integer> set = new HashSet<>();
		Set<Integer> resultset = new HashSet<Integer>();

		for (int num : nums1) {
			set.add(num);
		}

		for (int num : nums2) {

			if (set.contains(num)) {
				resultset.add(num);
			}
		}

		int result[] = new int[resultset.size()];
		int k = 0;
		for (int i : resultset) {
			result[k++] = i;
		}

		return result;
	}

	public static void main(String str[]) {

		int nums1[] = { 1, 2, 2, 1 }, nums2[] = { 2, 2 };
		int nums3[] = { 4, 9, 5 }, nums4[] = { 9, 4, 9, 8, 4 };
		int nums5[] = {}, nums6[] = { 9, 4, 9, 8, 4 };

		nums1 = intersection(nums1, nums2);
		nums3 = intersection(nums3, nums4);
		nums5 = intersection(nums5, nums6);
		for (int i : nums1) {
			System.out.println("Intersection Points : " + i);
		}
		for (int i : nums3) {
			System.out.println("Intersection Points : " + i);
		}

		for (int i : nums5) {
			System.out.println("Intersection Points : " + i);
		}
	}
}
