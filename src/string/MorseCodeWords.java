package string;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Anuj Pachauri
 *
9:37:22 pm
 */
public class MorseCodeWords {

	static String[] morseCode = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
			"--",
			"-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };

	public static int uniqueMorseCode(String[] words) {

		Set<String> set = new HashSet<>();

		for (String str : words) {
			String rs = "";
			char[] ch = str.toCharArray();

			for (char c : ch) {
				int i = c - 'a';
				rs += morseCode[i];
			}
			set.add(rs);

		}
		return set.size();

	}

	public static void main(String[] args) {
		String[] words = { "gin", "zen", "gig", "msg" };
		System.out.println(uniqueMorseCode(words));
	}
}
