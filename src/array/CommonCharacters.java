/**
24-Aug-2019
Anuj Pachauri

 * 
 */
package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Anuj Pachauri
 *
 *         9:35:23 pm
 */
public class CommonCharacters {

	public static List<String> CommonChars(String[] A) {

		List<String> result = new ArrayList<>();

		Map<Character, Integer> main = new HashMap<>();

		for (Character c : A[0].toCharArray()) {

			main.put(c, main.getOrDefault(c, 0) + 1);

		}

		for (int i = 1; i < A.length; i++) {

			Map<Character, Integer> temp = new HashMap<>();
			for (int j = 0; j < A[i].length(); j++) {

				char c = A[i].charAt(j);
				if (main.containsKey(c)) {
					temp.put(c, Math.min(main.get(c), temp.getOrDefault(c, 0) + 1));
				}

			}
			main = temp;

		}
		for (Character c : main.keySet()) {

			for (int i = 0; i < main.get(c); i++) {
				result.add(c + " ");
			}

		}

		return result;
	}

	public static void main(String[] args) {

		String A[] = { "bella", "label", "roller" };
		List<String> common = CommonChars(A);
		common.stream().forEach(item -> System.out.println(item));

	}
}
