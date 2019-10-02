/**
02-Sep-2019
Anuj Pachauri

 * 
 */
package string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Anuj Pachauri
 *
 *         11:10:58 pm
 */
public class SmallestCharFrequency {

	public static int frequencyCount(String str) {

		char[] arrA = str.toCharArray();

		char smallestchr = 'z';
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < arrA.length; i++) {

			if (arrA[i] < smallestchr) {
				smallestchr = arrA[i];
			}
			map.put(arrA[i], map.getOrDefault(arrA[i], 0) + 1);

		}

		return map.get(smallestchr);
	}

	public static int[] numSmallerByFrequency(String[] queries, String[] words) {
		int ans[] = new int[queries.length];
		for (int i = 0; i < queries.length; i++) {
			int count = 0;

			int querywordfrequ = frequencyCount(queries[i]);

			for (int j = 0; j < words.length; j++) {

				int wordCount = frequencyCount(words[j]);
				if (querywordfrequ < wordCount) {
					count++;
				}

			}
			ans[i] = count;

		}

		return ans;
	}

	public static void main(String[] args) {

		// String queries[] = { "cbd" }, words[] = { "zaaaz" };
		String s = "dcce";

		String queries[] = { "bbb", "cc" }, words[] = { "a", "aa", "aaa", "aaaa" };

		// System.out.println("Smallest character frequency.. " + frequencyCount(s));

		int ans[] = numSmallerByFrequency(queries, words);
		Arrays.stream(ans).forEach(x -> System.out.println(x));
	}
}
