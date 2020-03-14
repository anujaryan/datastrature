package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Anuj Pachauri
 *
10:23:32 pm
 */
public class UnCommonWords {

	public static String[] unCommonFromSentences(String A, String B) {

		List<String> list = new ArrayList<>();
		Map<String, Integer> count = new HashMap<String, Integer>();
		String aStr[] = A.split("\\s");
		String bStr[] = B.split("\\s");
		for (String as : aStr) {
			count.put(as, count.getOrDefault(as, 0) + 1);
		}

		for (String bs : bStr) {
			count.put(bs, count.getOrDefault(bs, 0) + 1);
		}

		for (String string : count.keySet()) {

			if (count.get(string) == 1) {

				list.add(string);
			}

		}

		return list.toArray(new String[list.size()]);

	}

	public static void main(String[] args) {

		String A = "this apple is sweet";
		String B = "this apple is sour";

		Arrays.stream(unCommonFromSentences(A, B)).forEach(System.out::println);

	}
}
