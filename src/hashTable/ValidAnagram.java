package hashTable;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Anuj Pachauri
 *
 *         7:46:00 pm
 */
public class ValidAnagram {

	public static boolean isValidAnagram(String s, String t) {

		if (s.length() != t.length())
			return false;

		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			map.merge(c, 1, Integer::sum);

		}

		for (int i = 0; i < t.length(); i++) {
			char c = t.charAt(i);
			if (!map.containsKey(c) || map.get(c) == 0) {
				return false;
			}

			map.merge(c, -1, Integer::sum);

		}

		return true;
	}

	public static boolean isValidAnagram1(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			map.put(c, map.getOrDefault(c, 0) + 1);

		}
		for (int i = 0; i < t.length(); i++) {
			char c = t.charAt(i);
			if (!map.containsKey(c) || map.get(c) == 0) {
				return false;
			} else {
				map.put(c, map.get(c) - 1);

			}

		}

		return true;

	}

	public static void main(String[] args) {
		String s = "anagram", t = "nagaram";
		String s1 = "rat", t1 = "cat";
		System.out.println(isValidAnagram(s, t));
		System.out.println(isValidAnagram(s1, t1));
	}
}
