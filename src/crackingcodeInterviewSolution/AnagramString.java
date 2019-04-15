/**
 * 
 */
package crackingcodeInterviewSolution;

/**
 * @author anuj
 *
 *         11:23:33 AM
 */
public class AnagramString {

	public static boolean checkAnagram(String src, String targ) {

		if (src.length() != targ.length())
			return false;

		int[] letter = new int[255];

		int num_unique_chars = 0;
		int num_completed_t = 0;

		char[] s_array = src.toCharArray();

		for (char c : s_array) {

			if (letter[c] == 0)
				++num_unique_chars;
			++letter[c];

		}

		for (int i = 0; i < targ.length(); i++) {

			int c = targ.charAt(i);
			if (letter[c] == 0) {
				return false;
			}

			--letter[c];

			if (letter[c] == 0) {
				++num_completed_t;

				if (num_completed_t == num_unique_chars) {
					return i == targ.length() - 1;
				}
			}
		}

		return false;

	}

	public static void main(String[] args) {

		String src = "listen";
		String targ = "silent";

		System.out.println("Is Givern Strings are Anagram : " + checkAnagram(src, targ));

	}
}
