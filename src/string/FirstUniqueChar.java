/**
09-Aug-2019
Dell

 * 
 */
package string;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Dell
 *
 *         12:12:32 am
 */
public class FirstUniqueChar {

	private static int firstUniqueChar(String s) {

		Map<Character, Integer> map = new LinkedHashMap<>();

		Set<Character> set = new HashSet<>();

		for (int i = 0; i < s.length(); i++) {

			if (set.contains(s.charAt(i))) {

				if (map.containsKey(s.charAt(i)))
					map.remove(s.charAt(i));

			} else {
				set.add(s.charAt(i));
				map.put(s.charAt(i), i);
			}

		}

		return map.size() == 0 ? -1 : map.values().iterator().next();
	}

	public static void main(String str[]) {

		String s = "leetcode";

		System.out.println(" Unique Character index : " + firstUniqueChar(s));

	}
}
