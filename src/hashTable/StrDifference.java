package hashTable;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Anuj Pachauri
 *
 *         1:10:42 am
 */
public class StrDifference {

	public static char findDifferent(String s, String t) {

		char c = ' ';

		Map<Character, Integer> hmap = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			hmap.put(ch, hmap.getOrDefault(ch, 0) + 1);
		}
		for (int i = 0; i < t.length(); i++) {
			char ch = t.charAt(i);
			if (hmap.containsKey(ch) && hmap.get(ch) != 0) {
				hmap.put(ch, hmap.get(ch) - 1);

			} else {
				c = ch;
			}
		}
		return c;
	}

	public static void main(String[] args) {
		String s = "abcd", t = "abcde";
		String s1 = "a", t1 = "aa";

		System.out.println(findDifferent(s, t));
		System.out.println(findDifferent(s1, t1));
	}

}
