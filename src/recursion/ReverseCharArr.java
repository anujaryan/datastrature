package recursion;

/**
 * @author Anuj Pachauri
 *
 *         11:04:36 pm
 */
public class ReverseCharArr {

	public static void reverseString(char[] s) {

		int len = s.length;
		if (len == 0)
			return;

		for (int i = 0; i < s.length / 2; i++) {

			char temp = s[i];
			s[i] = s[len - i - 1];
			s[len - i - 1] = temp;
		}

		for (int i = 0; i < s.length; i++) {

			System.out.print(s[i] + " ");
		}

	}

	public static void main(String[] args) {

		String str = "Hello";
		char[] s = str.toCharArray();
		reverseString(s);

	}
}
