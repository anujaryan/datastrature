package array2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Anuj Pachauri
 *
 *         4:32:25 pm
 */
public class KeyBoardRow {

	private static final String[] lines = { "QWERTYUIOP", "ASDFGHJKL", "ZXCVBNM" };

	public static String[] findWords(String[] words) {

		List<String> list = new ArrayList<String>();
		for (String word : words) {
			if (canBeWrittern(word)) {
				list.add(word);
			}

		}

		return list.toArray(new String[list.size()]);
	}

	/**
	 * @param word
	 * @return
	 */
	private static boolean canBeWrittern(String word) {
		word = word.toUpperCase();
		return canBeWrittern(word, 0) || canBeWrittern(word, 1) || canBeWrittern(word, 2);
	}

	/**
	 * @param word
	 * @param i
	 * @return
	 */
	private static boolean canBeWrittern(String word, int i) {

		for (char chr : word.toCharArray()) {
			if (lines[i].indexOf(chr) == -1) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		String[] words = { "Hello", "Alaska", "Dad", "Peace" };
		System.out.println(Arrays.deepToString(findWords(words)));
	}
}
