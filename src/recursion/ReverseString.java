package recursion;

/**
 * @author Anuj Pachauri
 *
 *         2:18:39 pm
 */
public class ReverseString {

	public static String reverseString(String name) {

		if (name.length() == 0 || name == null) {
			return "";
		}

		return name.charAt(name.length() - 1) + reverseString(name.substring(0, name.length() - 1));
	}

	public static void main(String[] args) {

		String name = "anuj";
		System.out.println(reverseString(name));
	}

	public static void reverseCharArr(char[] s) {

		if (s.length == 0 || s == null) {
			return;
		}

		// reverseCharArr(s + 1);

	}

}
