/**
03-Sep-2019
Anuj Pachauri

 * 
 */
package string;

/**
 * @author Anuj Pachauri
 *
 *         11:20:05 pm
 */
public class GcdString {

	public static String gcdOfString(String str1, String str2) {
		// Check whether either input string contains the other and initialize which is
		// bigger or smaller
		String bigger = str1.contains(str2.subSequence(0, str2.length())) ? str1
				: str2.contains(str1.subSequence(0, str1.length())) ? str2 : null;
		String smaller = str1.contains(str2.subSequence(0, str2.length())) ? str2
				: str2.contains(str1.subSequence(0, str1.length())) ? str1 : null;

		// Return an empty GCD if any input string is null or empty, or if neither
		// contains the other;
		if (bigger == null || smaller == null || str1 == null || str2 == null || str1.equals("") || str2.equals("")) {
			return "";
		}
		// Initialize remainder
		String remainder = getRemainder(bigger, smaller);

		// Keep repeating Steps 1 and 2 until remainder becomes empty
		while (!remainder.equals("")) {
			bigger = smaller;
			smaller = remainder;
			remainder = getRemainder(bigger, smaller);
		}
		// Once the remainder is empty, the smaller string in the last iteration was the
		// GCD
		return smaller;
	}

	public static String getRemainder(String bigger, String smaller) {
		int smallerIndex = bigger.indexOf(smaller);
		int smallerSize = smaller.length();
		while (smallerIndex == 0) {
			bigger = bigger.substring(smallerSize);
			smallerIndex = bigger.indexOf(smaller);
		}
		return bigger;
	}

	public static void main(String str[]) {

		// String str1 = "ABCABC", str2 = "ABC";
		String str1 = "ABABAB", str2 = "ABAB";
		// String str1 = "LEET", str2 = "CODE";
		System.out.println("Gcd is : " + gcdOfString(str1, str2));
	}
}
