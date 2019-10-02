package array2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Anuj Pachauri
 *
 *         10:57:10 pm
 */
public class FairCandySwap {

	public static int[] fairCandySwap(int[] A, int[] B) {

		int sa = 0;
		int sb = 0;
		for (int i : A) {
			sa += i;

		}

		for (int i : B) {
			sb += i;
		}

		int delta = (sb - sa) / 2;

		Set<Integer> setb = new HashSet<>();

		for (int i : B) {
			setb.add(i);
		}

		for (int i : A) {
			if (setb.contains(i + delta)) {
				return new int[] { i, i + delta };
			}

		}

		return null;

	}

	public static void main(String[] args) {
		int[] A = { 1, 1 }, B = { 2, 2 };
		System.out.println(Arrays.toString(fairCandySwap(A, B)));
	}
}
