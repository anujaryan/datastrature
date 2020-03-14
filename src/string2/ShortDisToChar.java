package string2;

import java.util.Arrays;

/**
 * @author Anuj Pachauri
 *
5:22:57 pm
 */
public class ShortDisToChar {

	public static int[] shortestToChar(String S, char c) {


		int N = S.length();

		int[] ans = new int[N];

		int prev = Integer.MIN_VALUE / 2;

		for (int i = 0; i < N; i++) {

			if (S.charAt(i) == c) {
				prev = i;
			}

			ans[i] = i - prev;
		}

		prev = Integer.MAX_VALUE / 2;

		for (int i = N - 1; i >= 0; --i) {

			if (S.charAt(i) == c)
				prev = i;
			ans[i] = Math.min(ans[i], prev - i);

		}

		return ans;

	}

	public static void main(String[] args) {
		String S = "anuj";
		char c = 'j';
		Arrays.stream(shortestToChar(S, c)).forEach(x -> System.out.println(x));
	}
}
