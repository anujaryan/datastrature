/**
24-Aug-2019
Anuj Pachauri

 * 
 */
package array;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Anuj Pachauri
 *
 *         8:46:32 pm
 */
public class ArrayInter2 {

	public static int[] intersection(int nums1[], int nums2[]) {

		if (nums1.length == 0 || nums2.length == 0) {
			int emp[] = new int[0];
			return emp;
		}

		Map<Integer, Integer> map = new HashMap<>();

		for (int num : nums1) {

			map.put(num, map.getOrDefault(num, 0) + 1);
		}

		int k = 0;
		for (int num : nums2) {

			if (map.containsKey(num) && map.get(num) > 0) {
				nums1[k] = num;
				k++;

			}
			map.put(num, map.getOrDefault(num, 0) - 1);

		}

		int num[] = new int[k];

		for (int i = 0; i < k; i++) {
			num[i] = nums1[i];
		}

		return num;
	}

	public static void main(String[] args) {

		int nums1[] = { 4, 9, 5 };
		int nums2[] = { 9, 4, 9, 8, 4 };
		int nums3[] = { 1, 2, 2, 1 };
		int nums4[] = { 2, 2 };
		nums1 = intersection(nums1, nums2);
		nums3 = intersection(nums3, nums4);

		for (int i : nums1) {
			System.out.println("Intersection Points : " + i);
		}

		for (int i : nums3) {
			System.out.println("Intersection Points : " + i);
		}

	}
}
