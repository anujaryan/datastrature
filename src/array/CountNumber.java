/**
04-Aug-2019
Dell

 * 
 */
package array;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author Dell
 *
 *         9:13:56 pm
 */
public class CountNumber {

	public static void main(String[] args) {

		// =// MasterData.getUnSortedArrays();
		int nums[] = { 4, 5, 3, 4, 5, 2, 8 };

		countNumberWithSorting(nums);

	}

	/**
	 * @param nums
	 */
	private static void countNumberWithSorting(int[] nums) {

		Map<Integer, Integer> map = new TreeMap<>();

		int count = 1;

		for (int i = 0; i < nums.length; i++) {

			if (map.containsKey(nums[i])) {
				int val = map.get(nums[i]);
				val++;
				map.put(nums[i], val);

			} else {
				map.put(nums[i], count);
			}

		}

		Set<Integer> key = map.keySet();

		for (Integer num : key) {

			System.out.println(" Number and  Number Frequency.. " + num + " : " + map.get(num));
		}

	}

}
