package math;

/**
 * @author Anuj Pachauri
 *
1:44:31 am
 */
public class BinaryGap {

	public int binaryGap(int n) {

		int A[] = new int[32];
		int t = 0;
		for (int i = 0; i < A.length; i++) {
			if (((n >> i) & 1) != 0) {
				A[t++] = i;
			}
		}
		int ans = 0;

		for (int i = 0; i < t - 1; i++) {

			ans = Math.max(ans, A[i + 1] - A[i]);
		}


		return ans;
	}
}
