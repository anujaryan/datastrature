/**
11-Aug-2019
Anuj Pachauri

 * 
 */
package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import timeandmemoryutil.TimeUtils;

/**
 * @author Anuj Pachauri
 *
 *         5:15:46 pm
 */
public class AllMajorityElement {

	private static List<Integer> majorityElements(int nums[]) {
		long start = TimeUtils.beforeStartTime();
		int mark = nums.length / 3;

		List<Integer> list = new ArrayList<>();

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i : nums) {

			if (list.contains(i)) {
				continue;
			}

			int count = map.getOrDefault(i, 0);
			count++;

			if (count > mark) {
				list.add(i);
				continue;
			}
			map.put(i, count);

		}

		long end = TimeUtils.afterEndTime();

		System.out.println("Time Taken in ms : " + (end - start) + " ms ");
		return list;
	}

	public static void main(String[] args) {

		int arr[] = { 1, 1, 1, 3, 3, 2, 2, 2 };
		int arr1[] = { 3, 2, 3 };

		List<Integer> list = majorityElements(arr1);

		list.stream().forEach(x -> System.out.println(x));

	}

}
