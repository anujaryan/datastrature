package string;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Anuj Pachauri
 *
6:16:41 pm
 */
public class DeleteColumn {

	public static int minDeletionSize(String[] A) {

		int count = 0;
		int n = A.length;
		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < n - 1; i++) {
			char[] a_i = A[i].toCharArray();
			char[] a_i_1 = A[i + 1].toCharArray();
			for (int k = 0; k < a_i.length; k++) {
				if (a_i[k] > a_i_1[k] && set.add(k)) {
					++count;

				}
			}
			if (count == n) {
				break;
			}

		}
		return count;

	}

	public static void main(String[] args) {

		String A[] = { "egguij", "gjsnnk", "lstgon", "ztzrqv" };
		System.out.println(minDeletionSize(A));

	}

}
