package string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author Anuj Pachauri
 *
 *         7:26:38 pm
 */
public class MostCommonWord {

	public static String mostCommonWord(String paragraph, String[] banned) {

		paragraph += ".";

		Set<String> banset = new HashSet<>();

		for (String s : banned) {
			if (banset.add(s)) {

			}
		}

		StringBuilder word = new StringBuilder();
		String ans = "";
		int ansfreq = 0;

		Map<String, Integer> map = new HashMap<>();
		for (char c : paragraph.toCharArray()) {
			if (Character.isLetter(c)) {
				word.append(Character.toLowerCase(c));
			} else if (word.length() > 0) {
				String finalword = word.toString();

				if (!banset.contains(finalword)) {
					map.put(finalword, map.getOrDefault(finalword, 0) + 1);

					if (map.get(finalword) > ansfreq) {
						ans = finalword;
						ansfreq = map.get(finalword);
					}
				}

				word = new StringBuilder();
			}

		}

		return ans;
	}

	public static void main(String[] args) {
		String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
		String[] banned = { "hit" };
		System.out.println(mostCommonWord(paragraph, banned));
	}
}
