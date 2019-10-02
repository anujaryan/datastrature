package string;

/**
 * @author Anuj Pachauri
 *
 *         1:37:56 am
 */
public class ReverseWords {

	public static String reverseWords(String s) {
		// s = s.trim();
		s = s.replaceAll(" +", " ");

		String[] str = s.split("\\s");

		StringBuilder sb = new StringBuilder();

		for (int i = str.length - 1; i >= 0; i--) {
			String sbr = str[i].trim();
			if (i == 0)
				sb.append(sbr);
			else
				sb.append(sbr + " ");

		}

		return sb.toString();

	}

	public static void main(String[] args) {

		String words = "the sky is blue";

		String words1 = "  hello world!  ";

		String words2 = "a good   example";
		System.out.println(reverseWords(words));

		System.out.println(reverseWords(words1));

		System.out.println(reverseWords(words2));
	}
}
