package array2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Anuj Pachauri
 *
 *         1:18:20 am
 */
public class PositionOfLargeGroups {

	public static List<List<Integer>> findLargestGroup(String str) {
		List<List<Integer>> mainlist = new ArrayList<>();
		char[] arr = str.toCharArray();

		Arrays.sort(arr);
		int startIndex = 0;
		int endIndex = 0;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (char ch : arr) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}

		for (Character ch : map.keySet()) {
			int freq = map.get(ch);
			if (freq >= 3) {
				List<Integer> list = new ArrayList<>();
				startIndex = str.indexOf(ch);
				list.add(startIndex);
				endIndex = startIndex + (freq - 1);
				list.add(endIndex);
				mainlist.add(list);

			}
		}

		return mainlist;
	}

	public static void main(String[] args) {

		String str = "abbxxxxzzy";
		List<List<Integer>> mainlist = findLargestGroup(str);
		System.out.println(mainlist.size());

	}

}
