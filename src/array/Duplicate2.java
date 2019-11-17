package array;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Anuj Pachauri
 *
 *         2:00:41 am
 */
public class Duplicate2 {

	// Brute force approach..
	public static boolean isContainNearByDuplicate(int arr[], int k) {

		int len = arr.length;

		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {

				if (arr[i] == arr[j]) {

					int result = Math.abs(i - j);
					if (result <= k) {
						return true;

					}

				}
			}
		}

		return false;
	}

	public static void main(String[] args) {

		// Input: nums = [1,2,3,1], k = 3
		// Output: true
		int[] nums = { 1, 2, 3, 1 };
		int k = 3;
		System.out.println(isContainNearByDuplicate(nums, k));

		// Input: nums = [1,0,1,1], k = 1
		// Output: true
		int[] nums1 = { 1, 0, 1, 1 };
		int k1 = 1;

		System.out.println(isContainNearByDuplicate(nums1, k1));

		// Input: nums = [1,2,3,1,2,3], k = 2
		// Output: false
		int[] nums2 = { 1, 2, 3, 1, 2, 3 };
		int k2 = 2;

		System.out.println(isContainNearByDuplicate(nums2, k2));

		// optimum Soln....

		System.out.println(isContainNearByDuplicate1(nums, k));

		System.out.println(isContainNearByDuplicate1(nums1, k1));
		System.out.println(isContainNearByDuplicate1(nums2, k2));

	}

	// optimum solution

	public static boolean isContainNearByDuplicate1(int arr[], int k) {

		int len = arr.length;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < len; i++) {

			if (map.containsKey(arr[i])) {
				int result = Math.abs(map.get(arr[i]) - i);
				if (result <= k) {
					return true;
				} else {
					map.put(arr[i], i);
				}

			} else {
				map.put(arr[i], i);
			}

		}

		return false;
	}

}
