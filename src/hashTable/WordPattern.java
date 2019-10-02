package hashTable;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Anuj Pachauri
 *
 *         8:43:29 pm
 */
public class WordPattern {

	public static boolean isValidPattern(String pattern, String str) {

		String[] words = str.split(" ");
		if (words.length != pattern.length())
			return false;

		Map<Character, String> char2word = new HashMap<>();
		Map<String, Character> word2char = new HashMap<>();
		for (int i = 0; i < pattern.length(); i++) {
			char c = pattern.charAt(i);

			if (char2word.containsKey(c) && !char2word.get(c).equals(words[i])) {
				return false;
			} else if (word2char.containsKey(words[i]) && c != word2char.get(words[i])) {
				return false;
			}

			char2word.put(c, words[i]);
			word2char.put(words[i], c);
		}

		return true;
	}

	public static void main(String[] args) {
		String pattern = "abba", str = "dog cat cat dog";// true
		String pattern1 = "abba", str1 = "dog cat cat fish"; // false
		String pattern2 = "aaaa", str2 = "dog cat cat dog"; // false

		System.out.println(isValidPattern(pattern, str));

		System.out.println(isValidPattern(pattern1, str1));

		System.out.println(isValidPattern(pattern2, str2));
	}
}
