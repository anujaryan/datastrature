package hashTable;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Anuj Pachauri
 *
 *         12:36:21 am
 */
public class CowAndBulls {

	public static String getHint(String secret, String guess) {

		int count1 = 0, count2 = 0;
		Map<Character, Integer> hmap = new HashMap<>();

		for (int i = 0; i < secret.length(); i++) {
			char c = secret.charAt(i);
			hmap.put(c, hmap.getOrDefault(c, 0) + 1);
		}

		for (int i = 0; i < guess.length(); i++) {

			if (secret.charAt(i) == guess.charAt(i)) {
				count1++; // count bulls
				hmap.put(secret.charAt(i), hmap.get(secret.charAt(i)) - 1);
			}

		}

		for (int i = 0; i < guess.length(); i++) {

			if (secret.charAt(i) != guess.charAt(i) && hmap.containsKey(guess.charAt(i))
					&& hmap.get(guess.charAt(i)) != 0) {

				count2++;
				hmap.put(guess.charAt(i), hmap.get(guess.charAt(i)) - 1);

			}
		}

		StringBuilder sb = new StringBuilder();
		sb.append(count1);
		sb.append("A");
		sb.append(count2);
		sb.append("B");

		return sb.toString();

	}

	public static void main(String[] args) {
		String secret = "1807", guess = "7810";
		System.out.println("Bulls and Cows : " + getHint(secret, guess));
	}
}
