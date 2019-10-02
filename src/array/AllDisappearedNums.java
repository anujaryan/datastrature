/**
10-Aug-2019
Dell

 * 
 */
package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Dell
 *
 *         5:53:12 pm
 */
public class AllDisappearedNums {

	public static void main(String[] args) {

		int nums[] = { 4, 3, 2, 7, 8, 2, 3, 1 };

		List<Integer> numsDisApps = findDisAppearedNumbers(nums);

		numsDisApps.stream().forEach(x -> System.out.println(x + " "));

	}

	/**
	 * @param nums
	 * @return
	 */
	private static List<Integer> findDisAppearedNumbers(int[] nums) {

		long beforeUseMem = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

		System.out.println("Before Use Mem : " + beforeUseMem);
		long start = System.currentTimeMillis();

		int len = nums.length;

		Set<Integer> set = new TreeSet<>();

		for (int num : nums) {

			if (set.contains(num)) {
				continue;
			} else {
				set.add(num);
			}

		}

		List<Integer> list = new ArrayList<Integer>();

		for (int i = 1; i <= len; i++) {
			if (set.remove(i)) {
				continue;
			} else {
				list.add(i);
			}
		}
		long end = System.currentTimeMillis();

		System.out.println("Counting to MilliSeconds : " + (end - start) + " ms");
		long afterUsedMem = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		System.out.println(afterUsedMem);
		long totalMemoryUsed = afterUsedMem - beforeUseMem;
		System.out.println("Memory used by Program is : " + totalMemoryUsed);

		return list;
	}
}
