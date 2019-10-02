package string;

/**
 * @author Anuj Pachauri
 *
 *         11:30:43 pm
 * 
 * 
 *         In an alien language, surprisingly they also use english lowercase
 *         letters, but possibly in a different order. The order of the alphabet
 *         is some permutation of lowercase letters.
 * 
 *         Given a sequence of words written in the alien language, and the
 *         order of the alphabet, return true if and only if the given words are
 *         sorted lexicographicaly in this alien language.
 * 
 *         Input: words = ["hello","leetcode"], order =
 *         "hlabcdefgijkmnopqrstuvwxyz" Output: true Explanation: As 'h' comes
 *         before 'l' in this language, then the sequence is sorted.
 */
public class AllienDictionary {

	public static boolean isAllienSorted(String[] words, String order) {

		int[] index = new int[26];

		for (int i = 0; i < order.length(); i++) {
			index[order.charAt(i) - 'a'] = i;

		}

		search: for (int i = 0; i < words.length - 1; i++) {
			String word1 = words[i];
			String word2 = words[i + 1];

			// find the first difference word1[k]!=word2[k]

			for (int j = 0; j < Math.min(word1.length(), word2.length()); j++) {

				if (word1.charAt(j) != word2.charAt(j)) {

					if (index[word1.charAt(j) - 'a'] > index[word2.charAt(j) - 'a']) {
						return false;
					}
					continue search;
				}

			}

			// if we did't find a first fifference, the words
			// are like ("app","apple")

			if (word1.length() > word2.length())
				return false;

		}
		return true;

	}

	public static void main(String[] args) {

		String[] words = { "hello", "leetcode" };
		String order = "hlabcdefgijkmnopqrstuvwxyz";
		System.out.println(isAllienSorted(words, order));
	}
}
