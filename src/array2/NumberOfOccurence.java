package array2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author Anuj Pachauri
 *
12:08:20 am
 */
public class NumberOfOccurence {

	public static boolean uniqueOccurences(int nums[]) {

		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
		}

		Set<Integer> set = new HashSet<>();
		for (int key : map.keySet()) {

			if (!set.add(map.get(key))) {
				return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {
		int nums[] = { 1, 2, 2, 1, 1, 3 };
		System.out.println(uniqueOccurences(nums));
		System.out.println(uniqueOccurencesII(nums));
	}

	public static boolean uniqueOccurencesII(int nums[]) {

		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
		}

		return map.size() == new HashSet<>(map.values()).size();

	}
}
