package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Anuj Pachauri
 *
11:24:02 pm
 */
public class BigramOccurence {

	public static String[] findocurrences(String text, String first, String second) {

		List<String> list = new ArrayList<>();

		String[] arrtext = text.split("\\s");

		for (int i = 0; i < arrtext.length - 2; i++) {

			if (arrtext[i].equals(first) && arrtext[i + 1].equals(second)) {
				list.add(arrtext[i + 2]);
			}
		}

		return list.toArray(new String[list.size()]);
	}

	public static void main(String[] args) {
		String text = "alice", first = "a", second = "good";
		Arrays.stream(findocurrences(text, first, second)).forEach(x -> System.out.println(x + " "));
	}
}
