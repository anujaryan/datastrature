/**
09-Aug-2019
Dell

 * 
 */
package string;

/**
 * @author Dell
 *
 *         10:17:35 pm
 */
public class AddString {

	public static void main(String[] args) {

		String s1 = "12";

		String s2 = "24";

		String s3 = "6913259244";

		String s4 = "71103343";

		String s5 = "98";
		String s6 = "9";

		System.out.println("Sum of String  :" + addStrings(s5, s6));
	}

	/**
	 * @param num1
	 * @param num2
	 * @return
	 */
	private static String addStrings(String num1, String num2) {

		StringBuilder sb = new StringBuilder();
		String big, small;

		if (num1.length() > num2.length()) {
			big = num1;
			small = num2;
		} else {
			big = num2;
			small = num1;
		}
		int i = big.length() - 1, j = small.length() - 1;
		int carry = 0, sum = 0;

		for (; j >= 0; i--, j--) {

			int a = big.charAt(i) - '0';

			int b = small.charAt(j) - '0';

			sum = a + b + carry;
			carry = sum / 10;
			sum = sum % 10;

			sb.append(sum);

		}

		while (i >= 0) {
			int a = big.charAt(i) - '0';
			sum = a + carry;
			carry = sum / 10;
			sum = sum % 10;
			sb.append(sum);
			i--;

		}

		if (carry != 0) {
			sb.append(carry);
		}

		return sb.reverse().toString();
	}
}
