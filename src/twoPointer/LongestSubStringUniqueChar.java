package twoPointer;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Anuj Pachauri
 *
 *         12:01:34 pm
 */
public class LongestSubStringUniqueChar {

	public static int longestSubStringUniqueChar(String s) {

		int len = s.length();
		int i = 0, j = 0;
		char[] sarr = s.toCharArray();
		Set<Character> set = new HashSet<>();
		int ans = Integer.MIN_VALUE;

		while (j < len) {

			if (!set.contains(sarr[j])) {
				set.add(sarr[j]);
				ans = Math.max(ans, j - i);
			} else {
				while (sarr[i] != sarr[j]) {
					set.remove(sarr[i]);
					i += 1;
				}
				i += 1;
			}
			j++;

		}

		if (ans != Integer.MIN_VALUE) {
			return ans + 1;
		} else {
			return 0;
		}

	}

	public static void main(String str[]) {
		String s = "abcabcbb";
		String s1 = "bbbbb";
		String s2 = "pwwkew";
		System.out.println("Longest SubString :" + longestSubStringUniqueChar(s));
		System.out.println("Longest SubString :" + longestSubStringUniqueChar(s1));
		System.out.println("Longest SubString :" + longestSubStringUniqueChar(s2));
	}
}
