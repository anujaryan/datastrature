package leetcode;

public class CountAndSay {

	public static String CountSay(int n) {

		if (n == 1)
			return "1";

		StringBuilder res = new StringBuilder();

		String str = CountSay(n - 1) + "0";

		for (int i = 0, c = 1; i < str.length() - 1; i++, c++) {

			if (str.charAt(i + 1) != str.charAt(i)) {
				res.append(c).append(str.charAt(i));
				c = 0;
			}
		}

		return res.toString();
	}

	public static void main(String str[]) {

		int n = 4;
		System.out.println("CountSay of 4 is :" + CountSay(n));

	}

}
