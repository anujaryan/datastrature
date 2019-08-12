package dailycoding;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {

	public static final int CHAR_RANGE = 128;

	public static String findLongestSubString(String str, int k) {

		// store longest substring boundaries
		int end = 0, begin = 0;
		// set to store distinct characterss in a window

		Set<Character> window = new HashSet<>();

		int[] freq = new int[CHAR_RANGE];

		for (int low = 0, high = 0; high < str.length(); high++) {

			window.add(str.charAt(high));

			freq[str.charAt(high)]++;

			// if win size more than k , remove characters form the left

			while (window.size() > k) {
				// if the frequency of leftmost character become 0 after
				// removing it in the window, remove it from set as will
				if (--freq[str.charAt(low)] == 0) {
					window.remove(str.charAt(low));
				}
				low++; // reduce window size

			}

			// update maximum window size if necessay
			if (end - begin < high - low) {
				end = high;
				begin = low;
			}

		}

		// return longest subString found at str[begin,end]
		return str.substring(begin, end + 1);

	}

	public static void main(String[] args) {

		String app = "aapap";
		int k = 2;

		System.out.println("Longest SubString is  : " + findLongestSubString(app, k));
	}
}
