/**
31-Aug-2019
Anuj Pachauri

 * 
 */
package backtracking;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Anuj Pachauri
 *
 *         1:35:26 pm
 */
public class AddAndSearchWord {

	TrieNode root = new TrieNode();
	Map<String, Boolean> wordsmap = new HashMap<>();

	public static void main(String[] args) {

		AddAndSearchWord data = new AddAndSearchWord();
		data.addWord("anuj");
		data.addWord("pachauri");
		data.addWord("bad");
		data.addWord("pad");

		System.out.println("Search result .." + data.search(".ad"));

	}

	// add a word into the data structure

	public void addWord(String word) {

		if (wordsmap.containsKey(word) && wordsmap.get(word))
			return;

		TrieNode temp = root;

		for (int i = 0; i < word.length(); i++) {

			char c = word.charAt(i);

			if (temp.children[c - 'a'] == null)
				temp.children[c - 'a'] = new TrieNode();

			temp = temp.children[c - 'a'];

		}
		temp.isEnd = true;
		wordsmap.put(word, true);

	}

	public boolean search(String word) {

		if (wordsmap.containsKey(word))
			return wordsmap.get(word);

		return dfs(word, 0, root);

	}

	/**
	 * @param word
	 * @param i
	 * @param root2
	 * @return
	 */
	private boolean dfs(String word, int index, TrieNode temp) {

		if (temp == null)
			return false;

		char c = word.charAt(index);

		if (index == word.length() - 1) {
			if (c != '.')
				return temp.children[c - 'a'] != null && temp.children[c - 'a'].isEnd;
			else {
				for (int i = 0; i < 26; i++) {
					if (temp.children[i] != null && temp.children[i].isEnd)
						return true;
				}
				return false;
			}

		}

		if (c != '.') {
			if (temp.children[c - 'a'] == null)
				return false;
			return dfs(word, index + 1, temp.children[c - 'a']);
		} else {
			for (int i = 0; i < 26; i++) {
				if (temp.children[i] == null)
					continue;
				if (dfs(word, index + 1, temp.children[i]))
					return true;
			}
		}

		return false;
	}

}

class TrieNode {

	boolean isEnd;
	TrieNode[] children;

	public TrieNode() {
		children = new TrieNode[26];
		isEnd = false;
	}

}