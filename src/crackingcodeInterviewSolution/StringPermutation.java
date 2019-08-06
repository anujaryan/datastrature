/**
12-May-2019
anuj

 * 
 */
package crackingcodeInterviewSolution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author anuj
 *
 *         5:59:53 PM
 */
public class StringPermutation {

	// time complexity O(n) since there are n! permutation...
	public static List<String> getPerms(String str) {

		List<String> permutations = new ArrayList<String>();
		if (str == null) {
			return new ArrayList<>();
		} else if (str.length() == 0) { // base condition...
			permutations.add("");
			return permutations;

		}

		char first = str.charAt(0); // get character at Index 0

		String remainder = str.substring(1); // remove first character

		List<String> words = getPerms(remainder);

		for (String word : words) {

			for (int i = 0; i <= word.length(); i++) {

				permutations.add(insertCharAt(word, first, i));
			}
		}

		return permutations;

	}

	/**
	 * @param word
	 * @param first
	 * @param i
	 * @return
	 */
	private static String insertCharAt(String word, char first, int i) {

		String start = word.substring(0, i);
		String end = word.substring(i);

		return start + first + end;
	}

	public static void main(String args[]) {
		String str = "abc";
		String str1 = "anuj";
		String str2 = "sitaram";

		System.out.println("Permutation are...: " + Arrays.asList(getPerms(str)));
		System.out.println("Permutation are...: " + Arrays.asList(getPerms(str1)));
		System.out.println("Permutation are...: " + Arrays.asList(getPerms(str2).size()));
	}

}
