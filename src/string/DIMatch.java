package string;

import java.util.Arrays;

/**
 * @author Anuj Pachauri
 *
3:43:27 pm
 */

//Time Complexity: O(N)O(N), where NN is the length of S.

//Space Complexity: O(N)O(N).
public class DIMatch {

	public static int[] diMatchString(String S) {
		int N = S.length();
		int a[] = new int[N];
		int low = 0, high = N;

		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == 'I') {
				a[i] = low++;
			} else {
				a[i] = high--;
			}

		}

		return a;
	}

	public static void main(String[] args) {

		String S = "IDID";
		Arrays.stream(diMatchString(S)).forEach(System.out::println);
	}
}
