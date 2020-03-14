package array2;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Anuj Pachauri
 *
11:39:06 pm
 */
public class NumbWithFrequency {

	public static void printNumberWithFrequency(int nums[]) {

		Map<Integer, Integer> map = new TreeMap<>(Collections.reverseOrder());
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
		}



	}
	public static void main(String[] args) {
		int nums[] = { 1, 1, 2, 2, 2, 3, 5, 5, 5, 8, 8, 8, 8, 8 };
		printNumberWithFrequency(nums);
	}
}
