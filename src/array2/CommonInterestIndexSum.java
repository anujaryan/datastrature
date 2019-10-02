package array2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Anuj Pachauri
 *
2:48:44 am
 */
public class CommonInterestIndexSum {

	public static String[] findRestraurant(String[] list1, String[] list2) {

		Map<Integer, List<String>> map = new HashMap<Integer, List<String>>();
		for (int i = 0; i < list1.length; i++) {
			for (int j = 0; j < list2.length; j++) {

				if (list1[i].equals(list2[j])) {
					int sum=i+j;
					if (!map.containsKey(sum)) 
						map.put(sum, new ArrayList<>());
					map.get(sum).add(list1[i]);
					
				}
			}
		}
		int min_index = Integer.MAX_VALUE;
		for ( Integer i : map.keySet()) {
			if (i < min_index) {
				min_index = i;
			}
		}

		List<String> res = map.get(min_index);
		String[] resp = new String[res.size()];
		return res.toArray(resp);
	}

	public static void main(String[] args) {

		String list1[] = { "Shogun", "Tapioca Express", "Burger King", "KFC" };
		String list2[] = { "Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun" };

		String list3[] = { "Shogun", "Tapioca Express", "Burger King", "KFC" };
		String list4[] = { "KFC", "Shogun", "Burger King" };

		Arrays.stream(findRestraurant(list1, list2)).forEach(s -> System.out.println(s));
		Arrays.stream(findRestraurant(list3, list4)).forEach(s -> System.out.println(s));
	}
}
