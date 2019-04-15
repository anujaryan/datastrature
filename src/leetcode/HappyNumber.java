package leetcode;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

	public static boolean isHappyNumber(int n) {

		Set<Integer> set = new HashSet<>();

		set.add(n);
		while (n != 1) {

			int result = 0;

			while (n != 0) {
				result += Math.pow(n % 10, 2);
				n = n / 10;
			}

			if (set.contains(result))
				return false;
			set.add(result);
			n = result;

		}
		return true;

	}

	public static void main(String[] args) {
		int n = 21;
		System.out.println("Happy Number is :" + isHappyNumber(n));
	}
}
