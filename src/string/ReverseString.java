package string;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// keep this function call here
		Scanner s = new Scanner(System.in);
		System.out.print(FirstReverse(s.nextLine()));
	}

	private static String FirstReverse(String nextLine) {
		// TODO Auto-generated method stub

		StringBuffer sb = new StringBuffer(nextLine);

		String str = sb.reverse().toString();

		return str;
	}
}
