package array2;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Anuj Pachauri
 *
11:51:22 pm
 */
public class NrepeatedElement {

	public int repeatedNTimes(int A[]) {
		int len = A.length;
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < A.length; i++) {
			if (!set.add(A[i])) {
				return A[i];
			}
		}
		return 0;
	}

	public static void main(String[] args) {

	}
}
