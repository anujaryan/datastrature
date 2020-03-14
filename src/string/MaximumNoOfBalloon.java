package string;

/**
 * @author Anuj Pachauri
 *
12:31:24 am
 */
public class MaximumNoOfBalloon {

	public static void main(String[] args) {
		String text = "nlaebolko";
		System.out.println(maxNumberOfBalloon(text));
	}

	/**
	 * @param text
	 * @return
	 */
	private static int maxNumberOfBalloon(String text) {

		char[] freq = new char[26];
		for (char c : text.toCharArray()) {

			freq[c - 'a']++;
		}

		int res = Integer.MAX_VALUE;

		res = Math.min(res, freq['b' - 'a']);
		res = Math.min(res, freq['a' - 'a']);
		res = Math.min(res, freq['l' - 'a'] / 2);
		res = Math.min(res, freq['o' - 'a'] / 2);
		res = Math.min(res, freq['n' - 'a']);

		return res;


	}
}
