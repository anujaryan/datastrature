package string;

import java.util.HashSet;
import java.util.Set;

public class UniqueCharInString {

	public static void main(String[] args) {

		String str = "anujp";

		// checkUnique(str);
		System.out.println(" String is unique is : " + checkUnique2(str));
	}

	private static void checkUnique(String str) {

		Set<Character> set = new HashSet<>();

		char[] chr = str.toCharArray();

		for (char a : chr) {

			if (set.add(a)) {

			} else {
				System.out.println("String is not unique");
				return;
			}
		}
		System.out.println("String is unique");
	}

	// take o(n) and time and space complexity..
	private static boolean checkUnique2(String str) {

		boolean[] char_set = new boolean[256];

		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			// System.out.println(val);
			if (char_set[val])
				return false;
			char_set[val] = true;
		}
		return true;
	}

}
